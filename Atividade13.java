//Vetores 1.Fazer um algoritmo que calcule e imprima o soma, a média, o maior e o menor dos valores armazenados em um vetor A de 100 elementos numéricos a serem lidos do dispositivo de entrada padrão.

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[100];

        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            A[i] = ler.nextInt();

            soma += A[i];

            if (A[i] > maior) {
                maior = A[i];
            }

            if (A[i] < menor) {
                menor = A[i];
            }

            double media = (double) soma / (i + 1);

            System.out.println("-> Soma atual: " + soma);
            System.out.println("-> Média atual: " + media);
            System.out.println("-> Maior valor até agora: " + maior);
            System.out.println("-> Menor valor até agora: " + menor);
            System.out.println("-----------------------------");
        }

        System.out.println("\nTodos os 100 valores foram processados.");
    }
}