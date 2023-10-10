import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

class Emprestimo{
    private Livro livro;
    private Pessoa pessoa;
    private Date dataEmprestimo; // usando inteiro pra facilitar as contas mas deveria ser do tipo Date
    private Date dataDevolucao; // usando inteiro pra facilitar as contas mas deveria ser do tipo Date

    public Emprestimo(Pessoa cliente, Livro livroEmprestado, int dataDevolucao){
        this.livro = livroEmprestado;
        this.pessoa = cliente;

        emprestar();
    }

    public String getLivro(){
        return livro.getCod();
    }

    public String getCliente(){
        return pessoa.getCodCliente();
    }

    public Date getDataEmprestimo(){
        return dataEmprestimo;
    }

    public Date getDataDevolucao(){
        return dataDevolucao;
    }

    public void setDataDevolucao(int totalDias){
        Date today = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(today);
        calendario.add(Calendar.DAY_OF_MONTH, totalDias);
        dataDevolucao = calendario.getTime();
    }

    public void emprestar(){
        if (livro.isDisponivel()){
            livro.setDisponivel(false);

            dataEmprestimo = new Date();

            setDataDevolucao(15);
        }
    }

    public void devolver(){
        livro.setDisponivel(true);
    }

    // metodo pra ver se ta pendente comparando a data de devolucao com a data atual
}