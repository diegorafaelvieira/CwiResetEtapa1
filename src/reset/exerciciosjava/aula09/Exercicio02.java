package reset.exerciciosjava.aula09;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        /*
        Faça um programa que leia dois números e imprima todos os valores presentes no intervalo entre eles,
        um abaixo do outro. Caso o segundo número seja menor ou igual ao primeiro, solicite um novo número
        até que o segundo número seja maior que o primeiro.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor inicial: ");
        int valorInicial = scan.nextInt();

        boolean valorInicialMaiorQueInicial = false;
        int valorFinal = 0;

        do {
            System.out.println("Informe o valor final: ");
            valorFinal = scan.nextInt();

            if (valorInicial < valorFinal) {
                valorInicialMaiorQueInicial = true;

            } else {
                System.out.println("O número final precisa ser maior que o número inicial");
            }
        } while (!valorInicialMaiorQueInicial);

        for (int i = valorInicial; i <= valorFinal; i++) {
            System.out.println(i);
        }
    }

}
