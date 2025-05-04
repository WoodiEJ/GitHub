import java.util.Scanner;

public class ContaBancaria {

    public String titular1;
    public String titular2;
    public Double saldo1;
    public Double saldo2;

    void transferencia(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Você esta na opção de transferencia");
        System.out.println("Digite seu nome");
        titular1 = teclado.nextLine();

        System.out.println("Digite seu saldo");
        saldo1 = teclado.nextDouble();        

        titular2 = teclado.nextLine();
        System.out.println("Digite o nome de que vai receber");
        titular2 = teclado.nextLine();

        System.out.println("Digite quanto quer enviar");
        Double enviar = teclado.nextDouble();

        if (saldo1<enviar) {
            System.out.println("Saldo insuficiente, tente outro valor"+"\nVoce tem "+saldo1+" de reais");
        }else{
            System.out.println("Voce enviou " + enviar+" para o "+ titular2);
            saldo2 = enviar;
        }
        

    }

}
