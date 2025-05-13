//Matrizes 1.Faça um programa para ler e imprimir uma matriz 2 × 4 de números inteiros.

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma de todos os elementos é: " + soma);
        sc.close();
    }
}
