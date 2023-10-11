class Livro{
    private String titulo;
    private String autor;
    private Boolean disponivel;
    private String codigo;

    public Livro(String titulo, String autor, String codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.codigo = codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getCod(){
        return codigo;
    }

    public Boolean isDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponibilidade){
        disponivel = disponibilidade;
    }
    
    public void exibe(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Codigo: " + codigo);
        System.out.println("Disponivel: " + disponivel);
    }
}