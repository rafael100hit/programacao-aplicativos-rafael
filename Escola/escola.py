# =========================================================
# SISTEMA DE AGENDAMENTO ESCOLAR (VERSÃO 4.3 - NAVEGAÇÃO COMPLETA)
# =========================================================

import json
import os
from dataclasses import dataclass, asdict, field
from typing import Dict, List

DATA_DIR = "dados"

# =============================
# MODELOS
# =============================

@dataclass
class Sala:
    predio: str
    numero: str
    funcao: str
    capacidade: int
    itens: List[str]
    agenda: Dict[str, str] = field(default_factory=dict)

@dataclass
class Disciplina:
    nome: str
    horas_total: int
    horas_usadas: int
    percentual_salas: Dict[str, int]
    professor: str

@dataclass
class Curso:
    nome: str
    turno: str
    disciplinas: Dict[str, Disciplina] = field(default_factory=dict)

@dataclass
class Professor:
    nome: str
    carga_total: int
    carga_usada: int = 0
    disciplinas: List[str] = field(default_factory=list)

# =============================
# SISTEMA
# =============================

class SistemaAgendamento:
    def __init__(self):
        os.makedirs(DATA_DIR, exist_ok=True)
        self.salas = self._carregar("salas.json")
        self.cursos = self._carregar("cursos.json")
        self.professores = self._carregar("professores.json")

        self.horarios = {
            "manha": ["SEG_08", "SEG_10", "TER_08", "TER_10", "QUA_08", "QUI_10"],
            "tarde": ["SEG_14", "SEG_16", "TER_14", "TER_16", "QUA_14", "QUI_16"],
            "noite": ["SEG_19", "SEG_21", "TER_19", "TER_21", "QUA_19", "QUI_21"],
        }

    # =============================
    # PERSISTÊNCIA
    # =============================

    def _carregar(self, arquivo):
        caminho = os.path.join(DATA_DIR, arquivo)
        if not os.path.exists(caminho):
            return {}
        with open(caminho, "r", encoding="utf-8") as f:
            return json.load(f)

    def _salvar(self, arquivo, dados):
        caminho = os.path.join(DATA_DIR, arquivo)
        with open(caminho, "w", encoding="utf-8") as f:
            json.dump(dados, f, indent=4, ensure_ascii=False)

    # =============================
    # FUNÇÕES AUXILIARES DE PAUSA
    # =============================

    def _pausa(self):
        print("0 - Voltar ao menu")
        input("Pressione ENTER ou 0 para voltar...")

    # =============================
    # CADASTROS
    # =============================

    def cadastrar_sala(self):
        while True:
            print("\n--- CADASTRAR SALA ---")
            print("0 - Voltar")
            predio = input("Prédio: ")
            if predio == '0': return
            numero = input("Número da sala: ")
            funcao = input("Função (comum/laboratorio/oficina/outros): ")
            capacidade = int(input("Capacidade: "))
            itens = [i.strip() for i in input("Itens (separados por vírgula): ").split(",")]
            codigo = f"{predio}-{numero}"
            self.salas[codigo] = asdict(Sala(predio, numero, funcao, capacidade, itens))
            self._salvar("salas.json", self.salas)
            print("✅ Sala cadastrada")
            self._pausa()

    def cadastrar_professor(self):
        while True:
            print("\n--- CADASTRAR PROFESSOR ---")
            print("0 - Voltar")
            nome = input("Nome do professor: ")
            if nome == '0': return
            carga = int(input("Carga horária total: "))
            self.professores[nome] = asdict(Professor(nome, carga))
            self._salvar("professores.json", self.professores)
            print("✅ Professor cadastrado")
            self._pausa()

    def cadastrar_curso(self):
        while True:
            print("\n--- CADASTRAR CURSO ---")
            print("0 - Voltar")
            nome = input("Nome do curso: ")
            if nome == '0': return
            turno = input("Turno (manha/tarde/noite): ")
            self.cursos[nome] = asdict(Curso(nome, turno))
            self._salvar("cursos.json", self.cursos)
            print("✅ Curso cadastrado")
            self._pausa()

    def cadastrar_disciplina(self):
        while True:
            print("\n--- CADASTRAR DISCIPLINA ---")
            print("0 - Voltar")
            curso = input("Curso: ")
            if curso == '0': return
            nome = input("Disciplina: ")
            horas = int(input("Horas totais: "))
            professor = input("Professor responsável: ")
            percentual = {}
            while True:
                tipo = input("Tipo de sala (ENTER para finalizar): ")
                if not tipo:
                    break
                percentual[tipo] = int(input("Percentual (%): "))
            if sum(percentual.values()) != 100:
                print("❌ Percentual deve somar 100%")
                self._pausa()
                return
            disc = Disciplina(nome, horas, 0, percentual, professor)
            self.cursos[curso]["disciplinas"][nome] = asdict(disc)
            self.professores[professor]["disciplinas"].append(nome)
            self._salvar("cursos.json", self.cursos)
            self._salvar("professores.json", self.professores)
            print("✅ Disciplina cadastrada")
            self._pausa()

    # =============================
    # LISTAGENS
    # =============================

    def listar_salas(self):
        print("\n--- SALAS CADASTRADAS ---")
        for cod, s in self.salas.items():
            print(f"{cod} | {s['funcao']} | Cap: {s['capacidade']} | Itens: {', '.join(s['itens'])}")
        self._pausa()

    def listar_cursos(self):
        print("\n--- CURSOS CADASTRADOS ---")
        for nome, c in self.cursos.items():
            print(f"Curso: {nome} ({c['turno']})")
            for d in c['disciplinas'].values():
                print(f"  - {d['nome']} {d['horas_usadas']}/{d['horas_total']}h")
        self._pausa()

    def listar_professores(self):
        print("\n--- PROFESSORES CADASTRADOS ---")
        for p in self.professores.values():
            print(f"{p['nome']} {p['carga_usada']}/{p['carga_total']}h")
        self._pausa()

    # =============================
    # EDIÇÕES
    # =============================

    def editar_sala(self):
        codigo = input("Código da sala (0 para voltar): ")
        if codigo == '0': return
        if codigo not in self.salas:
            print("❌ Sala não encontrada")
            self._pausa()
            return
        sala = self.salas[codigo]
        cap = input(f"Capacidade ({sala['capacidade']}): ")
        func = input(f"Função ({sala['funcao']}): ")
        itens = input(f"Itens ({', '.join(sala['itens'])}): ")
        if cap: sala['capacidade'] = int(cap)
        if func: sala['funcao'] = func
        if itens: sala['itens'] = [i.strip() for i in itens.split(',')]
        self._salvar("salas.json", self.salas)
        print("✅ Sala atualizada")
        self._pausa()

    def editar_professor(self):
        nome = input("Professor (0 para voltar): ")
        if nome == '0': return
        if nome not in self.professores:
            print("❌ Professor não encontrado")
            self._pausa()
            return
        carga = input(f"Carga total ({self.professores[nome]['carga_total']}): ")
        if carga:
            self.professores[nome]['carga_total'] = int(carga)
        self._salvar("professores.json", self.professores)
        print("✅ Professor atualizado")
        self._pausa()

    def editar_curso(self):
        nome = input("Curso (0 para voltar): ")
        if nome == '0': return
        if nome not in self.cursos:
            print("❌ Curso não encontrado")
            self._pausa()
            return
        turno = input(f"Turno ({self.cursos[nome]['turno']}): ")
        if turno:
            self.cursos[nome]['turno'] = turno
        self._salvar("cursos.json", self.cursos)
        print("✅ Curso atualizado")
        self._pausa()

    def editar_disciplina(self):
        curso = input("Curso (0 para voltar): ")
        if curso == '0': return
        if curso not in self.cursos:
            print("❌ Curso não encontrado")
            self._pausa()
            return
        nome = input("Disciplina: ")
        if nome not in self.cursos[curso]['disciplinas']:
            print("❌ Disciplina não encontrada")
            self._pausa()
            return
        d = self.cursos[curso]['disciplinas'][nome]
        horas = input(f"Horas totais ({d['horas_total']}): ")
        prof = input(f"Professor ({d['professor']}): ")
        if horas: d['horas_total'] = int(horas)
        if prof: d['professor'] = prof
        self._salvar("cursos.json", self.cursos)
        print("✅ Disciplina atualizada")
        self._pausa()

    # =============================
    # AGENDAMENTO
    # =============================

    def solicitar_sala(self):
        professor = input("Professor (0 para voltar): ")
        if professor == '0': return
        disciplina = input("Disciplina: ")
        curso = self._curso_da_disciplina(disciplina)
        turno = self.cursos[curso]['turno']
        tipos = self.cursos[curso]['disciplinas'][disciplina]['percentual_salas'].keys()

        print("\n--- DISPONIBILIDADE ---")
        for h in self.horarios[turno]:
            livre = False
            for cod, sala in self.salas.items():
                if sala['funcao'] in tipos and h not in sala['agenda']:
                    print(f"{h} - {cod} 🟢")
                    livre = True
            if not livre:
                print(f"{h} 🔴")

        if input("Deseja reservar? (s/n): ").lower() == 's':
            sala = input("Sala: ")
            horario = input("Horário: ")
            self._reservar(sala, horario, disciplina, professor)
        self._pausa()

    def _reservar(self, sala, horario, disciplina, professor):
        disc = self._disciplina_obj(disciplina)
        prof = self.professores[professor]
        if disc['horas_usadas'] >= disc['horas_total']:
            print("❌ Disciplina sem carga disponível")
            return
        if prof['carga_usada'] >= prof['carga_total']:
            print("❌ Professor sem carga disponível")
            return
        self.salas[sala]['agenda'][horario] = disciplina
        disc['horas_usadas'] += 1
        prof['carga_usada'] += 1
        self._salvar("salas.json", self.salas)
        self._salvar("cursos.json", self.cursos)
        self._salvar("professores.json", self.professores)
        print("✅ Aula reservada")

    def reservas_professor(self):
        nome = input("Professor (0 para voltar): ")
        if nome == '0': return
        print("\n--- RESERVAS ---")
        for s, sala in self.salas.items():
            for h, d in sala['agenda'].items():
                if d in self.professores[nome]['disciplinas']:
                    print(f"{s} - {h} ({d})")
        self._pausa()

    # =============================
    # AUXILIARES
    # =============================

    def _curso_da_disciplina(self, disciplina):
        for c, curso in self.cursos.items():
            if disciplina in curso['disciplinas']:
                return c

    def _disciplina_obj(self, disciplina):
        curso = self._curso_da_disciplina(disciplina)
        return self.cursos[curso]['disciplinas'][disciplina]

    # =============================
    # MENUS
    # =============================

    def menu_escola(self):
        while True:
            print("""
--- MENU DA ESCOLA ---
1 - Cadastrar Sala
2 - Editar Sala
3 - Cadastrar Professor
4 - Editar Professor
5 - Cadastrar Curso
6 - Editar Curso
7 - Cadastrar Disciplina
8 - Editar Disciplina
9 - Listar Salas
10 - Listar Cursos
11 - Listar Professores
0 - Voltar
""")
            op = input("Opção: ")
            if op == '1': self.cadastrar_sala()
            elif op == '2': self.editar_sala()
            elif op == '3': self.cadastrar_professor()
            elif op == '4': self.editar_professor()
            elif op == '5': self.cadastrar_curso()
            elif op == '6': self.editar_curso()
            elif op == '7': self.cadastrar_disciplina()
            elif op == '8': self.editar_disciplina()
            elif op == '9': self.listar_salas()
            elif op == '10': self.listar_cursos()
            elif op == '11': self.listar_professores()
            elif op == '0': break

    def menu_professor(self):
        while True:
            print("""
--- MENU DO PROFESSOR ---
1 - Solicitar Sala
2 - Ver Reservas
0 - Voltar
""")
            op = input("Opção: ")
            if op == '1': self.solicitar_sala()
            elif op == '2': self.reservas_professor()
            elif op == '0': break

    def menu_principal(self):
        while True:
            print("""
===== MENU PRINCIPAL =====
1 - Menu da Escola
2 - Menu do Professor
0 - Sair
""")
            op = input("Opção: ")
            if op == '1': self.menu_escola()
            elif op == '2': self.menu_professor()
            elif op == '0': break

if __name__ == '__main__':
    SistemaAgendamento().menu_principal()
