/*
2. Faça um programa para controle de empréstimo de livros, com as classes
Emprestimo, Livro e Pessoa.
*/
import java.util.ArrayList;
import java.util.List;

class Main {
    //Total de emprestimos da biblioteca
    public int quantidadeLivrosEmprestados(List<Emprestimo> emprestimos){
        return emprestimos.size();
    }

    //Quantos livros disponiveis
    public int totalDisponiveis(List<Livro> livros,  List<Emprestimo> emprestimos){
        return livros.size() - emprestimos.size();
    }

    //Saber quantos emprestimos uma pessoa tem ativos
    public int totalEmprestadosParaPessoa(String codPessoa, List<Emprestimo> emprestimos){
        int total = 0;

        for (Emprestimo emprestimo : emprestimos){
            if (emprestimo.getCliente() == codPessoa){
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args){
        List<Pessoa> pessoas =  new ArrayList<>();
        List<Livro> livros =  new ArrayList<>();
        List<Emprestimo> emprestimos =  new ArrayList<>();

        Main main = new Main();
        Pessoa pessoa1 = new Pessoa("Joao", "12310845");
        Pessoa pessoa2 = new Pessoa("Victor", "54643167");
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        Livro livro1 = new Livro("Percy Jackson", "Rick Riordan", "72154510");
        Livro livro2 = new Livro("O nome do vento", "Patrick Rothfuss", "84881484");
        livros.add(livro1);
        livros.add(livro2);

        Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1, 0);
        emprestimos.add(emprestimo1);

        String linha = "-".repeat(50);
        
        System.out.println("Clientes:");
        for (Pessoa pessoa : pessoas){
            System.out.println(linha);
            pessoa.exibe();
            System.out.println("Total de livros em posse: " + main.totalEmprestadosParaPessoa(pessoa.getCodCliente(), emprestimos));
            System.out.println(linha);
        }

        System.out.println("Livros da biblioteca:");
        for (Livro livro : livros){
            System.out.println(linha);
            livro.exibe();
            System.out.println(linha);
        }

        System.out.println("Emprestimos da biblioteca:");
        for (Emprestimo emprestimo : emprestimos){
            System.out.println(linha);
            emprestimo.exibe();
            System.out.println(linha);
        }

        System.out.println("Total de livros que estao emprestados: " + main.quantidadeLivrosEmprestados(emprestimos));
        System.out.println("Total de livros disponiveis na biblioteca: " + main.totalDisponiveis(livros, emprestimos));

    }
}