import java.util.*;
 public class ListIteratorExample{
    public static void main(String[] args) {
        
        List<String> names = new LinkedList<>();
        names.add("Vaibhav Korake");
        names.add("Yash Pangavane");
        names.add("Prasad Chothve");
        names.add("Parth Dabhade");
        names.add("Vivek Korake");
        names.add("Prajwal Mavkar");

        ListIterator litr = names.listIterator();
        System.out.println("Forward Retrieve : ");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println();
        System.out.println("Backward Retrieve : ");
        while (litr.hasPrevious()) { 
            System.out.println(litr.previous());
        }
    }
 }