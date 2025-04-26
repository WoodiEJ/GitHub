
import java.util.Scanner;

public class ClasseLivro {
    
    public String titulo;
    public String autor;

    String descricao(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o titulo do livro");
        this.titulo = teclado.nextLine();

        System.out.println("Digite o autor do livro");
        this.autor = teclado.nextLine();

        System.out.println("O titulo do livro é: " + this.titulo+"\nO autor é: "+this.autor);

        return(descricao());
    }

}
