import java.util.Scanner;

public class Retorno {
    
    public String nome;
    public Float n1;
    public Float n2;

    //Metodo com retorno
    Float calcularmedia(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        this.n1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota");
        this.n2 = teclado.nextFloat();

        Float media = (this.n1+this.n2)/2;
        System.out.println(media);


        return media;
        
    }

}
