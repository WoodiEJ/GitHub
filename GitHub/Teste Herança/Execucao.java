
import java.util.Scanner;

public class Execucao {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    Cliente cliente = new Cliente();
    Fornecedor fornecedor = new Fornecedor();
    Usuario usuario = new Usuario();
    Produto produto = new Produto();


    System.out.println("Digite o nome do cliente");
    cliente.nome = teclado.nextLine();

    System.out.println("Digite o CPF do cliente");
    cliente.cpf = teclado.nextLine();

    

    }

}
