package reset.exerciciosjavapoo.exercicio09;

public class Yoshi extends Personagem {

    //Atributos
    private int quantidadeDeFrutasComidas;
    private int velocidade;

    //Métodos Especiais
    //Construtor
    public Yoshi(String nome, int idade, double altura) {
        super(nome, idade, altura);
        this.quantidadeDeFrutasComidas = 0;
        this.velocidade = 10;
    }

    //GET

    public int getVelocidade() {
        return velocidade;
    }


    //Métodos Públicos
    public void comerFruta() {
        this.quantidadeDeFrutasComidas ++;
        if (this.quantidadeDeFrutasComidas % 2 == 0) {
            this.velocidade *= 2;
        }
    }

}
