
import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Salario salario = new Salario();

        System.out.println("Digite seu salario");
        salario.sb = teclado.nextFloat();

        salario.imposto = salario.sb * 0.07;
        salario.bonus = salario.sb * 0.20;
        salario.sf = salario.sb - salario.imposto + salario.bonus;
        
        System.out.println("Seu salario ficara assim: " + salario.sf);

    }

}
