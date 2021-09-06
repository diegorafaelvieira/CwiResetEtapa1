package reset.exerciciosjava.aula07;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        /*
        Faça um programa que tenha como entradas dois números e imprima a soma de ambos.
        Utilize a classe Scanner para obter as entradas.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int numero2 = sc.nextInt();

        System.out.println("A soma dos valores é " + (numero1 + numero2));
    }
}
