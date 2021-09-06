package reset.exerciciosjava.aula08;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Faça um Programa que leia um número e exiba o dia correspondente da semana.
        (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que não corresponda à um dia da semana,
        então deve imprimir a mensagem Valor inválido!.
         */


        System.out.println("Informe o dia da semana (1-7)");
        int diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Valor inválido!"); break;
        }
    }
}
