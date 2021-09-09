package reset.exerciciosjavapoo.exercicio09;

public class Exercicio09 {

    public static void main(String[] args) {

        // Tentando instanciar um objeto do tipo Personagem, mas não é possível porque a classe é abstrata. Por isso, a linha está comentada.
        //Personagem personagem = new Personagem("Mario", 40, 1.60);

        // Criando o personagem Mario
        Mario mario = new Mario("Mario", 40, 1.60);

        // Criando o personagem Luigi
        Luigi luigi = new Luigi("Luigi", 37, 1.80);

        // Criando o personagem Yoshi
        Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

        // Teste para verificar se o Mario monta no Yoshi
        mario.imprimeMontadoNoYoshi();
        mario.montarNoYoshi(yoshi);
        mario.imprimeMontadoNoYoshi();

        // Teste para verificar se o Luigi voa
        luigi.voar();

        // Teste para verificar se a velocidade do yoshi aumenta a cada 2 frutas comidas
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());

    }
}
