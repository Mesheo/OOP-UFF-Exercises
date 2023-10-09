class Livro{
    private String titulo;
    private String autor;
    private Pessoa pessoaComOLivro;
    private Boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void exibe(){
        System.out.println(titulo + " - " + autor + " - ");
    }
}