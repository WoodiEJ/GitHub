
import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Cinco ex5 = new Cinco();

        System.out.println("Digite sua altura");
        ex5.altura = teclado.nextFloat();

        System.out.println("Diga seu sexo \n1 para homem e 2 para mulher");
        ex5.sexo = teclado.nextInt();

        ex5.pesoideal1 = (72.7*ex5.altura)-58;
        ex5.pesoideal2 = (62.1*ex5.altura)-44.7;

        if(ex5.sexo==1){
            System.out.println("Você é homem\nE esse é ser seu peso ideal " + ex5.pesoideal1);
        }else if(ex5.sexo==2){
            System.out.println("Você é mulher\nE esse é ser seu peso ideal " + ex5.pesoideal2);
        }

    }

}
