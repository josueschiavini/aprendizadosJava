package com.company;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        float v1 = teclado.nextFloat();
        System.out.println("Digite o segundo valor");
        float v2 = teclado.nextFloat();
        System.out.println("Digite o terceiro valor");
        float v3 = teclado.nextFloat();
        System.out.println("Digite o quarto valor");
        float v4 = teclado.nextFloat();

        float soma = v1 + v2;
        float divisao = soma / v3;
        float multiplica = divisao * v4;

        float resultado = multiplica;

        System.out.println("O resultado é " + resultado);
    }
}
