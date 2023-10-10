class Pessoa{
    private String nome;
    private String codCliente;
    // private int totalLivros = 0;

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

    // public boolean verificarTotalLivros(){
    //     if (totalLivros == 3){
    //         return false;
    //     }

    //     totalLivros++;

    //     return true;
    // }

    public void exibe(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codCliente);
    }
}