
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample{
    public static void main (String[] args){

        List<String> list = new ArrayList<>();
        list.add("Vaibhav");
        list.add("Shreya");
        list.add("Vivek");
        list.add("Atharv");
        System.out.println(list);

        for (String name : list) {
            System.out.println(name);
        }
    }
}