package reset.exerciciosjavapoo.exercicio06;

public class Mario {

    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    private int quantidadeDeMoedas = 0;
    private int quantidadeDeVidas = 1;


    //Construtores
    public Mario() {
        this.nome = "Mario Bros";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;
    }

    public Mario(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
    }

    //GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    //Métodos Personalizados
    public void perderEstamina() {
        this.estamina = this.estamina - 10;
        if(this.estamina < 0) {
            this.estamina = 0;
        }
    }

    public void ganharEstamina() {
        this.estamina = this.estamina + 5;
        if (this.estamina > 100) {
            this.estamina = 100;
        }
    }

    public void crescer() {

        this.altura = this.altura * 2;
    }

    public void revigorar() {
        this.estamina = 100;
    }

    public void morrer() {
        this.quantidadeDeVidas--;
        this.estamina = 0;

        if (this.quantidadeDeVidas < 0) {
            this.quantidadeDeVidas = 0;
        }
        if (this.quantidadeDeVidas >= 0) {
            this.estamina = 100;
        }
    }

    public void coletarMoedas() {
        this.quantidadeDeMoedas++;

        if (this.quantidadeDeMoedas % 10 == 0) {
            this.quantidadeDeVidas++;
        }
    }

    void imprimirCaracteristicas() {
        System.out.println("Mario Bros { " +
                "Nome: '" + this.nome + '\'' +
                ", Altura: " + this.altura +
                ", Peso: " + this.idade +
                ", Estamina: " + this.estamina + " }");

    }

    void imprimirSuperpoderes() {
        System.out.println("Super força, Super pulo, Super velocidade e outros poderes");
    }


}
