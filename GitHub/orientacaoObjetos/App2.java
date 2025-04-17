
import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Classe2 classe = new Classe2();

        System.out.println("Digite a primeira nota");
        classe.n1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota");
        classe.n2 = teclado.nextFloat();

        classe.media = (classe.n1 + classe.n2)/2;

        if (classe.media>=6) {
            System.out.println("A media do aluno ficou assim: " + classe.media+" ,entao o aluno esta aprovado");
        }else{
            System.out.println("A media do aluno ficou assim: " + classe.media+" ,entao aluno esta reprovado");
        }
        

    }

}
