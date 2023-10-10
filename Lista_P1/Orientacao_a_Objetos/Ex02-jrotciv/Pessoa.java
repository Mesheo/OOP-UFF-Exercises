import java.util.ArrayList;
import java.util.List;

class Pessoa{
    private String nome;
    private String codCliente;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Pessoa(String nome, String codCliente){
        this.nome = nome;
        this.codCliente = codCliente;
    }

    public String getNome(){
        return nome;
    }

    public String getCodCliente(){
        return codCliente;
    }

    public void addEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public void removeEmprestimo(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
    }


    // metodos nao sei ainda. Pegar ou devolver livros?
}