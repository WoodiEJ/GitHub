
import java.util.Scanner;

public class C_Produto {
    
    public String nome;
    public Float preco;
    public double desconto;
    
    void desconto(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        nome = teclado.nextLine();

        System.out.println("Digite o preço do produto");
        preco = teclado.nextFloat();

        if (preco>100) {
            desconto = preco-(preco*0.10);
            System.out.println("O preço ficou assim: "+desconto);
        }

    }

}
