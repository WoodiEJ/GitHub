
import java.util.Scanner;

public class Heranca {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Classemae mae = new Classemae();
        Classefilho  filho = new Classefilho();
        Classefilha filha = new Classefilha();

        System.out.println("Digite o nome da mãe");
        mae.nome = teclado.nextLine();

        System.out.println("Digite a idade");
        mae.idade = teclado.nextInt();

        System.out.println("Digite a quantidade de filhos");
        mae.qtdfilhos = teclado.nextInt();

        System.out.println("Digite o ano de nascimento");
        mae.ano = teclado.nextInt();

        mae.cpf = teclado.nextLine();
        System.out.println("Digite o CPF");
        mae.cpf = teclado.nextLine();

        //Para o filho
        System.out.println("Digite o nome do filho");
        filho.nome = teclado.nextLine();

        System.out.println("Digite o CPF do filho");
        filho.cpf = teclado.nextLine();

        //Para a Filha
        System.out.println("Digite o nome da filha");
        filha.nome = teclado.nextLine();

        System.out.println("Digite o CPF da filha");
        filha.cpf = teclado.nextLine();

        //Imprimir atributos
        System.out.println(mae.ano+" "+mae.idade+" "+mae.qtdfilhos+" "+mae.cpf+" "+mae.nome);
        System.out.println(filho.nome+" "+filho.cpf);
        System.out.println(filha.nome+" "+filha.cpf);

    }

}
