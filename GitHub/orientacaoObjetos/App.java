public class App {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Carro carro = new Carro();

        System.out.println(pessoa.nome + " " + pessoa.genero + " " + " " +pessoa.idade); 
        System.out.println(pessoa2.nome + " " + pessoa2.genero + " " + " " +pessoa2.idade);
        
        System.out.println(carro.nome + " " +  carro.marca + " " + carro.combustivel + " " + carro.ano + " " + carro.km);

    }

}
