package reset.exerciciosjava.aula07;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        /*
        Faça um programa que tenha como entradas 4 notas e imprima a média.
        Utilize a classe Scanner para obter as entradas.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a nota 4:");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);
    }
}
