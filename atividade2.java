package com.company;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius");
        int temp = teclado.nextInt();
        if (temp <= 15)
            System.out.println("O clima está frio");
        else if (temp >= 16 && temp <= 25)
            System.out.println("O clima está agradável");
        else if (temp >= 26 && temp <= 32)
            System.out.println("O clima está quente");
        else
            System.out.println("O clima está muito quente");
    }
}
