package reset.exerciciosjava.aula10;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        /*
        Crie um programa que leia 10 valores inteiros correspondentes as idades de um grupo de pessoas
        e armazene em um vetor.
        Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior
        a 18 anos.
        Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.
         */


        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        int maiorIdade = 0;

        //Inserindo idades no array
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Insira a " + (i+1) + "ª idade: ");
            idades[i] = scan.nextInt();
        }

        //Verificando idades com maioridade
        for(int idade : idades) {
            if(idade >= 18) {
                maiorIdade++;
            }
        }

        //Imprimindo as idades
        for(int idade : idades) {
            System.out.println(idade);
        }

        //Imprimindo qtd com idade>=18
        System.out.println("Temos " + maiorIdade + " maiores de idade");

    }
}
