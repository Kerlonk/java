//Estrutura sequencial 9.Faça um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int combustivel, km;

        System.out.print("Informe a distância total percorrida em KM: ");
        km = ler.nextInt();

        System.out.print("Informe o total gasto de combustível em LITROS: ");
        combustivel = ler.nextInt();

        double media = (double)km / combustivel;

        System.out.println("O consumo médio foi de " + media + "km/l");
    }
}
