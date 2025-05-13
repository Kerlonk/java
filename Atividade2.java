//Estrutura sequencial 5.Faça um programa que:Leia o nome;Leia o sobrenome;Concatene o nome com o sobrenome;Apresente o nome completo.
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        String sobrenome;

        System.out.printf("Informe o seu nome:\n");
        nome = ler.nextLine();

        System.out.printf("Informe o seu sobrenome:\n");
        sobrenome = ler.nextLine();

        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Seu nome completo é = " + nomeCompleto);
    }
}
