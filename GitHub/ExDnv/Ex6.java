
import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Seis ex6 = new Seis();

        System.out.println("Digite qual foi o total das suas vendas");
        ex6.vendas = teclado.nextInt();

        if (ex6.vendas>2000) {
            ex6.bonus = ex6.vendas + 50 + (ex6.vendas*0.10);
            System.out.println("Seu salario vai ficar assim " + ex6.bonus);
        }else{
            ex6.bonus = ex6.vendas + (ex6.vendas * 0.075);
            System.out.println("Seu salario vai ficar assim " + ex6.bonus);
        }

    }

}
