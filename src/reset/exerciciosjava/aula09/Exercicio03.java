package reset.exerciciosjava.aula09;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        /*
        Faça um programa que leia 5 números e informe o maior número.
         */

        Scanner scan = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o " + i + "º valor: ");
            int valor = scan.nextInt();

            if (valor > maior) {
                maior = valor;
            }

        }

        System.out.println("O maior valor informado foi: " + maior);
    }
}
