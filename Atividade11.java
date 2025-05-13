//Strings 2.Dado uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte: quantos espaços em branco existem na frase e quantas vezes aparecem as vogais a, e, i, o, u.

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto;
        int espacos = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;


        System.out.printf("Informe a sua frase:\n");
        texto = ler.nextLine();
        texto = texto.toLowerCase();

        for (int j = 0; j < texto.length(); j++) {
            char c = texto.charAt(j);
        
            if (c == ' ') {
                espacos++;
            } else if (c == 'a') {
                a++;
            } else if (c == 'e') {
                e++;
            } else if (c == 'i') {
                i++;
            } else if (c == 'o') {
                o++;
            } else if (c == 'u') {
                u++;
            }
        }

        System.out.println("Espaços em branco: " + espacos);
        System.out.println("Quantidade de 'a': " + a);
        System.out.println("Quantidade de 'e': " + e);
        System.out.println("Quantidade de 'i': " + i);
        System.out.println("Quantidade de 'o': " + o);
        System.out.println("Quantidade de 'u': " + u);

    }
}