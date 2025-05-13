//Strings 1.Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o nome do usuário de trás para frente utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas.

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;

        System.out.printf("Informe o seu nome:\n");
        nome = ler.nextLine();

        StringBuilder stringBuilder = new StringBuilder(nome);

        stringBuilder.reverse();

        String palavraInvertida = stringBuilder.toString();
        System.out.println(palavraInvertida);

    }
}