import java.util.*;

public class CollectionConversion {

    public static void main(String[] args) {

        // Criar um ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("ArrayList: " + arrayList);

        // Converter ArrayList para HashSet
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet: " + hashSet);

        // Converter HashSet para PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(hashSet);
        System.out.println("PriorityQueue: " + priorityQueue);

        // Converter PriorityQueue para ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(priorityQueue);
        System.out.println("ArrayDeque: " + arrayDeque);

        // Converter ArrayDeque para TreeSet
        TreeSet<String> treeSet = new TreeSet<>(arrayDeque);
        System.out.println("TreeSet: " + treeSet);
    }
}
