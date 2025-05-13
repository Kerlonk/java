//Estrutura de decisão 4.Faça um programa onde serão informados as quatro notas do aluno. O programa irá então apresentar a média, se foi aprovado (nota ≥ 7) ou se ficou em exame. Caso o aluno ficou em exame, o programa irá então perguntar qual foi a nota do exame e então irá calcular a nova média (média anteior com a nota do exame) e informar se ele foi aprovado (nova média ≥ 5) ou se foi reprovado.

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c, d;
        int nota;

        System.out.print("Informe a primeira nota: ");
        a = ler.nextInt();

        System.out.print("Informe a segunda nota: ");
        b = ler.nextInt();

        System.out.print("Informe a terceira nota: ");
        c = ler.nextInt();

        System.out.print("Informe a quarta nota: ");
        d = ler.nextInt();

        double media = (double)(a + b + c + d) / 4;

        System.out.println("A sua média é = " + media);

        if (media >= 7) {
            System.out.print("Parabéns! Você foi aprovado!");
        } else {
            System.out.print("Você ficou em exame. Qual foi a sua nota de recuperação? ");
            nota = ler.nextInt();
            double novaMedia = (a + b + c + d + nota) / 5;
            System.out.println("Sua nova média é : " + novaMedia);
            if (novaMedia >= 5) {
                System.out.print("Parabéns! Você foi aprovado!");
            } else {
                System.out.print("Você foi reprovado!");
            }
        }

    }
}
