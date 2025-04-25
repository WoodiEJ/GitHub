
import java.util.Scanner;

public class Metodo_retorno_parametro {
    
    public String carro;
    public int velocidade;


    //Metodo com parametro
    int turboCarro(int turbo){

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do carro");
        this.carro = teclado.nextLine();

        System.out.println("Digite a Velocidade");
        this.velocidade = teclado.nextInt();

        int velocidadetotal = this.velocidade+turbo;
        System.out.println("A velocidae total é: "+velocidadetotal+" KM");

        return velocidadetotal;

    }

}
