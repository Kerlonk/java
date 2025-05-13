//Estrutura de repetição 3.Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, resultado = 1;
        int i = 0;

        System.out.print("Informe a base: ");
        num1 = ler.nextInt();

        System.out.print("Informe o expoente: ");
        num2 = ler.nextInt();

        while (i!=num2) {
            resultado *=num1;
            i++;
        }

        System.out.print("Resultado = " + resultado);

    }
}