package reset.exerciciosjavapoo.exercicio10;

public class Mario extends Personagem {

    //Atributos
    private Yoshi yoshi;

    //Métodos Especiais
    //Construtor
    public Mario(String nome, int idade, double altura) {
        super(nome, idade, altura);
        this.yoshi = yoshi;
    }

    //Métodos Públicos
    public void montarNoYoshi(Yoshi yoshi) {
        this.yoshi = yoshi;
    }

    public void imprimeMontadoNoYoshi() {
        if (this.yoshi != null) {
            System.out.println("Mario está montado no Yoshi");
        } else {
            System.out.println("Mario não está montado no Yoshi");
        }
    }

    @Override
    public void crescer() {
        this.altura = this.altura * 1.5;
    }

}
