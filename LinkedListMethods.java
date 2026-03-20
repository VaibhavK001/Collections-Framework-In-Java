import java.util.*;

public class LinkedListMethods{
    public static void main(String[] args) {
        
        List<String> list = new LinkedList<>();
        
        list.add("Vaibhav");
        list.add("Atharv");
        list.addFirst("Shreya");
        list.addLast("Prasad");

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.contains("Vaibhav"));
        System.out.println(list.indexOf("Prasad"));
        System.out.println(list.lastIndexOf("Shreya"));

        list.remove("Vaibhav");
        list.removeFirst();
        list.removeLast();

        System.out.println(list.size());
        list.clear();
        System.out.println(list);

    }     
}