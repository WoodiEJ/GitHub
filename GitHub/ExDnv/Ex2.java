
import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        IouD igual = new IouD();

        System.out.println("Digite um numero");
        igual.numero = teclado.nextInt();

        if (igual.numero%2==0) {
            System.out.println("É par");
        }else{
            System.out.println("Nao é par");
        }
        

    }

}
