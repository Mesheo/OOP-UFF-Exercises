import java.util.InputMismatchException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0, distancia = 0;

        try {
            System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem: ");
            x1 = teclado.nextDouble();
            y1 = teclado.nextDouble();
            x2 = teclado.nextDouble();
            y2 = teclado.nextDouble();

            distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 1 / 2);
            System.out.println("A distancia e: " + distancia);
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Certifique-se de inserir números válidos.");
            e.printStackTrace();
        } finally {
            teclado.close();
        }
    }
}
