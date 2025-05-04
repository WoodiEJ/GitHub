import java.util.Scanner;

public class Moto2 extends Veiculo{
    
    String exibirinfo(){
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome da moto");
        this.nome = teclado.nextLine();

        System.out.println("Digite a marca dele");
        this.marca = teclado.nextLine();

        System.out.println("Digite o ano dele");
        this.ano = teclado.nextInt();

        System.out.println("Dados da moto");
        System.out.println("Nome: "+ this.nome+"\nMarca: "+ this.marca+"\nAno: "+this.ano);

        return(exibirinfo());
    }

}
