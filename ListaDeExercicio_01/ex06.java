import java.util.Scanner;

public class ex06{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digita ai um numero inteiro bobao: ");
        int numero = teclado.nextInt();

        int numeroDeDigitos = Integer.toString(Math.abs(numero)).length();
        System.out.println("O número de dígitos é: " + numeroDeDigitos);
    }
}