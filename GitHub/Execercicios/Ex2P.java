
import java.util.Scanner;

public class Ex2P {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Digite a base");
        triangulo.base = teclado.nextFloat();

        System.out.println("Digite a altura");
        triangulo.altura = teclado.nextFloat();

        triangulo.area = (triangulo.base * triangulo.altura)/2;
        System.out.println("A área do triângulo é: " + triangulo.area);

    }

}
