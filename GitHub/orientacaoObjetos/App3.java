
import java.util.Scanner;

public class App3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Classe3 classe = new Classe3();

        System.out.println("Digite 1, 2, ou 3");
        classe.opcao = teclado.nextInt();

        switch(classe.opcao){
            case 1:
                System.out.println("Esta no caso 1");
            break;

            case 2:
                System.out.println("Esta no caso 2");
            break;

            case 3:
                System.out.println("Esta no caso 3");
            break;
            
            default:
                System.out.println("Inexistente");
            break;
        }

    }

}
