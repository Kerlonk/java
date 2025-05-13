//Funções 2. Crie uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.

import java.util.Scanner;

public class Atividade20 {

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int resultado = somar(num1, num2, num3);
        System.out.println("A soma dos três números é: " + resultado);

        sc.close();
    }
}

