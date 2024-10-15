import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeDoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static boolean isPalindrome(LinkedList<Node> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left).data != list.get(right).data) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        LinkedList<Node> doublyLinkedList = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int data = scanner.nextInt();
            Node node = new Node(data);
            doublyLinkedList.addLast(node);
        }

        scanner.close();

        if (isPalindrome(doublyLinkedList)) {
            System.out.println("Yes, it's a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
    }
}
