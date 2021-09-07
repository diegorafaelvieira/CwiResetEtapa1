package reset.exerciciosjavapoo.exercicio05;

public class Exercicio05 {

    public static void main(String[] args) {

        Mario m1 = new Mario();
        m1.imprimirCaracteristicas();
        m1.perderEstamina();
        m1.imprimirCaracteristicas();
        System.out.println("---");


        System.out.println("Teste para ver se o Mario ganha estamina");
        Mario m2 = new Mario();
        m2.imprimirCaracteristicas();
        m2.perderEstamina();
        m2.perderEstamina();
        m2.ganharEstamina();
        m2.imprimirCaracteristicas();
        System.out.println("---");


        System.out.println("Teste para ver se o Mario mantém em 100 mesmo após o acréscimo acima deste valor");
        Mario m3 = new Mario();
        m3.imprimirCaracteristicas();
        m3.ganharEstamina();
        m3.ganharEstamina();
        m3.imprimirCaracteristicas();
        System.out.println("---");


        System.out.println("Teste para ver se o Mario mantém a estamina em 0 após o desconto até um valor menor que zero");
        Mario m4 = new Mario();
        m4.imprimirCaracteristicas();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.imprimirCaracteristicas();
        m4.perderEstamina();
        m4.perderEstamina();
        m4.imprimirCaracteristicas();
        System.out.println("---");


        System.out.println("Teste para ver se o Mario cresce");
        Mario m5 = new Mario();
        m5.imprimirCaracteristicas();
        m5.crescer();
        m5.imprimirCaracteristicas();
        System.out.println("---");
    }
}
