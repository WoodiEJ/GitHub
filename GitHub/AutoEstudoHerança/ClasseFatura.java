import java.util.Scanner;

public class ClasseFatura {
    
    public String descricao;
    public int quantidade = 1;
    public int preco;

    double faturaTotal(){
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a descrição da fatura");
        this.descricao = teclado.nextLine();

        System.out.println("Digite o preço");
        this.preco = teclado.nextInt();

        System.out.println("A fatura é de "+this.descricao+"\nE o preço é de "+this.preco);
        
        return(faturaTotal());
    }

}
