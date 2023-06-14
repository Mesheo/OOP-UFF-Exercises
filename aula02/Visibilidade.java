package aula02;

public class Visibilidade {
    public static void main(String[] args){
        System.out.println("Hello world");
        Pen caneta = new Pen();
        System.out.println("A caneta esta tampada?" + caneta.isTampada());
        caneta.tampar();
        System.out.println("E agora? A caneta esta tampada?" + caneta.isTampada());
    }
}
