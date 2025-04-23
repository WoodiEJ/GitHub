
import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Dez ex10 = new Dez();

        System.out.println("Digite a primeira nota, até 3");
        ex10.n1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota, até  3");
        ex10.n2 = teclado.nextFloat();

        System.out.println("Digite a terceira nota, até 4");
        ex10.n3 = teclado.nextFloat();

        ex10.media = ex10.n1+ex10.n2+ex10.n3;

        if(ex10.media>=5){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno foi reprovado");
        }

    }

}
