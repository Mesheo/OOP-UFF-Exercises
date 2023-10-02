/*
1. Considere os programas a seguir, que leem um código repetidamente e
imprimem o código lido até que o código lido seja igual a -1. O código
-1 não deve ser impresso.
a. Qual das duas soluções é a correta?
b. Como a solução incorreta poderia ser corrigida?
*/

// Programa A
import java.util.Scanner;
public class Codigo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        System.out.println("Informe o codigo: ");
        codigo = teclado.nextInt();
        while (codigo != -1) {
            System.out.println("Codigo: " + codigo);
            System.out.println("Informe o codigo: ");
            codigo = teclado.nextInt();
        }
    }
}


// Programa B
import java.util.Scanner;
public class Codigo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        do {
            System.out.print("Informe o codigo: ");
            codigo = teclado.nextInt();
            System.out.println("Codigo: " + codigo);
        } while (codigo != -1);
    }
}

/* 
RESPOSTAS
a) O programa A está correto pois não imprime o -1 quando após ele ser digitado

b) Alterando a estrutura de repeticao do-while para um while comum. Como está escrito o DO 
executa um bloco de código (nesse caso a impressão do que foi escrito) antes de verificar a condição
de permanência no loop (código != -1)
*/