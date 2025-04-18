
import java.util.Scanner;

public class Ex3P {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Info info = new Info();

        System.out.println("Digite seu salario");
        info.sb = teclado.nextFloat();

        info .sl = info.sb - ((info.sb*0.1) + (info.sb*0.30));

        System.out.println("Seu salario depois dos impostos ficara assim: " + info.sl);

    }

}
