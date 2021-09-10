package reset.exerciciosjavapoo.exercicio10;

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

    @Override
    public void crescer() {
        this.altura = this.altura * 1.75;
    }
}
