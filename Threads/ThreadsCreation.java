public class ThreadsCreation{
    public static void main(String[] args){
        Thread t1 = new Thread(new PrintingTask("A"));
        Thread t2 = new Thread(new PrintingTask("B"));

        t1.start();
        t2.start();
    }
}


class PrintingTask implements Runnable {
    private final String name;
    public PrintingTask(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println("Task"+name+": "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                
            }
        }
    }
}