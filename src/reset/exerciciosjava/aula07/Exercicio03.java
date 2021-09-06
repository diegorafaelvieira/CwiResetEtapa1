package reset.exerciciosjava.aula07;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        /*
        Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor por hora R$ ");
        double valorHora = sc.nextDouble();
        System.out.println("Informe o número de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("O salário é R$ " + (valorHora * horasTrabalhadas));
    }
}
