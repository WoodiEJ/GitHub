import java.util.Scanner;

public class Metodos {
    
    public String nome;
    public String telefone;
    public String cpf;
    public int numero;

    //Metodo
    void imprimiratributos(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome");
        this.nome = teclado.nextLine();

        System.out.println("Digite seu numero de telefone");
        this.telefone = teclado.nextLine();

        System.out.println("Digite seu CPF");
        this.cpf = teclado.nextLine();

        System.out.println("Digite seu numero");
        this.numero = teclado.nextInt();

        System.out.println(this.nome+" "+this.telefone+" "+this.cpf+" "+this.numero);

    }

}
