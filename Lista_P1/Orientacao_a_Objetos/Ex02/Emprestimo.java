import java.util.Date;

class Emprestimo{
    private Livro livroEmprestado;
    private Pessoa pessoasEmprestadora;
    private int dataEmprestimo // usando inteiro pra facilitar as contas mas deveria ser do tipo Date
    private int dataDevolucao // usando inteiro pra facilitar as contas mas deveria ser do tipo Date

    public Emprestimo(Pessoa pessoasEmprestadora, Livro livroEmprestado, int dataEmprestimo, int dataDevolucao){
        this.livro = livroEmprestado;
        this.pessoaEmprestada = pessoaEmprestada;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // metodo pra ver se ta pendente comparando a data de devolucao com a data atual
}