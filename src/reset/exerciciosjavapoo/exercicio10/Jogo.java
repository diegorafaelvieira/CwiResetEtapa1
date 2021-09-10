package reset.exerciciosjavapoo.exercicio10;

import java.util.Random;

public class Jogo {

    private Personagem jogador1;
    private Personagem jogador2;

    //Métodos Especiais
    //Construtor
    public Jogo(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }


    //Métodos Públicos
    public void jogar() {

        Random geradorAleatorio = new Random();

        int qtdColetaJogador1 = geradorAleatorio.nextInt(30);
        for(int i = 0; i < qtdColetaJogador1; i++) {
            jogador1.coletarMoedas();
        }

        int qtdColetaJogador2 = geradorAleatorio.nextInt(30);
        for(int i = 0; i < qtdColetaJogador2; i++) {
            jogador2.coletarMoedas();
        }

        System.out.println("Quantidade de vezes em que o jogador 1 coletou moedas: " + qtdColetaJogador1);
        System.out.print("Resultado final do jogador 1:");
        jogador1.imprimirCaracteristicas();

        System.out.println("Quantidade de vezes em que o jogador 2 coletou moedas: " + qtdColetaJogador2);
        System.out.print("Resultado final do jogador 2:");
        jogador2.imprimirCaracteristicas();
    }


}
