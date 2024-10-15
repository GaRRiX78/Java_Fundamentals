import java.util.*;
public class usepack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Bound"); // user input
        int l = sc.nextInt();
        System.out.println("Enter the Upper Bound"); // user input
        int h = sc.nextInt();

        boolean[] array = new boolean[h + 1]; // boolean array
        for (int i = 2; i <= h; i++) // all entries as true
        {
            array[i] = true;
        }
        for (int i = 2; i * i <= h; i++) // apply segmented seive algorithm
        {
            int sm = (l / i) * i;
            if (sm < l) {
                sm += i;
            }
            for (int j = sm; j <= h; j += i) {
                array[j] = false;
            }
        }
        for (int i = l; i <= h; i++) //print prime between lower bound to upper.
        {
            if (array[i]) {
                System.out.print(i + " ");
            }
        }
    }
}