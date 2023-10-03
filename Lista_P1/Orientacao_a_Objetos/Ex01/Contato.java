public class Contato implements Comparable<Contato>{

    private String nome;
    private String numero;


    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Contato contato) {
        return this.getNome().compareTo(contato.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " || Telefone: " + this.getNumero();
    }
}
