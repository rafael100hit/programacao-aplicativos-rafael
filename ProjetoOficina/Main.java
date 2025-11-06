
package projetooficina;

import java.util.Scanner;

public class ProjetoOficina {

    
    public static void main(String[] args) {
        
        Scanner imput=new Scanner(System.in);
        Usuario usuario = new Usuario();
        String nome, email, senha;
        
        System.out.println("Iniciando");
        usuario.NovoUsuario(nome, email, senha);
        
    }
    
}
