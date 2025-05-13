//Estrutura de repetição 2.Escreva um programa que pergunte ao usuário um número e após, escreva na tela a soma total de 1 até o número lido. Exemplo: 5: 1 + 2 + 3 + 4 + 5 = 15

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, soma = 0;

        System.out.print("Informe um número: ");
        num = ler.nextInt();

        for (int i = 1; i <= num; i++) {
            soma += i;

            if (i < num) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }

        System.out.println(soma);
    }
}