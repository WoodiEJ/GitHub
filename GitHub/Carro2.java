
import java.util.Scanner;

public class Carro2 extends Veiculo{
    
    String exibir(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do carro");
        this.nome = teclado.nextLine();

        System.out.println("Digite a marca dele");
        this.marca = teclado.nextLine();

        System.out.println("Digite o ano dele");
        this.ano = teclado.nextInt();

        System.out.println("Dados do carro");
        System.out.println("Nome: "+ this.nome+"\nMarca: "+ this.marca+"\nAno: "+this.ano);

        return(this.nome+this.marca+this.ano);
    }

}
