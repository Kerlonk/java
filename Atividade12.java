//String 3. Desenvolva um jogo em que o usuário tenha que adivinhar uma palavra que será mostrada com as letras embaralhadas. O programa terá uma lista de palavras lidas de um arquivo texto ou de um vetor e será escolhida uma aleatoriamente. O jogador terá seis tentativas para adivinhar a palavra. Ao final a palavra deve ser mostrada na tela, informando se o usuário ganhou ou perdeu o jogo.

import java.util.*;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] palavras = {"prato", "banana", "gato", "computador", "janela"};

        Random rand = new Random();
        String palavraEscolhida = palavras[rand.nextInt(palavras.length)];


        List<Character> letras = new ArrayList<>();
        for (char c : palavraEscolhida.toCharArray()) {
            letras.add(c);
        }

        Collections.shuffle(letras);

        StringBuilder embaralhada = new StringBuilder();
        for (char c : letras) {
            embaralhada.append(c);
        }

        System.out.printf("====JOGO DA ADIVINHAÇÂO====\n");

        System.out.println("Palavra embaralhada: " + embaralhada);

        int tentativas = 6;
        for (int i = 1; i <= tentativas; i++) {
            System.out.printf("\nAdivinhe a palavra: ");
            String palavra = ler.nextLine();

            if (palavra.equalsIgnoreCase(palavraEscolhida)) {
                System.out.printf("Você acertou a palavra!");
                break;
            } else { 
                System.out.printf("Você errou... Tentativas restantes = " + (tentativas - i));
                if (i != tentativas) {
                    System.out.print("\nTente novamente!");
                } else {
                    System.out.print("\nSuas tentativas acabaram.");
                }
            } 
        }
    }
}
