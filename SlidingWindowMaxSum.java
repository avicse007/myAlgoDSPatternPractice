/*

Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.

Example 1:

Input: [2, 1, 5, 1, 3, 2], k=3 
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].
*/

public class SlidingWindowMaxSum {

    public static int calculateSlidingMaxSum(int k, int array[]) {
        int maxSum = Integer.MIN_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        while (windowEnd < array.length) {
            sum += array[windowEnd];
            windowEnd++;
            if (windowEnd - windowStart == k) {
                sum = windowStart == 0 ? sum : sum - array[windowStart - 1];
                maxSum = Math.max(sum, maxSum);
                windowStart++;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int result = calculateSlidingMaxSum(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });// .forEach(System.out::println);
        System.out.println("Result is " + result);
        System.out.println("Result is " + calculateSlidingMaxSum(3, new int[] { 2, 1, 5, 1, 3, 2 }));
    }
}
