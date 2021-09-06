package reset.exerciciosjava.aula10;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        /*
        Crie um programa que receba 5 valores e armazene em um vetor.
        Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor
        multiplicados por 2. Ou seja: segundoVetor[i] = primeiroVetor[i] * 2.
        No final, imprima o conteúdo dos dois vetores.
         */


        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[5];

        System.out.println("Inserindo os valores no array");

        for(int i = 0; i < array1.length; i++) {
            System.out.println("Insira o " + (i+1) + "º valor:");
            array1[i] = scan.nextInt();
        }

        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i] * 2;
        }

        //Imprimi Array1
        System.out.println("Valores Primeiro Array");
        for (int valor : array1) {
            System.out.println(valor);
        }

        //Imprimi Array2
        System.out.println("Valores Segundo Array");
        for (int valor : array2) {
            System.out.println(valor);
        }

    }
}
