import java.util.Scanner;

public class ClassePessoa {
    
    public String nome;
    public int idade;

    void imprimir(){

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        this.nome = teclado.nextLine();

        System.out.println("Digite sua idade");
        this.idade = teclado.nextInt();

        System.out.println("O teu nome é: " + this.nome+"\nSua idade é: "+ this.idade);

    }


}
