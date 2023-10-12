/*
Escreva um programa para listar todos os divisores de um número e dizer se
o número é primo ou não
○ Ao final, verifique se o usuário deseja analisar outro número
*/
import java.util.Scanner;

public class divisores{
    private static boolean ehPrimo(int numero){
        int divisores=1;
        for(int i=2; i <=numero; i++){
            if (numero % i == 0) {
                divisores += 1;
            }
        }
        if (divisores == 2){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int entrada =  0;
        while (entrada != 1){
            int numero = teclado.nextInt();
            System.out.println("Esse numero e primo: " + ehPrimo(numero));  

            System.out.println("Deseja continuar? 0-sim 1-não");
            entrada = teclado.nextInt();   
        }  
    }
}