package reset.exerciciosjavapoo.aula03;

public class Exercicio03 {

    public static void main(String[] args) {

        Mario m1 = new Mario();
        m1.nome = "Mario";
        m1.altura = 1.55;
        m1.peso = 60;
        //m1.idade = 46; está privado

        m1.imprimirCaracteristicas();
        m1.imprimirSuperpoderes();

    }
}
