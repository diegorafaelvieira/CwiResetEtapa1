package reset.exerciciosjava.aula08;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Faça um programa que tenha como entradas 4 notas e calcule a média.
        Ao final o programa deve apresentar:
        A mensagem Aluno aprovado, se a média alcançada for igual ou superior a sete;
        A mensagem Aluno reprovado, se a média for inferior a sete;
        A mensagem Aluno aprovado com louvores, se a média for igual a dez.
        */

        System.out.println("Informe a nota1:");
        double n1 = sc.nextDouble();
        System.out.println("Informe a nota2:");
        double n2 = sc.nextDouble();
        System.out.println("Informe a nota3:");
        double n3 = sc.nextDouble();
        System.out.println("Informe a nota4:");
        double n4 = sc.nextDouble();

        double media = (n1+n2+n3+n4) / 4;

        if (media == 10) {
            System.out.println("Aluno aprovado com louvores com média: " + media);
        } else if (media >= 10) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }

    }
}
