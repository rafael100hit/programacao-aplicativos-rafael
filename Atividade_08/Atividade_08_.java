/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_08_;

/**
 *
 * @author Aluno
 */
import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade_08_ {

    /**
     * @param args the command line arguments
     */
    
      //    public static class Questao_01 {

    //        public int delta(int a, int b, int c){
    //            return (b*b)-4*a*c;
    //        }

    //        public double x1(int a, int b, int c){
    //            double raiz=Math.sqrt(delta(a, b, c));
    //            return (-b+raiz)/(2*a);
    //        }

    //        public double x2(int a, int b, int c){
    //            double raiz=Math.sqrt(delta(a, b, c));
    //            return (-b-raiz)/(2*a);
    //        }
    //    }


    //    public static class Questao_02{
    //        
    //        public int soma(int a,int b){
    //            return a+b;
    //        }
    //        public int subtracao(int a, int b){
    //            return a-b;
    //        }
    //        public int multiplicacao(int a, int b){
    //            return a*b;
    //        }
    //        public double divisao(double a, double b){
    //            return a/b;
    //        }
    //    }


    //        public static class Questao_03{
    //    
    //        public void mes(int recebe){
    //            switch(recebe){
    //                case 1 -> System.out.println("Janeiro");
    //                case 2 -> System.out.println("Fevereiro");
    //                case 3 -> System.out.println("Março");
    //                case 4 -> System.out.println("Abril");
    //                case 5 -> System.out.println("Maio");
    //                case 6 -> System.out.println("Junho");
    //                case 7 -> System.out.println("Julho");
    //                case 8 -> System.out.println("Agosto");
    //                case 9 -> System.out.println("Setembro");
    //                case 10 -> System.out.println("Outubro");
    //                case 11 -> System.out.println("Novembro");
    //                case 12 -> System.out.println("Dezembro");
    //            }
    //        }
    //}


    //            public static class Questao_03MT{
    //                public void mes(int recebe){
    //                    String [] saida= {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    //                    int x=recebe-1;
    //                    System.out.println(saida[x]);
    //                }
    //                
    //            }


    //            public static class Questao_04{
    //                public void funcionario(int quantidade, Scanner entrada){
    //                    String [] funcionarios = new String [quantidade];
    //                    double [] salarios = new double [quantidade];
    //                    double soma=0;
    //                for (int i=0; i<quantidade; i++){
    //                 entrada.nextLine();
    //                 System.out.println("Digite o nome do funcionario: Num "+(i+1));
    //                 funcionarios[i]=entrada.nextLine();
    //                 System.out.println("Digite o salario do "+funcionarios[i]+" :");
    //                 salarios[i]=entrada.nextDouble();
    //                 soma=soma+salarios[i];
    //                }
    //                double media=soma/quantidade;
    //                    System.out.println("Media salarial: R$"+media);
    //                    System.out.println("Funcionarios com salario acima da média: ");
    //                for(int i=0; i<quantidade; i++){
    //                    
    //                    if (salarios[i]>media){
    //                        System.out.println(funcionarios[i]+" Salario: R$"+salarios[i]);
    //                    }
    //                }
    //            }
    //            }



    //                public static class Questao_05{
    //                    
    //                    public void leve(int quantidade, Scanner entrada){
    //                    String [] nomes = new String [quantidade];
    //                    double [] pesos= new double [quantidade];
    //                    double leve;
    //                    String nome;
    //                    for (int i=0; i<quantidade; i++){
    //                        entrada.nextLine();
    //                        System.out.println("Digite o nome da "+(i+1)+" pessoa: ");
    //                        nomes[i]=entrada.nextLine();
    //                        System.out.println("Digite o peso de "+nomes[i]);
    //                        pesos[i]=entrada.nextDouble();
    //                    }
    //                    leve=pesos[0];
    //                    nome=nomes[0];
    //                    for (int i=1; i<pesos.length; i++){
    //                        if(pesos[i]<leve){
    //                        leve=pesos[i];
    //                        nome=nomes[i];
    //                        }
    //                    }
    //                    System.out.println(nome+" é o mais leve, pesando: "+leve+" KG.");
    //                }
    //                }



    //            public static class Questao_06{
    //                public void fibonacci(int escolha, Scanner entrada){
    //                    int a=0, b=1;
    //                    int[] elementos = new int [escolha];
    //                    elementos[0]=0;
    //                    elementos[1]=1;
    //                    System.out.println("A sequencia de Fibonacci até a "+escolha+" posição será: ");
    //                    System.out.print(elementos[0]+" - ");
    //                    System.out.print(elementos[1]+" - ");
    //                    for(int i=2; i<escolha; i++){
    //                        int c=a+b;
    //                        elementos[i]=c;
    //                        a=b;
    //                        b=c;
    //                        System.out.print(elementos[i]+" - ");
    //                    }
    //                }
    //            }


                public static class Questao_07{
                    public void encontrar(String nome){
                        //String [] nomes = new String [10];
                        int indice=-1;
                        for (int i=0; i<=nomes.length; i++){
                            if (nomes[i].equalsIgnoreCase(nome))
                                indice=i;
                                break;
                                }
                        if (indice!=-1){
                            System.out.println("Nome "+nome+" encontrado! \nPosição Index: "+indice);  
                        }
                        else{
                            System.out.println("Nome "+nome+" não encontrado! \nPosição index: -1");
                        }

                    }
                }

                
    public static void main(String[] args) {
        // TODO code application logic here
        
         //        Questao_01 calcular=new Questao_01();

    //        int a=-3, b=4, c=2;

    //        System.out.println("Dada a equação do 2° grau: -3x² + 4x + 2 = 0");
    //        System.out.println("Calcule o valor de x¹ e x² e mostre o resultado.\n");
    //        int delta = calcular.delta(a, b, c);
    //        System.out.println("Delta: "+delta);

    //        if (delta<0){
    //            System.out.println("A equação não possui raízes reais.");
     //       }
     //       else {
    //            double x1=calcular.x1(a, b, c);
    //            double x2=calcular.x2(a, b, c);

    //            System.out.println("X¹= "+df.format(x1));
    //            System.out.println("X²= "+df.format(x2));

    //        }


    //        Questao_02 calcular= new Questao_02();
    //        
    //        int escolha, a, b;
    //        double resultado;
    //        do {
    //        System.out.println("===Menu=== \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n0 - Encerrar \n \nDigite a opção desejada (1, 2, 3, 4 ou 0): ");
    //        escolha=entrada.nextInt();
    //        switch (escolha){
    //            case 1:
    //                System.out.println("SOMAR");
    //                System.out.println("Digite o primeiro valor: ");
    //                a=entrada.nextInt();
    //                entrada.nextLine();
    //                System.out.println("Digite o segundo valor: ");
    //                b=entrada.nextInt();
    //                resultado=calcular.soma(a, b);
    //                System.out.println("Resultado: "+resultado);
    //                break;
    //            
    //            case 2:
    //                System.out.println("SUBTRAÇÃO");
    //                System.out.println("Digite o primeiro valor: ");
    //                a=entrada.nextInt();
    //                entrada.nextLine();
    //                System.out.println("Digite o segundo valor: ");
    //                b=entrada.nextInt();
    //                resultado=calcular.subtracao(a, b);
    //                System.out.println("Resultado: "+resultado);
    //                break;
    //                
    //            case 3:
    //                System.out.println("MULTIPLICAÇÃO");
    //                System.out.println("Digite o primeiro valor: ");
    //                a=entrada.nextInt();
    //                entrada.nextLine();
    //                System.out.println("Digite o segundo valor: ");
    //                b=entrada.nextInt();
    //                resultado=calcular.multiplicacao(a, b);
    //                System.out.println("Resultado: "+resultado);
    //                break;
    //                
    //            case 4:
    //                System.out.println("DIVISÃO");
    //                System.out.println("Digite o primeiro valor: ");
    //                a=entrada.nextInt();
    //                entrada.nextLine();
    //                System.out.println("Digite o segundo valor: ");
    //                b=entrada.nextInt();
    //                do{
    //                if (b<=0){
    //                    System.out.println("O segundo valor deve ser maior que zero!");
    //                    break;
    //                }else{
    //                    resultado=calcular.divisao(a, b);
    //                System.out.println("Resultado: "+resultado);
    //                break;
    //                }
    //                }while(b<=0);
    //                
    //        }
    //        }while(escolha!=0);
    //        System.out.println("Sistema encerrado!");



    //        Questao_03 saida = new Questao_03();
    //        int recebe;
    //         do{
    //        System.out.println("Digite o numero do mes desejado: ");
    //        recebe = entrada.nextInt();
    //        entrada.nextLine();
    //       
    //        if (recebe>=1 && recebe<=12){
    //            saida.mes(recebe);
    //        }
    //        else{
    //            System.out.println("Valor invalido!");
    //        }
    //        }while (recebe<1 || recebe>12);
    //        entrada.close();
    //        


    //        Questao_03MT saida = new Questao_03MT();
    //        int recebe;
    //         do{
    //        System.out.println("Digite o numero do mes desejado: ");
    //        recebe = entrada.nextInt();
    //        entrada.nextLine();
    //       
    //        if (recebe>=1 && recebe<=12){
    //            saida.mes(recebe);
    //        }
    //        else{
    //            System.out.println("Valor invalido!");
    //        }
    //        }while (recebe<1 || recebe>12);
    //        entrada.close();



    //         Questao_04 estatistica= new Questao_04();
    //         int quantidade;
    //         System.out.println("Digite a quantidade de funcionarios: ");
    //         quantidade=entrada.nextInt();
    //         
    //         estatistica.funcionario(quantidade, entrada);
    //         entrada.close();



    //           Questao_05 mais_leve= new Questao_05();
    //           int quantidade;
    //           do{
    //           System.out.println("Digite a quantidade de pessoas na sua lista.");
    //           quantidade=entrada.nextInt();
    //           if(quantidade>=1 && quantidade<=10){
    //           mais_leve.leve(quantidade, entrada);
    //           }
    //           else{
    //               System.out.println("Quantidade invalida! \nMaximo permitido 10 pessoas.");
    //           }
    //           }while(quantidade>10);
    //           entrada.close();


    //            Questao_06 sequencia = new Questao_06();
    //            int escolha;
    //            System.out.println("Digite a quantidade de numeros para a sequencia: ");
    //            escolha=entrada.nextInt();
    //            
    //            sequencia.fibonacci(escolha, entrada);
    //            entrada.close();



                  Questao_07 preencher = new Questao_07();
                  String encontrar, nome;
                  String [] nomes= new String [10];
                  System.out.println("Vamos começar! ");
                  for (int i=0; i<10; i++){
                      System.out.println("Digite o "+(i+1)+"/10 nome: ");
                      nomes[i]=entrada.nextLine();
                  }
                  
                  System.out.println("Digite o nome a ser buscado: ");
                  nome = entrada.nextLine();
                  preencher.encontrar(nome);
                  entrada.close();

                  
    }
    
}
