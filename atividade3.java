package com.company;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
        float [][] matriz=new float[3][3];
        float resultado1,resultado2,resultado3;

        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                System.out.println("Digite um valor");
                matriz[i][j]=teclado.nextFloat();
            }
        }
        resultado1=matriz[1][0]+matriz[1][1]+matriz[1][2];
        resultado2=matriz[0][0]*matriz[1][0]*matriz[2][0];
        resultado3=matriz[2][0]+matriz[2][1]+matriz[2][2];

        System.out.println("A soma dos elementos da segunda linha da matriz é " + resultado1);
        System.out.println("A multiplicação dos elementos da primeira coluna da matriz é " + resultado2);
        System.out.println("A soma dos elementos da terceira linha da matriz é " + resultado3);
    }
}
