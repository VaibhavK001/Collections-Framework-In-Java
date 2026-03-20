import java.util.*;

public class LinkedListExample{
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Vaibhav");
        list.add("Shreya");
        list.add("Parth");
        list.add("Vivek");
        list.add("Yash");

        System.out.println(list);

        for(String name : list){
            System.out.println(name);
        }
    }
}