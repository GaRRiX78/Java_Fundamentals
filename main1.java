import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class main1 {
    public static void main(String[] args) {

       List <String> ArrayList = new ArrayList<>();
       ArrayList.add("Rahul");
       ArrayList.add("Kumar");
       ArrayList.add("Rupesh");
       ArrayList.add(0,"Ram");
       ArrayList.add(1,"Kalpesh");
        System.out.println("The names in the arraylist are:");
        System.out.println(ArrayList);
        LinkedList <Object>linkedList= new LinkedList<>(ArrayList);
        linkedList.add(2,"blue");
        linkedList.removeLast();
        linkedList.addFirst("Green");


    }

}