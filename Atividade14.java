//Vetores 2.Faça um programa que copie o conteúdo de um vetor em um segundo vetor.

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = {10, 20, 40, 80, 160};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("Vetor B[" + i + "]: " + B[i]);
        }
    }
}