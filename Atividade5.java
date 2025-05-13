//Estrutura de decisão 4.As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12 unidades. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int uni;
        double maca = 1.30;

        System.out.print("Maçã - R$ 1,30 | a partir de 12 unidades - R$ 1,00\n");
        System.out.print("Digite o número de maçãs que você quer comprar: ");
        uni = ler.nextInt();

        if (uni < 12) {
            System.out.print("Maçã - R$ " + (uni * maca));
        }

        if (uni >= 12) {
            maca = 1.00;
            System.out.print("Maçã - R$ " + (uni * maca));
        }

    }
}
