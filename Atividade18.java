//Matrizes 3. Dada as matrizes A e B determine A + B.

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] soma = new int[2][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
