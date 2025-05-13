//Estrutura de repetição 1.Faça um programa que calcule a soma dos números inteiros de 1 a 100.

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
            System.out.printf("Soma = " + soma + "\n");
        }
    }
}
