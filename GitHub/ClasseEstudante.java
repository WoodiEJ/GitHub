import java.util.Scanner;

public class ClasseEstudante {

    public String nome;
    public String curso;
    public String matricula;

    void cadastro(){
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos cadastros deseje fazer?");
        int []vetor = new int[teclado.nextInt()];

        for(int i = 0; i<vetor.length; i++){
            nome = teclado.nextLine();
            System.out.println("Digite o nome do aluno");
            nome = teclado.nextLine();

            System.out.println("Digite o curso do aluno");
            curso = teclado.nextLine();

            System.out.println("Digite o numero da matricula dele");
            matricula = teclado.nextLine();

            // Exibição
            System.out.println("Os dados do aluno são os seguintes" + "\nNome: " + nome + "\nCurso: "   + curso + "\nMatricula: " + matricula);
            System.out.println("Tecle ENTER pra ir pro proximo cadastro");
            
        }

    }

}