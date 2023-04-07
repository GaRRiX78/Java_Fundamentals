import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class list {
    public static void main(String[] args) {
        // Create an ArrayList with numbers
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Insert new elements into specified locations in the ArrayList
        arrayList.add(1, 15);
        arrayList.add(3, 25);
        System.out.println("ArrayList with new elements: " + arrayList);

        // Create a LinkedList from the ArrayList
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        // Insert and remove elements from the LinkedList
        linkedList.addFirst(5);
        linkedList.addLast(55);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after adding and removing elements: " + linkedList);

        // Traverse the LinkedList in forward direction
        System.out.println("Traversal of LinkedList in forward direction:");
        ListIterator<Integer> iteratorForward = linkedList.listIterator();
        while (iteratorForward.hasNext()) {
            System.out.print(iteratorForward.next() + " ");
        }
        System.out.println();

        // Traverse the LinkedList in backward direction
        System.out.println("Traversal of LinkedList in backward direction:");
        ListIterator<Integer> iteratorBackward = linkedList.listIterator(linkedList.size());
        while (iteratorBackward.hasPrevious()) {
            System.out.print(iteratorBackward.previous() + " ");
        }
        System.out.println();
    }
}
