// MAIN


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_09_agenda;
import java.util.Scanner;
/**
 *
 * @author rafael
 */
public class Atividade_09_agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        Contato contato = new Contato();
        AgendaEletronica agenda = new AgendaEletronica();
        
        
        int opcao;
        
        do{
            System.out.println("=== AGENDA ELETRÔNICA ===");
            System.out.println("1) Cadastrar contato.");
            System.out.println("2) Consultar agenda.");
            System.out.println("3) Editar contato.");
            System.out.println("4) Excluir contato.");
            System.out.println("5) Sair. \n");
            System.out.println("Digite a opção desejada: ");
            opcao=entrada.nextInt();
            entrada.nextLine();
            switch(opcao){
                case 1 -> {
                    contato.cadastrar();
                    agenda.salvarContato(contato);
                }
                case 2 -> agenda.ConsultarAgenda();
                case 3 -> agenda.EditarContato();
                case 4 -> agenda.ExcluirContato();
                case 5 -> System.out.println("Encerrando o sistema!");
                default -> System.out.println("Opção invalida!");
                
            }
            
        }while(opcao!=5);
        
    }
    
}



// CLASSE CONTATO



package atividade_09_agenda;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Contato {
    
    private String nome;
    private String telefone;
    private String email;
    
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        Pattern patternEmail = Pattern.compile(regexEmail);
        
        System.out.println("[CADASTRAR CONTATO]");
        do{
            System.out.println("Digite o nome: ");
            nome = entrada.nextLine();
            if (nome.length() == 0){
                System.out.println("O nome não pode estar vazio!");
            }
        }while(nome.length() == 0);
        boolean fone = true;
        do{
            System.out.println("Digite o telefone (00.00000-0000): ");
            telefone = entrada.nextLine();
            if(telefone.length()!=11){
                System.out.println("Digite exatamente 11 digitos!");
                fone = false;
                continue;
            }
            fone = true;
            for(int i = 0; i<telefone.length(); i++){
                char c = telefone.charAt(i);
                if(!Character.isDigit(c)){
                    System.out.println("Digite apenas numeros de (0 - 9).");
                    fone = false;
                    break;
                }
            }
        }while(!fone);
        boolean emailVal = true;
        do{
            System.out.println("Digite o email: ");
            email = entrada.nextLine();
            Matcher matcherEmail = patternEmail.matcher(email);
            if(!matcherEmail.matches()){
                System.out.println("Digite um email valido! \nexemplo@dominio.com");
                emailVal = true;
            }
            else{
                emailVal = false;
            }
        }while(emailVal== true);
        System.out.println("Contato cadastrado com sucesso!");
    }
    
}



// CLASSE AGENDA ELETRONICA



package atividade_09_agenda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgendaEletronica {
    
    private String [][] agenda = new String[1000][3];
    
    
    public boolean salvarContato(Contato contato){
        String email = contato.getEmail();
        String nome = contato.getNome();
        String telefone = contato.getTelefone();
        
        try{
            for(int i=0; i<agenda.length; i++){
                if(agenda[i][0]==null){
                    agenda[i][0]=nome;
                    agenda[i][1]=telefone;
                    agenda[i][2]=email;
                    System.out.println("Contato salvo!");
                    return true;
                }
            }
            System.out.println("Erro: Agenda cheia. ");
            return false;
        }catch(Exception e){
            System.out.println("Erro ao salvar o contato: "+e.getMessage());
            return false;
        }
    }
    
    public void ConsultarAgenda(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        List<String[]> contatos = new ArrayList<>();
        
        for (String[] contato : agenda) {
        if (contato[0] != null) {
            contatos.add(contato);
        }
        }
        if (contatos.isEmpty()) {
        System.out.println("Agenda vazia.");
        return;
        }
        
        
        do{
            System.out.println("[CONSULTAR AGENDA]");
            System.out.println("Odenar por: \n1 - NOME | 2 - TELEFONE | 3 - E-MAIL");
            opcao = entrada.nextInt();
            entrada.nextLine();
            if(opcao<1 || opcao>3){
                System.out.println("Opcao invalida! \nDigite 1, 2 ou 3.");
            }
        }while(opcao<1 || opcao>3);
    
        int coluna = opcao - 1; 
        contatos.sort(Comparator.comparing(c -> c[coluna].toLowerCase()));
        
        System.out.println("\n=== CONTATOS ORDENADOS ===");
        for (String[] c : contatos) {
        System.out.println("Nome: " + c[0]);
        System.out.println("Telefone: " + c[1]);
        System.out.println("Email: " + c[2]);
        System.out.println("--------------------------");
    }
        
        
    }
    
    public void EditarContato(){
        Scanner entrada = new Scanner(System.in);
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        Pattern patternEmail = Pattern.compile(regexEmail);
        
        String nome, telefone, novoTelefone, email;
        
        System.out.println("[EDITAR CONTATO]");
        
        boolean fone;
        do{
            System.out.println("Informe o telefone (chave unica) do contato: ");
            telefone = entrada.nextLine();
            
            if(telefone.length()!=11){
                System.out.println("Digite exatamente 11 digitos!");
                fone = false;
                continue;
            }
            fone = true;
            
            for(int i = 0; i<telefone.length(); i++){
                char c = telefone.charAt(i);
                if(!Character.isDigit(c)){
                    System.out.println("Digite apenas numeros de (0 - 9).");
                    fone = false;
                    break;
                }
            }
        }while(!fone);
        
        boolean encontrado = false;
        
        for (int i=0; i<agenda.length; i++){
            if (telefone.equals(agenda[i][1])){
                encontrado = true;
                
                System.out.println("Novo nome (Enter para manter): ");
                nome = entrada.nextLine();
                if(nome.length()>0){
                    agenda[i][0]=nome;
                }
                
                
                do{
                    
                System.out.println("Novo telefone (Enter para manter): ");
                novoTelefone = entrada.nextLine();
                
                if(novoTelefone.length()>0){
                    if(telefone.length()!=11){
                        System.out.println("Digite exatamente 11 digitos!");
                        fone = false;
                        continue;
                    }
                    
                    fone = true;
                    for(int j = 0; j<novoTelefone.length(); j++){
                        char c = telefone.charAt(i);
                        if(!Character.isDigit(c)){
                            System.out.println("Digite apenas numeros de (0 - 9).");
                            fone = false;
                            break;
                        }
                        
                    }
                    if(fone){
                        agenda[i][1]=novoTelefone;
                    }
                }
                }while(!fone);
                
                boolean emailVal = true;
                do{
                    System.out.println("Novo email(Enter para manter): ");
                    email = entrada.nextLine();
                    
                    if(email.length()>0){
                        Matcher matcherEmail = patternEmail.matcher(email);
                        if(!matcherEmail.matches()){
                            System.out.println("Digite um email valido! \nexemplo@dominio.com");
                            emailVal = true;
                        }
                        else{
                            agenda[i][2]=email;
                            emailVal = false;
                    }
                    }
                }while(emailVal== true);
            }
            }System.out.println("Contato atualizado com sucesso!");
            
        }
    
    
        public void ExcluirContato(){
            Scanner entrada = new Scanner(System.in);
            String telefone;
            
            boolean fone = true;
            do{
            System.out.println("Informe o telefone (chave unica) do contato: ");
            telefone = entrada.nextLine();
            
            if(telefone.length()!=11){
                System.out.println("Digite exatamente 11 digitos!");
                fone = false;
                continue;
            }
            fone = true;
            
            for(int i = 0; i<telefone.length(); i++){
                char c = telefone.charAt(i);
                if(!Character.isDigit(c)){
                    System.out.println("Digite apenas numeros de (0 - 9).");
                    fone = false;
                    break;
                }
            }
        }while(!fone);
            
            System.out.print("Confirmar exclusão? (s/n): ");
            String resposta = entrada.nextLine().toLowerCase();
            
            if (resposta.equals("s")) {
                boolean encontrado = false;
                
                for (int i = 0; i < agenda.length; i++) {
                    
                    if (telefone.equals(agenda[i][1])) {
                        
                        for (int j = i; j < agenda.length - 1; j++) {
                            agenda[j][0] = agenda[j + 1][0];
                            agenda[j][1] = agenda[j + 1][1];
                            agenda[j][2] = agenda[j + 1][2];
                        }
                        agenda[agenda.length - 1][0] = null;
                        agenda[agenda.length - 1][1] = null;
                        agenda[agenda.length - 1][2] = null;
                        
                        encontrado = true;
                        
                        System.out.println("Contato excluído com sucesso!");
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Contato com telefone " + telefone + " não encontrado.");
                }
            } else {
                System.out.println("Exclusão cancelada.");
            }
        }
    
    
    }
