/*
Determine as raízes de uma equação de 2o grau: ax2 + bx + c = 0
(recordar que o discriminante ∆ = b^2 − 4ac, e que a raiz r = (−b √±∆)/2a).
*/
import java.util.Scanner;
import java.util.InputMismatchException;

class ex01{
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    try{
        System.out.println("Digite o valor de a: ");
        double a = teclado.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = teclado.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = teclado.nextDouble();

        double discriminante = b * b - (4*a*c);

        double raiz1 = (( -b + Math.sqrt(discriminante) )/2*a);
        double raiz2 = (( -b - Math.sqrt(discriminante) )/2*a);
        System.out.println("O valor das raizes são: "+ raiz1 + " e " + raiz2);
    } catch( InputMismatchException e){
        System.out.println("Erro: Insira um valor numérico válido.");
    } finally {
        teclado.close();
    }} 
}

/* 
CASOS DE TESTE

Entradas: a = 1, b = -3, c = 2
Saida esperada: raiz_1 = 2.0, raiz_2 = 1.0

*/