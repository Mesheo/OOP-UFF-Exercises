import java.util.ArrayList;
import java.util.Arrays;

public class Lista{
    public static void main(String[] args){
        ArrayList<String> frutas = new ArrayList<String>(Arrays.asList("A","b"));
        frutas.add("maca");
        frutas.add("limao");
        System.out.println("Frutas versao1: " + frutas);

        frutas.set(0, "tomate");
        System.out.println("Pegando a primeira fruta: " + frutas.get(0));
    }
}