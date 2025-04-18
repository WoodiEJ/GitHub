
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Um ex1 = new Um();

        System.out.println("Digite o primeiro valor");
        ex1.valor1 = teclado.nextInt();
        
        System.out.println("Digite o segundo valor");
        ex1.valor2 = teclado.nextInt();

        if (ex1.valor1==ex1.valor2) {
            System.out.println("São valores iguais");
        }else{
            System.out.println("São valores diferentes");
        }

    }

}
