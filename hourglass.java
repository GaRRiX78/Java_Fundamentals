
import java.util.*;
public class hourglass {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter rows and columns");

        int r = sw.nextInt();
        int c = sw.nextInt();

        int sum = 0;
        int max = 0;
        System.out.println("Enter elements for matrix");
        if (r > 2 && c > 2) {
            int[][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sw.nextInt();
                }
            }
            for (int i = 0; i < r - 2; i++) {
                for (int j = 0; j < c - 2; j++) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
                            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    max = Math.max(max, sum);
                }
            }
            System.out.println("MAX SUM of MATRIX IN HOURGLASS");
            System.out.println(max);
        } else {
            System.out.println("Atleast 3 Row or 3 Column Needed");
        }
    }
}
