
import java.util.Scanner;

public class ClasseFilme {
    
    public String nome;
    public int ano;

    String getInfo(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do filme");
        this.nome = teclado.nextLine();

        System.out.println("Digite o ano do filme");
        this.ano = teclado.nextInt();

        System.out.println("O nome do filme é " + this.nome+ "\nE o ano é "+this.ano);

        return(getInfo());
    }

}
