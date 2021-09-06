package reset.exerciciosjava.aula09;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        /*
        Faça um programa que peça uma nota, entre zero e dez.
        Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez,
        mostre uma mensagem informando o problema, mas mantenha o programa em execução pedindo novamente
        a nota até que o usuário informe um valor válido. Quando o usuário informar uma nota válida,
        imprima o valor da nota.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nota [0-10]: ");

        boolean notaValida = false;

        do {
            int nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("A nota informada foi: " + nota);
            } else {
                System.out.println("Nota inválida! Informe uma nota entre [0-10]");
            }
        }while (!notaValida);
    }
}
