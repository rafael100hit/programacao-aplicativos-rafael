
package caixa_rapido_refatorado;

import java.util.Scanner;


public class Caixa_rapido_refatorado {

    public static class Menu_Opcao{
        public int escolha(){
            String opcao;
            Scanner entrada = new Scanner(System.in);

            while (true){
                    System.out.println("Deseja voltar ao menu inicial (V) ou encerrar o programa (E)?");
                    opcao = entrada.nextLine();
                    
                    if (opcao.equalsIgnoreCase("e") || opcao.equalsIgnoreCase("v")){
                        if (opcao.equalsIgnoreCase("e")){
                            System.out.println("Encerrando o sistema.");
                            return 0;
                        }
                        if (opcao.equalsIgnoreCase("v")){
                            return -1;
                        }
                    }
                    else{
                        System.out.println("Opção invalida! \nDigite apenas (V) ou (E).");
                    }
                    }
        }
    }
   
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria saldo = new ContaBancaria(100.00, 0.00);
        Extrato movimentacao = new Extrato();
        Menu_Opcao menu = new Menu_Opcao();
        SimuladorEmprestimo emprestimo = new SimuladorEmprestimo();
        ServicoCambio cambio = new ServicoCambio();
        
        int escolha, escolhaCambio;
        double deposito;
        
        
        System.out.println("Iniciando o sistema!");
        
        do{
            System.out.print("=== Caixa Rápido === \n" );
            System.out.print("1- Saldo \n");
            System.out.print("2- Depósito \n");
            System.out.print("3- Extrato \n");
            System.out.print("4- Simular Empréstimo \n");
            System.out.print("5- Comprar Dolar \n");
            System.out.print("0- Sair \n");
            escolha = entrada.nextInt();
            
            
            switch (escolha){
                case 1 : 
                    saldo.exibir();
                    escolha = menu.escolha();
                    break;
                    
                    
                case 2 :
                    boolean depositoValido = false;
                    do{
                    System.out.println("Digite o valor a ser depositado: (R$0,01 a R$5,000,00) ");
                    deposito=entrada.nextDouble();
                    entrada.nextLine();
                    
                    if (deposito>=0.01 && deposito<=5000){
                        saldo.depositar(deposito);
                        System.out.println("Deposito realizado com sucesso!");
                        movimentacao.salvarDepositoReal(deposito);
                        depositoValido=true;
                        escolha = menu.escolha();
                    break;
                    }
                    else {
                        System.out.println("Valor inválido!");
                        depositoValido=false;
                    }
                    }while(depositoValido==false);
                    break;
                    
                case 3:
                    movimentacao.exibir();
                    escolha = menu.escolha();
                    break;
                    
                case 4:
                    emprestimo.simular();
                    escolha = menu.escolha();
                    break;
                    
                    case 5:
                        boolean repetirCambio = true;
                            while (repetirCambio) {
                                repetirCambio = cambio.comprarDolar(saldo, movimentacao);
                            }
                        escolha = menu.escolha();
                        break;

                    
                case 0:
                    System.out.println("Encerrando o sistema!");
                    break;
                default: escolha=-1;
                    
            }
            
        }while(escolha!=0);
        
    
    }
    
}
