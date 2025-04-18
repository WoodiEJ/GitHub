
import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Sete ex7 = new Sete();

        System.out.println("Digite a primeira nota");
        ex7.n1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota");
        ex7.n2 = teclado.nextFloat();

        System.out.println("Digite a terceira nota");
        ex7.n3 = teclado.nextFloat();

        System.out.println("Digite a quarta nota");
        ex7.n4 = teclado.nextFloat();

        ex7.media = (ex7.n1 + ex7.n2 + ex7.n3 + ex7.n4)/4;

        if (ex7.media>7) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }

}
