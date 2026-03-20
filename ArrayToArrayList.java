import java.util.*;

public class ArrayToArrayList{
        public static void main(String[] args) {
            
            String [] arr = {"Vaibhav", "Shreya", "Vivek", "Atharv"};

            List<String> list = new ArrayList<>(Arrays.asList(arr));
            System.out.println(list);


            // List<String> list = new ArrayList<>();
            // for(String name : arr){
            //     list.add(name);
            // }
            // System.out.println(list);


            // List<String> list = new ArrayList<>();
            // Collections.addAll(list, arr);
            // System.out.println(list);

            

            //FOR PRIMITIVE ARRAYS LIKE int[] or double[], YOU CANNOT CONVERT IT INTO ArrayList
            //directly using Arrays.asList(), YOU MUST USE LOOPS

            List<Integer> list1 = new ArrayList<>();
            int [] numbers = {10, 20, 30, 40};
            for(int num : numbers){
                    list1.add(num);
            }
            System.out.println(list1);
        }
}
