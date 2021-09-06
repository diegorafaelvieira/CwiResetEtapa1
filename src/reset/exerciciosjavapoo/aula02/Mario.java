package reset.exerciciosjavapoo.aula02;

public class Mario {

    String nome;
    double altura;
    double peso;
    int idade;

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
