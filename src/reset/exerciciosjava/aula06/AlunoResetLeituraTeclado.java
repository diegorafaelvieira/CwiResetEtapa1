package reset.exerciciosjava.aula06;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nomeAluno = scan.nextLine();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nomeAluno);

    }
}
