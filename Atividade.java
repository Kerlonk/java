//Estrutura sequencial 2.Faça um programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Informe a nota do primeiro bimestre: ");
        a = ler.nextInt();

        System.out.print("Informe a nota do segundo bimestre: ");
        b = ler.nextInt();

        System.out.print("Informe a nota do terceiro bimestre: ");
        c = ler.nextInt();

        System.out.print("Informe a nota do quarto bimestre: ");
        d = ler.nextInt();

        double media = (double)(a + b + c + d) / 4;

        System.out.println("MÉDIA = " + media);
    }
}
