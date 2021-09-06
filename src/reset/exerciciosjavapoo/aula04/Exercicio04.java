package reset.exerciciosjavapoo.aula04;

public class Exercicio04 {

    public static void main(String[] args) {

        Mario m1 = new Mario();
        m1.imprimirCaracteristicas();
        m1.imprimirSuperpoderes();
        System.out.println("---");

        Mario m2 = new Mario("Super Mario", 32, 1.67);
        m2.imprimirCaracteristicas();
        m2.imprimirSuperpoderes();
        System.out.println("---");

        Mario m3 = new Mario("Super Mario Bros", 35, 1.72);
        m3.imprimirCaracteristicas();
        m3.setNome("Irmão do Luigi");
        m3.setIdade(37);
        m3.imprimirCaracteristicas();
        m3.imprimirSuperpoderes();

    }
}
