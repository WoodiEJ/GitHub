
import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Nove ex9 = new Nove();

        System.out.println("Digite um valor");
        ex9.valor = teclado.nextInt();

        if (ex9.valor>=350 && ex9.valor<=500) {
            System.out.println("Se encontra entre 350 e 500");
        }else{
            System.out.println("Nao se encontra entre 350 e 500");
        }

    }

}
