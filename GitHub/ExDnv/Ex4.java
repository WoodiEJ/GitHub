
import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Quatro ex4 = new Quatro();

        System.out.println("Digite seu salario");
        ex4.sb = teclado.nextDouble();

        System.out.println("Digite sua idade");
        ex4.idade = teclado.nextInt();

        ex4.caso1 = ex4.sb + (ex4.sb * 0.10);
        ex4.caso2 = ex4.sb + (ex4.sb * 0.05);
         
        if (ex4.sb >= 1000 && ex4.idade > 50) {
            System.out.println("Você recebeu um bonus 10%\nE o seu sálario ficará assim: " + ex4.caso1);
        }else if(ex4.sb < 1000 && ex4.idade <= 50){
            System.out.println("Você recebeu um bonus de 5%\nE o seu salario ficara assim: " + ex4.caso2);
        }

    }

}
