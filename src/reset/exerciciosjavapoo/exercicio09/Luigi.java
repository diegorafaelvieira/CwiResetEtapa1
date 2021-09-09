package reset.exerciciosjavapoo.exercicio09;

public class Luigi extends Personagem {


    //Métodos Públicos
    public void voar() {
        System.out.println("Luigi está voando");
    }

    //Métodos Especiais
    //Construtor
    public Luigi(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }
}
