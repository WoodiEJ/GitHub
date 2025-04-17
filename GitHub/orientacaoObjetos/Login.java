
import java.util.Scanner;

public class Login {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Sistema sistema = new Sistema();

        System.out.println("Digite seu nome");
        sistema.nome = teclado.nextLine();

        System.out.println("Digite seu Cpf");
        sistema.cpf = teclado.nextLine();

        System.out.println(sistema.nome +" "+ sistema.cpf);

    }

}
