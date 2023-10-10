/*
2. Faça um programa para controle de empréstimo de livros, com as classes
Emprestimo, Livro e Pessoa.
*/
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args){
        List<Pessoa> pessoas =  new ArrayList<>();
        List<Livro> livros =  new ArrayList<>();
        List<Emprestimo> emprestimos =  new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Joao", "12310845");
        Livro livro1 = new Livro("Percy Jackson", "Rick Riordan", "12154510");
        Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1, 0);

        pessoas.add(pessoa1);
        livros.add(livro1);
        emprestimos.add(emprestimo1);


        String linha = "-".repeat(50);
        
        System.out.println("Clientes:");
        for (Pessoa pessoa : pessoas){
            System.out.println(linha);
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Codigo: " + pessoa.getCodCliente());
            System.out.println(linha);
        }

        System.out.println("Livros:");
        for (Livro livro : livros){
            System.out.println(linha);
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Codigo: " + livro.getCod());
            System.out.println("Disponivel: " + livro.isDisponivel());
            System.out.println(linha);
        }

        System.out.println("Emprestimos:");
        for (Emprestimo emprestimo : emprestimos){
            System.out.println(linha);
            System.out.println("Codigo do livro: " + emprestimo.getLivro());
            System.out.println("Codigo do cliente: " + emprestimo.getCliente());
            System.out.println("Data do emprestimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Data de devolucao: " + emprestimo.getDataDevolucao());
            System.out.println(linha);
        }

    }

    //Saber quantos emprestimos uma pessoa tem ativos
    //Total de emprestimos da biblioteca
    //Quantos livros livres
}