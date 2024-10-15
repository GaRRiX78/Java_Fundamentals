import java.util.ArrayList;
import java.util.List;

public class SubarraySumEqualToS{
    public static ArrayList<Integer> findSubarray(int[] A, int N, int S) {
        int left = 0;
        int right = 0;
        int currentSum = 0;

        while (right < N) {
            currentSum += A[right];
            while (currentSum > S) {
                currentSum -= A[left];
                left++;
            }

            if (currentSum == S) {
                // Found a subarray with the sum equal to

                return new ArrayList<>(List.of(left + 1, right + 1)); // Adjust for 1-based indexing
            }

            right++;
        }

        // No subarray found
        return new ArrayList<>(List.of(-1));
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 7, 5};
        int N = A.length;
        int S = 12;

        ArrayList<Integer> result = findSubarray(A, N, S);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
