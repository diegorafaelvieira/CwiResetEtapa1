package reset.exerciciosjavapoo.exercicio07;

public class Exercicio07 {

    public static void main(String[] args) {

        System.out.println("Teste para verificar a altura do salto do Mario");
        Personagem personagem = new Personagem("Mario", 40, 1.60);
        personagem.imprimirCaracteristicas();
        personagem.saltar();
        System.out.println("---");

        System.out.println("Teste para verificar a altura do salto do Luigi");
        Personagem luigi = new Personagem("Luigi", 40, 1.80);
        luigi.imprimirCaracteristicas();
        luigi.saltar();
        System.out.println("---");

    }
}
