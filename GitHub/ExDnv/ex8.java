
import java.util.Scanner;

public class ex8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Oito ex8 = new Oito();

        System.out.println("Digite sua idade");
        ex8.idade = teclado.nextInt();

        if (ex8.idade<12) {
            System.out.println("Criança");
        }else if (ex8.idade>=12 && ex8.idade<18) {
            System.out.println("Adolescente");
        }else if (ex8.idade>=18 && ex8.idade<30) {
            System.out.println("Jovem");
        }else if(ex8.idade>=30 && ex8.idade<=60){
            System.out.println("Adulto");
        }else if (ex8.idade>60) {
            System.out.println("Idoso");
        }

    }

}
