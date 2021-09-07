package reset.exerciciosjavapoo.exercicio06;

public class Exercicio06 {

    public static void main(String[] args) {

        System.out.println("Teste para ver se o mario inicializa os novos atributos");
        Mario mario = new Mario();
        mario.imprimirCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após revigorar");
        Mario mario2 = new Mario();
        mario2.imprimirCaracteristicas();
        mario2.perderEstamina(); // desconta 10
        mario2.perderEstamina(); // desconta 10
        mario2.imprimirCaracteristicas();
        mario2.revigorar();
        mario2.imprimirCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario atualiza a quantidade de moedas após a coleta");
        Mario mario3 = new Mario();
        mario3.imprimirCaracteristicas();
        mario3.coletarMoedas();
        mario3.coletarMoedas();
        mario3.coletarMoedas();
        mario3.imprimirCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario ganha uma vida a cada 10 moedas coletadas");
        Mario mario4 = new Mario();
        mario4.imprimirCaracteristicas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.imprimirCaracteristicas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.imprimirCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario perde uma vida após morrer");
        Mario mario5 = new Mario();
        mario5.imprimirCaracteristicas();
        //coletar 10 moedas para ganhar mais uma vida
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        //verificando se ganhou uma vida
        mario5.imprimirCaracteristicas();
        //morrer
        mario5.morrer();
        //verificando se perdeu uma vida
        mario5.imprimirCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após morrer e ainda possuir vida");
        Mario mario6 = new Mario();
        mario5.imprimirCaracteristicas();
        //coletar 10 moedas para ganhar mais uma vida
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        //perder estamina
        mario6.perderEstamina();
        //verificando se ganhou uma vida e se atualizou a estamina
        mario6.imprimirCaracteristicas();
        //morrer
        mario6.morrer();
        //verificando se perdeu uma vida e se reiniciou a estamina
        mario6.imprimirCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario mantém a quantidade de vidas em 0 após morrer 2 vezes");
        Mario mario7 = new Mario();
        mario7.imprimirCaracteristicas();
        mario7.morrer();
        mario7.morrer();
        mario7.imprimirCaracteristicas();
        System.out.println("---");

    }
}
