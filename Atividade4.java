//Estrutura de decisão 3.Faça um programa que receba como entrada três valores e os imprima em ordem crescente.
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = ler.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = ler.nextInt();

        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
