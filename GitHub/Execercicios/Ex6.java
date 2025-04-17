
import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Volume volume = new Volume();

        System.out.println("Digite o comprimento da caixa");
        volume.comprimento = teclado.nextFloat();

        System.out.println("Digite a largura da caixa");
        volume.largura = teclado.nextFloat();

        System.out.println("Digite a altura da caixa");
        volume.altura = teclado.nextFloat();

        volume.volume = volume.comprimento * volume.largura * volume.altura;

        System.out.println("O volume da caixa é: " + volume.volume);

    }

}
