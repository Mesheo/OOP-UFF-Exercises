// Determine as raízes de uma equação de 2º grau: ax2 + bx + c = 0 (recordar que o
// discriminante Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).
package ListaDeExercicio_01;
import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        // coletando os     coeficientes
        System.out.println("Digite o coeficiente a: ");
        double a = teclado.nextDouble();

        System.out.println("Digite o coeficiente b: ");
        double b = teclado.nextDouble();

        System.out.println("Digite o coeficiente c: ");
        double c = teclado.nextDouble();
        teclado.close();
 
        // calculando o discriminante
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // descobrindo as raizes
        if(discriminante > 0){
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Aqui estão as raizes da equação: " + raiz1 + "," + raiz2);
        }

        else if(discriminante == 0){
            double raiz = -b / (2 * a);
            System.out.println("Aqui está a raiz da equação: " + raiz);
        }
        else if (discriminante < 0) {
            System.out.println("Não existe raíz para a equação dada!");
        }
    }
}
