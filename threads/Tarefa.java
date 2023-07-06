public class Tarefa implements Runnable {
    private String texto;
    public Tarefa(String texto){
        this.texto = texto;
    }

    private void printar(String s) {    
        System.out.println(s);
    }

    @Override
    public void run(){
        this.printar("hardCOded");
    }
}