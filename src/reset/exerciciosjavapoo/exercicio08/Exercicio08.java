package reset.exerciciosjavapoo.exercicio08;

public class Exercicio08 {

    public static void main(String[] args) {

        // Criando o personagem Mario
        Personagem mario = new Personagem("Mario", 40, 1.60);
        // Criando o personagem Luigi
        Personagem luigi = new Personagem("Luigi", 40, 1.80);
        // Criando o jogo
        Jogo jogo = new Jogo(mario, luigi);
        // Executando o jogo
        jogo.jogar();

    }
}
