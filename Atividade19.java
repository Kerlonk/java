import java.util.Scanner;

public class Atividade19 {

    public static boolean ehPrefixo(String palavra1, String palavra2) {
        return palavra2.startsWith(palavra1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        boolean resultado = ehPrefixo(palavra1, palavra2);
        System.out.println("A primeira palavra é prefixo da segunda? " + resultado);
        sc.close();
    }
}
