/*
Escreva um programa para, a partir de um valor informado em centavos,
indicar a menor quantidade de moedas que representa esse valor
○ Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1 real
○ Exemplo: para o valor 290 centavos, a menor quantidade de moedas é 2 moedas de 1 real, 1
moeda de 50 centavos, 1 moeda de 25 centavos, 1 moeda de 10 centavos e 1 moeda de 5
centavos
*/
import java.util.Scanner;

import java.util.Scanner;

public class exBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em centavos: ");
        int valorCentavos = scanner.nextInt();

        int[] moedas = {100, 50, 25, 10, 5, 1};
        int[] quantidadeMoedas = new int[moedas.length];

        for (int i = 0; i < moedas.length; i++) {
            quantidadeMoedas[i] = valorCentavos / moedas[i];
            valorCentavos %= moedas[i];
        }

        System.out.println("A menor quantidade de moedas é:");

        for (int i = 0; i < moedas.length; i++) {
            if (quantidadeMoedas[i] > 0) {
                if (moedas[i] == 1) {
                    System.out.println(quantidadeMoedas[i] + " moeda(s) de 1 real");
                } else {
                    System.out.println(quantidadeMoedas[i] + " moeda(s) de " + moedas[i] + " centavo(s)");
                }
            }
        }

        scanner.close();
    }
}
