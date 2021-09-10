package reset.exerciciosjavapoo.exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {

        /// Criando o personagem Mario
        Mario mario = new Mario("Mario", 40, 1.60);

        // Criando o personagem Luigi
        Luigi luigi = new Luigi("Luigi", 37, 1.80);

        // Criando o personagem Yoshi
        Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

        // Teste para verificar altura do Mario após o crescimento
        mario.imprimirCaracteristicas();
        mario.crescer();
        mario.imprimirCaracteristicas();

        // Teste para verificar altura do luigi após o crescimento
        luigi.imprimirCaracteristicas();
        luigi.crescer();
        luigi.imprimirCaracteristicas();

        // Teste para verificar altura do yoshi após o crescimento
        yoshi.imprimirCaracteristicas();
        yoshi.crescer();
        yoshi.imprimirCaracteristicas();

        // Teste para verificar altura do salto padrão
        luigi.saltar();
        mario.saltar();
        yoshi.saltar();

        // Teste para verificar altura do salto sobre obstaculos
        luigi.saltar(2);
        mario.saltar(3);
        yoshi.saltar(10);

    }
}
