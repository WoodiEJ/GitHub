
import java.util.Scanner;

public class ClasseRelogio {
    
    public int hora;
    public int m;

    String mostrarHora(){
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as horas");
        this.hora = teclado.nextInt();

        System.out.println("Digite os minutos");
        this.m = teclado.nextInt();

        System.out.println(this.hora+":"+this.m);

        return(mostrarHora());
    }

}
