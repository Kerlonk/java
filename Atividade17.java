//Matrizes 2. Dada a seguinte matriz, calcule: A soma dos elementos de primeira coluna; O produto dos elementos da primeira linha; A soma de todos os elementos; O produto da diagonal principal.

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        sc.close();
    }
}
