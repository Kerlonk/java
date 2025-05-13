//Vetores 3.Faça um programa que some o conteúdo de dois vetores e armazene o resultado em um terceiro vetor.


import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = {10, 20, 40, 80, 160};
        int[] B = {5, 10, 20, 40, 80};
        int[] AB = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            AB[i] = A[i] + B[i];
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("Vetor AB[" + i + "]: " + AB[i]);
        }
    }
}