import java.util.Scanner;

public class ClasseAnimal {
    
    public String nome;
    public String especie;

    void emitirsom(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do animal");
        this.nome = teclado.nextLine();

        System.out.println("Digite o especie");
        this.especie = teclado.nextLine();

        System.out.println("Som do animal...");

    }

}
