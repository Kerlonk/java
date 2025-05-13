//Funções 3. Faça um programa com duas funções, uma que recebe uma temperatura em Fahrenheit e retorna em Celcius e outra que faz o inverso. Lembrando que as fórmulas são ℃ = (℉ - 32) ÷ 1,8 e ℉ = ℃ × 1,8 + 32.



import java.util.Scanner;

public class Atividade21 {

    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) / 1.8;
    }

    public static double celsiusParaFahrenheit(double c) {
        return (c * 1.8) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Em Celsius: " + fahrenheitParaCelsius(f));

        System.out.print("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Em Fahrenheit: " + celsiusParaFahrenheit(c));

        sc.close();
    }
}