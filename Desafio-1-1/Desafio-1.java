/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixa.rapido.desafio;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.text.DecimalFormat;
public class CaixaRapidoDesafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int protocolo=10000+random.nextInt(99999);
        int escolha, sair;
        double saldo_real = 100.00, saldo_dolar= 0.00, deposito, emprestimo,valor_parcela,parcela_max, salario, comprar_dolar, juros, total_parcela;
        String opcao;
        String [] extrato = new String[10];
        int pos_extrato=0, parcela;
       
        escolha=-1;
        while (escolha != 0) {
            
            System.out.println("=== Caixa Rápido === \n1- Saldo \n2- Depósito \n3- Extrato \n4- Simular Empréstimo \n5- Comprar Dolar \n0- Sair" );
            escolha = entrada.nextInt();
            entrada.nextLine();
        
            switch (escolha) {
            
                case 1:
                    System.out.println("Saldo em Reais: R$"+saldo_real + "\nSaldo em Dólares: US$"+saldo_dolar);
                    System.out.println("Deseja voltar ao menu inicial (V) ou encerrar o programa (E)?");
                    opcao = entrada.nextLine(); 
                    if (opcao.equalsIgnoreCase("E")){
                        escolha=0;
                    } 
                    break;
                    
                
                case 2:
                    boolean deposito_valido = false;
                    while (!deposito_valido){
                    System.out.println("Digite o valor a ser depositado: (R$0,01 a R$5,000,00) ");
                    deposito=entrada.nextDouble();
                    entrada.nextLine();
                    if (deposito>=0.01 && deposito<=5000){
                        saldo_real=saldo_real+deposito;
                        System.out.println("Deposito realizado com sucesso!");
                        deposito_valido=true;
                        
                        if (pos_extrato < extrato.length){
                            extrato[pos_extrato]=("Deposito +R$"+df.format(deposito));
                            pos_extrato++;
                        }
                        else{
                            
                        for (int i=0;i<extrato.length-1; i++) {
                        extrato[i]=extrato[i+1];
                    }
                        extrato[extrato.length-1]=("Deposito +R$"+df.format(deposito));
                    }
                    
                    }
                    else {
                        System.out.println("Valor inválido!");
                    }
                    }
                    System.out.println("Deseja voltar ao menu inicial (V) ou encerrar o programa (E)?");
                        opcao = entrada.nextLine();
                        if (opcao.equalsIgnoreCase("E")){
                            escolha=0;
                        } 
                        break;
                        
                case 3:
                    System.out.println("Extrato de últimos depósitos:");
                    boolean vazio=true;
                    for (int i=pos_extrato-1; i>=0; i--){
                        if (extrato[i]!=null){
                            System.out.println(extrato[i]);
                            vazio=false;
                        }
                    }
                    if (vazio){
                        System.out.println("Nenhum extrato!");
                    }
                    System.out.println("Deseja voltar ao menu inicial (V) ou encerrar o programa (E)?");
                    opcao = entrada.nextLine();
                    if (opcao.equalsIgnoreCase("E")) {
                        escolha = 0;
                    }
                    break;
                    
                case 4:
                    boolean emprestimo_valido=false;
                    while (!emprestimo_valido){
                    System.out.println("Digite o valor do emprestimo desejado: (R$200,00 a R$100,000,00) ");
                    emprestimo= entrada.nextDouble();
                    entrada.nextLine();
                    
                    if (emprestimo>=200 && emprestimo<=100000){
                        System.out.println("Digite o seu salario bruto: ");
                        salario=entrada.nextDouble();
                        entrada.nextLine();
                        do {
                        
                        System.out.println("Escolha a quantidade de parcelas: \n(6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72)");
                        parcela=entrada.nextInt();
                        entrada.nextLine();
                        
                        switch (parcela){
                            case 6:
                                valor_parcela=emprestimo/6;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 6");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*6));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 12:
                                valor_parcela=emprestimo/12;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 12");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*12));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 18:
                                valor_parcela=emprestimo/18;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 18");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*18));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 24:
                                valor_parcela=emprestimo/24;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 24");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*24));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 30:
                                valor_parcela=emprestimo/30;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 30");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*30));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 36:
                                valor_parcela=emprestimo/36;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 36");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*36));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 40:
                                valor_parcela=emprestimo/40;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 40");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*40));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 48:
                                valor_parcela=emprestimo/48;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 48");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*48));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 56:
                                valor_parcela=emprestimo/56;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 56");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*56));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 60:
                                valor_parcela=emprestimo/60;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 60");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+df.format(total_parcela*60));
                                    emprestimo_valido=true;
                                    break;
                                }
                            case 72:
                                valor_parcela=emprestimo/72;
                                juros=(valor_parcela/100)*2;
                                total_parcela=valor_parcela+juros;
                                parcela_max=(salario/100)*30;
                                if(valor_parcela>parcela_max){
                                    System.out.println("Emprestimo indisponivel!");
                                    emprestimo_valido=true;
                                    break;
                                    
                                }
                                else{
                                    System.out.println("Emprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+protocolo);
                                    System.out.println("Valor da parcela; R$"+df.format(total_parcela)+" x 72");
                                    System.out.println("Valor do emprestimo: R$"+emprestimo);
                                    System.out.println("Valor total do emprestimo a ser pago: R$"+ df.format(total_parcela*72));
                                    emprestimo_valido=true;
                                    break;
                                }
                            default:
                                System.out.println("Parcela invalida!");
                                emprestimo_valido=true;
                                break;
                        }
                        
                        
                        }while (parcela != 6 && parcela != 12 && parcela != 18 && parcela != 24 && parcela != 30 && parcela != 36 && parcela != 40 && parcela != 48 && parcela != 56 && parcela != 60 && parcela != 72);
                        }
                    
                    
                    else {
                        System.out.println("Valor invalido!");
                    }
                    }
                    
            
                    System.out.println("Deseja voltar ao menu inicial (V) ou encerrar o programa (E)?");
                    opcao = entrada.nextLine();
                    if (opcao.equalsIgnoreCase("E")){
                        escolha=0;
                        }
                    break;
            
                case 5:
                    boolean conversao=false;
                    while(!conversao){
                    System.out.println("Saldo R$"+saldo_real);
                    double cotacao=5.32, quantidade;
                    String opcao_dolar, confirmacao;
                    System.out.println("1 USD = R$5,32 \nDigite a quantidade de US$ que deseja comprar: ");
                    quantidade=entrada.nextDouble();
                    entrada.nextLine();
                    double custo=quantidade*cotacao;
                    
                    if (custo>saldo_real){
                    System.out.println("Custo em Reais: R$"+df.format(custo));
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Deseja simular novamente (R), voltar ao menu (V) ou encerrar o programa(E)");
                    opcao_dolar=entrada.nextLine();
                    if (opcao_dolar.equalsIgnoreCase("R")){
                        escolha=5;
                    }
                    if (opcao_dolar.equalsIgnoreCase("E")){
                        escolha=0;
                    }
                    if (opcao_dolar.equalsIgnoreCase("V")){
                        conversao=true;
                    }
                    }
                    else {
                    System.out.println("Custo em Reais: R$"+df.format(custo));
                    System.out.println("Confirmar compra? (s/n)");
                    confirmacao=entrada.nextLine();
                    if (confirmacao.equalsIgnoreCase("S")){
                    saldo_real=saldo_real-custo;
                    saldo_dolar=saldo_dolar+quantidade;
                    System.out.println("Compra realizada com sucesso! \nNovo saldo: \n-Reais R$"+df.format(saldo_real)+" \n-Dólares US$"+df.format(saldo_dolar));
                        if (pos_extrato < extrato.length){
                            extrato[pos_extrato]=("Deposito +US$"+df.format(quantidade));
                            pos_extrato++;
                            extrato[pos_extrato]=("Compra de USS: -R$"+df.format(custo));
                            pos_extrato++;
                        }
                        else{
                            for (int i=0;i<extrato.length-1; i++) {
                            extrato[i]=extrato[i+1];
                            }
                            extrato[extrato.length-1]=("Deposito +US$"+df.format(quantidade));
                            extrato[extrato.length-1]=("Compra de USS: -R$"+df.format(custo));
                            }
                    
                    }
                    conversao=true;
                    }
                    
        }
                    System.out.println("Deseja voltar ao menu inicial (V) ou encerrar o programa (E)?");
                    opcao = entrada.nextLine();
                    if (opcao.equalsIgnoreCase("E")){
                        escolha=0;
                    }
                    
        }
                    
        }
                
                    
            
        entrada.close();
        System.out.println("Encerrando o atendimento. Obrigado por utilizar o Caixa Rápido.");
        }

}
