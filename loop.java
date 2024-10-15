
import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class loop {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(2, 18);
        arrayList.add(4, 7);
        System.out.println("The elements in the arraylist are :");
        System.out.println(arrayList);
        LinkedList<Integer> L1 = new LinkedList<>(arrayList);
        L1.add(2, 3);
        L1.add(5, 34);

        System.out.println("Elements in linkedlist are :");
        System.out.println(L1);
        ListIterator<Integer> listIterator = L1.listIterator();
        while (listIterator.hasNext()) ;
        {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        System.out.println("Display the linked list backward:");
        listIterator = L1.listIterator(L1.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");

        }
    }//
}