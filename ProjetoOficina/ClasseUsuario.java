
package projetooficina;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String [] usuarios = new String[3];

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    public String getUsuarios(){
        return usuarios[3];
    }
   
    
    public String NovoUsuario(String nome, String email, String senha){
        Scanner imput = new Scanner(System.in);
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        Pattern patternEmail = Pattern.compile(regexEmail);
        String regexSenha = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        Pattern patternSenha = Pattern.compile(regexSenha);
        
        do{
            System.out.println("Cadastrar novo usuario: ");
            
            do{
                try{
                  System.out.println("Digite o nome: ");
                  nome=imput.nextLine();  
                  if(nome.length()<10){
                      System.out.println("O nome deve ter pelo menos 10 caracteres.");
                  }
                  else{
                      System.out.println("Nome salvo!");
                  }
                }catch(NumberFormatException e){
                    System.out.println("Erro! /nDigite apenas letras!"+e.getMessage());
                }
            }while(nome.length()<10);
            
        boolean emailVal = true;
        do{
            System.out.println("Digite o email: ");
            email = imput.nextLine();
            Matcher matcherEmail = patternEmail.matcher(email);
            if(!matcherEmail.matches()){
                System.out.println("Digite um email valido! \nexemplo@dominio.com");
                emailVal = true;
            }
            else{
                System.out.println("Email salvo!");
                emailVal = false;
            }
        }while(emailVal==true);
        
        boolean senhaVal=true;
        do{
            System.out.println("Digite uma senha: ");
            senha = imput.nextLine();
            Matcher matcher = patternSenha.matcher(senha);
            if (matcher.matches()) {
            System.out.println("Senha válida!");
            senhaVal=false;
            } else {
                System.out.println("Senha inválida! Deve ter pelo menos 8 caracteres, uma letra maiúscula e um número.");
                senhaVal=true;
            }
        }while(senhaVal==true);
    
 
        }while(!usuarios[1].equalsIgnoreCase(email));
        return null;
    }
    
}
