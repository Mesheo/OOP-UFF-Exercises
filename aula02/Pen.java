package aula02;

public class Pen {
    public String marca;
    private boolean tampada;

    public void tampar(){
        tampada = true;
    }

    public boolean isTampada(){
        return tampada;
    }
}
