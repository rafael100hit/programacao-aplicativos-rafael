//   MAIN

package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

public static void main(String[] args) {
        
        RegistroVeiculo rv = new RegistroVeiculo();
         ConsultarVagas cs = new ConsultarVagas();
         FinalizarUso fu = new FinalizarUso();
         HistoricoSaldo hs = new HistoricoSaldo();
         Scanner input = new Scanner(System.in);
        
       int escolha;
     do {
            System.out.print(
                    """
                    ==== MENU INICIAL DO ESTACIONAMENTO ====
                     1 - REGISTRAR VEÍCULO EM VAGA
                     2 - FINALIZAR USO DO VEÍCULO NA VAGA
                     3 - CONSULTAR DISPONIBILIDADE DE VAGAS
                     4 - CONSULTAR SALDO E HISTÓRICO DE PAGAMENTOS
                     0 - SAIR""");
                     System.out.print("\nDIGITE A OPÇÃO DESEJADA: ");
                     
            
            escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1 -> rv.registrar();
                case 2 -> fu.finalizar();
                case 3 -> cs.consulta();
                case 4 -> hs.exibirHistorico();
                case 0 -> System.out.println("\nEncerrando o sistema...");
                default -> System.out.println("\nOpção inválida! Tente novamente.\n");
            }

            System.out.println();

        } while (escolha != 0);
        
        
    }
}


//    REGISTRO VEICULO


package javaapplication7;

import java.util.Scanner;

public class RegistroVeiculo {
   
     private int tipo;
    private String placa;
    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int hora;
    private int minuto;
    private int vaga;

    private static int codigo = 0;
    private static int proximaVaga = 1;
    public static final int MAX_VAGAS = 10;
    private static RegistroVeiculo[] vagas = new RegistroVeiculo[MAX_VAGAS];

    public static RegistroVeiculo getVeiculoNaVaga(int indice) {
        if (indice >= 0 && indice < MAX_VAGAS) {
            return vagas[indice];
        }
        return null;
    }

    public static RegistroVeiculo[] getVagas() {
        return vagas;
    }
    
    private int encontrarVagaDisponivel(int tipo) {
    int inicio = 0, fim = 0;

        switch (tipo) {
            case 2: 
                inicio = 0;
                fim = 2;
                break;
            case 3: 
                inicio = 3;
                fim = 4;
                break;
            case 1: 
                inicio = 5;
                fim = 9;
                break;
        }

        for (int i = inicio; i <= fim; i++) {
            if (vagas[i] == null) {
                return i;
            }
        }
        return -1; 
    }


    public void registrar() {
        Scanner input = new Scanner(System.in);
        char opcao;



        do {
            // Tipo
            do {
                System.out.print("\n--- Tipo de Veículo ---\n1- Carro\n2- Moto\n3- Caminhão/Caminhonete\nDigite o tipo: ");
                tipo = input.nextInt();
                input.nextLine();
                if (tipo < 1 || tipo > 3) {
                    System.out.println("Tipo inválido! Digite 1, 2 ou 3.");
                }
            } while (tipo < 1 || tipo > 3);

            // Placa
            do {
                System.out.print("Digite a placa (7 caracteres): ");
                placa = input.nextLine();
                if (placa.length() != 7) System.out.println("Placa inválida!");
            } while (placa.length() != 7);

            // Nome
            do {
                System.out.print("Nome do condutor: ");
                nome = input.nextLine();
                if (nome.isEmpty()) System.out.println("Nome não pode estar vazio!");
            } while (nome.isEmpty());

            // Marca
            do {
                System.out.print("Marca do veículo: ");
                marca = input.nextLine();
                if (marca.isEmpty()) System.out.println("Marca não pode estar vazia!");
            } while (marca.isEmpty());

            // Modelo
            do {
                System.out.print("Modelo do veículo: ");
                modelo = input.nextLine();
                if (modelo.isEmpty()) System.out.println("Modelo não pode estar vazio!");
            } while (modelo.isEmpty());

            // Cor
            do {
                System.out.print("Cor do veículo: ");
                cor = input.nextLine();
                if (cor.isEmpty()) System.out.println("Cor não pode estar vazia!");
            } while (cor.isEmpty());

            // Hora
            do {
                System.out.print("Hora de entrada (0-23): ");
                hora = input.nextInt();
                if (hora < 0 || hora > 23) System.out.println("Hora inválida!");
            } while (hora < 0 || hora > 23);

            // Minuto
            do {
                System.out.print("Minuto de entrada (0-59): ");
                minuto = input.nextInt();
                if (minuto < 0 || minuto > 59) System.out.println("Minuto inválido!");
            } while (minuto < 0 || minuto > 59);

            // Registro
            RegistroVeiculo veiculo = new RegistroVeiculo();
            veiculo.tipo = this.tipo;
            veiculo.placa = this.placa;
            veiculo.nome = this.nome;
            veiculo.marca = this.marca;
            veiculo.modelo = this.modelo;
            veiculo.cor = this.cor;
            veiculo.hora = this.hora;
            veiculo.minuto = this.minuto;
            veiculo.vaga = proximaVaga;

            int vagaIndex = encontrarVagaDisponivel(tipo);
            if (vagaIndex == -1) {
                System.out.println("Não há vagas disponíveis para este tipo de veículo!");
            } else {
                vagas[vagaIndex] = veiculo;
                veiculo.vaga = vagaIndex + 1; // salvar a vaga real (1 a 10)
                System.out.println("Veículo registrado na vaga " + (vagaIndex + 1) + ".");
                codigo++;
            }



            // Deseja continuar
            System.out.print("Deseja registrar outro veículo? (S/N): ");
            opcao = input.next().toUpperCase().charAt(0);
            input.nextLine();
            System.out.println();

        } while (opcao == 'S');
    }

    // GETTERS
    public int getTipo() { return tipo; }
    public String getPlaca() { return placa; }
    public String getNome() { return nome; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public int getVaga() { return vaga; }
    public static int getCodigo() { return codigo; }
    
    
}



//   CONSULTAR VAGA



package javaapplication7;



public class ConsultarVagas {
    
    void consulta() {
        System.out.println("--- DISPONIBILIDADE DE VAGAS ---");

        int totalOcupadas = 0;
        int totalLivres = 0;

        for (int i = 0; i < RegistroVeiculo.MAX_VAGAS; i++) {
            RegistroVeiculo veiculo = RegistroVeiculo.getVeiculoNaVaga(i);

            if (veiculo != null) {
                System.out.println("Vaga " + (i + 1) + " (Tipo: " + veiculo.getTipo() + "): OCUPADA - Placa: " + veiculo.getPlaca());
                totalOcupadas++;
            } else {
                if(i<=2){
                    System.out.println("Vaga " + (i + 1) + " (Tipo: 2 MOTO): LIVRE");
                }
                if(i>=3 && i<=4){
                    System.out.println("Vaga " + (i + 1) + " (Tipo: 3 CAMINHAO/CAMINHONETE): LIVRE");
                }
                if(i>=5){
                    System.out.println("Vaga " + (i + 1) + " (Tipo: 1 CARRO): LIVRE");
                }
                totalLivres++;
            }
        }

        System.out.println();
        System.out.println("Total de vagas ocupadas: " + totalOcupadas);
        System.out.println("Total de vagas livres: " + totalLivres);
    }
    
    
}



//    FINALIZAR USO



package javaapplication7;


import java.util.Scanner;

public class FinalizarUso {
    
    public void finalizar() {
        Scanner input = new Scanner(System.in);

        if (RegistroVeiculo.getCodigo() == 0) {
            System.out.println("Não há veículos registrados.");
            return;
        }

        System.out.println("--- FINALIZAR USO ---");
        System.out.print("Digite o código do veículo: ");
        int codigoVeiculo = input.nextInt();
        input.nextLine();

        RegistroVeiculo[] vagas = RegistroVeiculo.getVagas();
        RegistroVeiculo veiculoEncontrado = null;
        int indice = -1;

        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].getVaga() == codigoVeiculo) {
                veiculoEncontrado = vagas[i];
                indice = i;
                break;
            }
        }

        if (veiculoEncontrado == null) {
            System.out.println("Veículo não encontrado.");
            return;
        }

        System.out.print("Digite a hora de saída (0-23): ");
        int horaSaida = input.nextInt();
        System.out.print("Digite o minuto de saída (0-59): ");
        int minutoSaida = input.nextInt();

        int tempoEntrada = veiculoEncontrado.getHora() * 60 + veiculoEncontrado.getMinuto();
        int tempoSaida = horaSaida * 60 + minutoSaida;
        int tempoTotal = tempoSaida - tempoEntrada;

        if (tempoTotal < 0) {
            System.out.println("A hora de saída não pode ser menor que a de entrada. Tente novamente.");
            return;
        }

        double valorTotal = 0;
        int tipo = veiculoEncontrado.getTipo();

        if (tipo == 1) { // Carro
            if (tempoTotal <= 15) valorTotal = 6.00;
            else if (tempoTotal <= 30) valorTotal = 17.00;
            else if (tempoTotal <= 60) valorTotal = 20.00;
            else valorTotal = 20.00 + ((tempoTotal - 60) * 1.35);
        } else if (tipo == 2) { // Moto
            if (tempoTotal <= 15) valorTotal = 3.00;
            else if (tempoTotal <= 30) valorTotal = 7.00;
            else if (tempoTotal <= 60) valorTotal = 10.00;
            else valorTotal = 10.00 + ((tempoTotal - 60) * 1.00);
        } else if (tipo == 3) { // Caminhão
            if (tempoTotal <= 15) valorTotal = 16.00;
            else if (tempoTotal <= 30) valorTotal = 27.00;
            else if (tempoTotal <= 60) valorTotal = 30.00;
            else valorTotal = 30.00 + ((tempoTotal - 60) * 2.35);
        }

        System.out.println("Tempo de permanência: " + tempoTotal + " minutos");
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorTotal));

        int tipoPagamento;
        String tipoPag=null;
        
        do{
        System.out.print("--- Tipo de pagamento --- \n1-Dinheiro \n2-Cartão \n3-Pix \nDigite o tipo de pagamento:  ");
        tipoPagamento = input.nextInt();
        input.nextLine();
        
        switch (tipoPagamento) {
            case 1 -> {
                System.out.println("Dinheiro");
                tipoPag="Dinheiro";
            }
            case 2 -> {
                System.out.println("Cartão");
                tipoPag="Cartão";
            }
            case 3 ->{
                System.out.println("Pix");
                tipoPag="Pix";
            }
            default -> {
                System.out.println("Desconhecido. \nDigite 1, 2 ou 3.");
                tipoPag = null;
        }
        }
        }while(tipoPag == null);
        System.out.println("Pagamento via: " + tipoPag);

        //  SALVA NO HISTÓRICO ANTES DE LIBERAR A VAGA
        HistoricoSaldo.registrarPagamento(codigoVeiculo, valorTotal, tipoPag);

        vagas[indice] = null;
        System.out.println("Veículo removido. Vaga " + (indice + 1) + " liberada.");
    }
    
    
}



//     HISTORICO SALDO



package javaapplication7;



public class HistoricoSaldo {
    
    static class Pagamento {
        int codigoVeiculo;
        double valor;
        String formaPagamento;

        Pagamento(int codigoVeiculo, double valor, String formaPagamento) {
            this.codigoVeiculo = codigoVeiculo;
            this.valor = valor;
            this.formaPagamento = formaPagamento;
        }
    }

    private static Pagamento[] historico = new Pagamento[100]; 
    private static int totalPagamentos = 0;
    private static double saldoTotal = 0;

    public static void registrarPagamento(int codigoVeiculo, double valor, String formaPagamento) {
        historico[totalPagamentos] = new Pagamento(codigoVeiculo, valor, formaPagamento);
        totalPagamentos++;
        saldoTotal += valor;
    }

    public static void exibirHistorico() {
        System.out.println("===== HISTÓRICO DE PAGAMENTOS =====");
        System.out.println("-----------------------------------");

        if (totalPagamentos == 0) {
            System.out.println("Nenhum pagamento registrado ainda.");
        } else {
            for (int i = 0; i < totalPagamentos; i++) {
                System.out.println("Código do Veículo: " + historico[i].codigoVeiculo);
                System.out.println("Valor Pago: R$ " + String.format("%.2f", historico[i].valor));
                System.out.println("Forma de Pagamento: " + historico[i].formaPagamento);
                System.out.println("-----------------------------------");
            }
        }

        System.out.println("SALDO TOTAL ARRECADADO: R$ " + String.format("%.2f", saldoTotal));
    }
    
    
}
