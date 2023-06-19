import java.util.Scanner;
// import Produto;

public class ex05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String nome = teclado.nextLine();
        double valor = teclado.nextFloat();
        int qtd = teclado.nextInt();

        Produto produto01 = new Produto(nome, valor, qtd);
        System.out.println("O valor total a ser pago eh: " + produto01.calcularPrecoTotal());
    }
}


