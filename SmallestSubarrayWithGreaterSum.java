/**
 * Given an array of positive numbers and a positive number ‘S,’ find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to
 * ‘S’. Return 0 if no such subarray exists.
 * 
 * Example 1:
 * 
 * Input: [2, 1, 5, 2, 3, 2], S=7
 * Output: 2
 * Explanation: The smallest subarray with a sum greater than or equal to ‘7’ is
 * [5, 2].
 * 
 * Example 2:
 * 
 * Input: [2, 1, 5, 2, 8], S=7
 * Output: 1
 * Explanation: The smallest subarray with a sum greater than or equal to ‘7’ is
 * [8].
 * 
 * Example 3:
 * 
 * Input: [3, 4, 1, 1, 6], S=8
 * Output: 3
 * Explanation: Smallest subarrays with a sum greater than or equal to ‘8’ are
 * [3, 4, 1] or [1, 1, 6].
 * 
 * 
 */

public class SmallestSubarrayWithGreaterSum {

    public static int calculateMaxSum(int k, int array[]) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        while (windowEnd < array.length && windowStart < array.length) {
            sum += array[windowEnd];
            while (sum >= k) {
                int currLength = windowEnd - windowStart + 1;
                minLength = Math.min(minLength, currLength);
                sum = sum - array[windowStart];
                windowStart++;
            }
            windowEnd++;
        }
        return minLength;
    }

    public static void main(String[] args) {
        System.out.println(
                "The smallest sub array with the max is "
                        + calculateMaxSum(7, new int[] { 2, 1, 5, 2, 3, 2 }));

        System.out.println(
                "The smallest sub array with the max is "
                        + calculateMaxSum(7, new int[] { 2, 1, 5, 2, 8 }));

        System.out.println(
                "The smallest sub array with the max is "
                        + calculateMaxSum(8, new int[] { 3, 4, 1, 1, 6 }));

        // System.out.println(
        // "The smallest sub array with the max is "
        // + calculateMaxSum(8, new int[] {3, 4, 1, 1, 6 }));

    }

}
