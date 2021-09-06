package reset.exerciciosjavapoo.aula03;

public class Mario {

    public String nome;
    protected double altura;
    protected double peso;
    private int idade;

    void imprimirCaracteristicas() {
        System.out.println("Mario Bros { " +
                "Nome: '" + this.nome + '\'' +
                ", Altura: " + this.altura +
                ", Peso: " + this.peso +
                ", Idade: " + this.idade + " }");

    }

    void imprimirSuperpoderes() {
        System.out.println("Super força, Super pulo, Super velocidade e outros poderes");
    }


}
