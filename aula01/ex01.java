/*
Escreva um programa que, com base em uma temperatura em graus celsius
lida do teclado, a converta e a exiba em Fahrenheit (F), seguindo a fórmula:

F = C * 1.8 + 32
*/
import java.util.Scanner;

class ex01{
    private static float converter(float celsius_number){
        return (float) (celsius_number*1.8) + 32;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius");
        float temperatura_celsius = teclado.nextFloat();
        float temperatura_f = converter(temperatura_celsius);
        System.out.println(temperatura_celsius +" celsius em fahrenheit é igual a: "+temperatura_f);
    }
}