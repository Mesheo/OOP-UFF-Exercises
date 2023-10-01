/*
O programa a seguir estranhamente sempre escreve “A distancia e: 1.0”.
Identifique onde está o defeito.
*/
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        System.out.println("Entre com as coordenadas x e y dos
        pontos nesta ordem: ");

        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();

        distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1/2);
        System.out.println("A distancia e: " + distancia);
    }
}

/*
O calculo da distancia entre os 2 pontos é 
"A raiz quadrada da soma da distancia_X e distancia_Y elevadas ao quadradao respectivamente"

O programa tenta usar potenciacao a 1/2 para representar a raiz quadrada entretanto 
no java quando fazemos uma divisao entre inteiros pegamos apenas a parte inteira.
1/2 = 0.5 logo para nosso programa estamos sempre elevando o resultao a O, e todo numéro elevado
a 0 resulta em 1.

O correto seria usar 0.5 para indicar meio nesse caso, ou a função Math.sqrt() desde o inicio.
*/