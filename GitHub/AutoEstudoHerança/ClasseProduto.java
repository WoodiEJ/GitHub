
public class ClasseProduto {
    
    public String nome = "Arroz";
    public int  preco = 12;
    public int quantidade = 50;

    void calcularTotal(){

        int estoque = this.quantidade;
        System.out.println("O estoque é: " + estoque);

    }

}
