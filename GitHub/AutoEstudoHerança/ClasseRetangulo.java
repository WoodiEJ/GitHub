import java.util.Scanner;

public class ClasseRetangulo {
    
    public Float largura;
    public Float altura;

    Float imprimir(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a largura");
        this.largura = teclado.nextFloat();

        System.out.println("Diggite a altura");
        this.altura = teclado.nextFloat();
        
        Float area = this.altura*this.largura;

        System.out.println("A área é: "+area);

       return(imprimir()); 
    }

}
