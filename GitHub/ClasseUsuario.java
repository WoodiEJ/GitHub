import java.util.Scanner;

public class ClasseUsuario {
    
    public String nome;
    public String login;
    public String senha;

    void usuario(){
        
        Scanner teclado = new Scanner(System.in);
        ClasseUsuario usuario = new ClasseUsuario();

        System.out.println("Digite seu nome");
        usuario.nome = teclado.nextLine();

        System.out.println("Digite seu login");
        usuario.login = teclado.nextLine();

        System.out.println("Digite sua senha");
        usuario.senha = teclado.nextLine();

    }

}
