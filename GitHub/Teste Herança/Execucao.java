import java.util.Scanner;

public class Execucao {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    Cliente cliente = new Cliente();
    Fornecedor fornecedor = new Fornecedor();
    Usuario usuario = new Usuario();
    Produto produto = new Produto();

    //Cadastro do cliente
    System.out.println("Digite o nome do cliente");
    cliente.nome = teclado.nextLine();

    System.out.println("Digite o CPF do cliente");
    cliente.cpf = teclado.nextLine();

    //Cadastro do fornecedor
    System.out.println("Digite o nome do forcenedor");
    fornecedor.nome = teclado.nextLine();

    System.out.println("Digite o estoque");
    fornecedor.estoque = teclado.nextInt();

    //Cadastro de produto
    System.out.println("Digite o nome do produto");
    produto.nome = teclado.nextLine();

    System.out.println("Digite o preço do produto");
    produto.preco = teclado.nextInt();

    //Cadastro do usuario
    System.out.println("Digite o nome do usuario");
    usuario.nome = teclado.nextLine();

    System.out.println("Digite a senha");
    usuario.senha = teclado.nextLine();

    }

}
