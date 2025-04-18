
import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Tres ex3 = new Tres();

        System.out.println("Digite a primeira nota");
        ex3.n1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota");
        ex3.n2 = teclado.nextFloat();

        System.out.println("Digite a terceira nota");
        ex3.n3 = teclado.nextFloat();

        ex3.media = (ex3.n1 + ex3.n2 + ex3.n3)/3;

        if (ex3.media>=7) {
            System.out.println("O aluno está aprovado");
        }else if(ex3.media>=5 && ex3.media<7){
            System.out.println("O aluno está de recuperação");
        }else{
            System.out.println("O aluno está reprovado");
        }

    }

}
