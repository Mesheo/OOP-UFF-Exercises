
public class ThreadOlaMundo{
    public static void main(String[] args){
        Thread t1 = new Thread(new Tarefa("Ola mundo"));
        t1.start();
    }
}