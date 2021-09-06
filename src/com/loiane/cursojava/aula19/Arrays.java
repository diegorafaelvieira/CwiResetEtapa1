package com.loiane.cursojava.aula19;

import com.sun.security.jgss.GSSUtil;

public class Arrays {

    public static void main(String[] args) {

        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;



        //double temp[]; // dificulta a leitura por outro desenvolvedor

        double[] temperaturas = new double[365]; //Boa prática Java
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura no dia 1 é: " + temperaturas[0]);
        System.out.println("O valor da temperatura no dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Valores do array: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }

        //FOR melhorado  PORÉM NÃO TEMOS o INDICE -> apenas mostrar a informação
        for (double temp : temperaturas) {
            System.out.println(temp);
        }


        //Exemplo 02 MATRIZ
        System.out.println("Exemplo com arrays multidimensionais");
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for(double[] notasAluno : notasAlunos) {
            for(double nota : notasAluno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}
