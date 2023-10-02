/*
Para cada produto informado (nome, preço e quantidade), escreva o
nome do produto comprado e o valor total a ser pago considerando que
são oferecidos descontos pelo número de unidades compradas, segundo
a tabela abaixo:
    a. Até 10 unidades: valor total
    b. de 11 a 20 unidades: 10% de desconto
    c. de 21 a 50 unidades: 20% de desconto
    d. acima de 50 unidades: 25% de desconto
*/

import java.util.Scanner;

class Produto{
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, Float preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public float calcularValorTotal(){
        float valorTotal = preco * quantidade;

        if (this.quantidade <= 10) {
            valorTotal = valorTotal;
        } else if (this.quantidade <= 20) {
            valorTotal = valorTotal*0.9f;
        } else if (this.quantidade <= 50) {
            valorTotal = valorTotal*0.8f;
        } else if (this.quantidade > 50) {
            valorTotal = valorTotal*0.75f;
        }
        
        return valorTotal;
    }
}


public class ex04{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome_produto = teclado.nextLine();

        System.out.println("Digite o preco do produto: ");
        Float preco_produto = teclado.nextFloat();

        System.out.println("Digite a quantidade comprada do produto:  ");
        int quantidade_produto = teclado.nextInt();

        Produto produto = new Produto(nome_produto, preco_produto, quantidade_produto);
        
        System.out.println("O valor a se pelo " + produto.nome + " é: " + produto.calcularValorTotal());
    }
}