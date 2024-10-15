public class SubarrayPrinter {
    public static void printSubarrays(int[] nums) {
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printSubarrays(nums);
    }
}
