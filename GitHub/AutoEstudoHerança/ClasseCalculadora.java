import java.util.Scanner;

public class ClasseCalculadora {
    
    public double somar;
    public double subtrair;
    public double multiplicar;
    public double dividir;
    public double resultado;
    public Float n1;
    public Float n2;

    double somar(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        this.n1 = teclado.nextFloat();

        System.out.println("Digite o segundo numero");
        this.n2 = teclado.nextFloat();

        this.somar = this.n1+this.n2;
        System.out.println(this.somar);

       return(somar());
    }
    double subtrair(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        this.n1 = teclado.nextFloat();

        System.out.println("Digite o segundo numero");
        this.n2 = teclado.nextFloat();

        this.subtrair = this.n1-this.n2;
        System.out.println(this.subtrair);

       return(subtrair());
    }
    double multiplicar(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        this.n1 = teclado.nextFloat();

        System.out.println("Digite o segundo numero");
        this.n2 = teclado.nextFloat();

        this.multiplicar = this.n1*this.n2;
        System.out.println(this.multiplicar);

       return(multiplicar());
    }
    double dividir(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        this.n1 = teclado.nextFloat();

        System.out.println("Digite o segundo numero");
        this.n2 = teclado.nextFloat();

        this.somar = this.n1/this.n2;
        System.out.println(this.dividir);

       return(dividir());
    }
}
