import java.util.List;
import java.util.ArrayList;

/**
 * Let’s understand this problem with a real input:
 * 
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 * Here, we are asked to find the average of all subarrays of ‘5’ contiguous
 * elements in the given array. Let’s solve this:
 * 
 * For the first 5 numbers (subarray from index 0-4), the average is:
 * (1+3+2+6-1)/5 => 2.2
 * (1+3+2+6−1)/5=>2.2
 * The average of next 5 numbers (subarray from index 1-5) is: (3+2+6-1+4)/5 =>
 * 2.8
 * (3+2+6−1+4)/5=>2.8
 * For the next 5 numbers (subarray from index 2-6), the average is:
 * (2+6-1+4+1)/5 => 2.4
 * (2+6−1+4+1)/5=>2.4
 * 
 * …
 * Here is the final output containing the averages of all subarrays of size 5:
 * 
 * Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 */

public class SlidingWindowAverageProblem {

    public static List<Double> calculateSlidingAverage(int k, int array[]) {
        List<Double> slidingAverage = new ArrayList<Double>();
        int windowStart = 0;
        int windowEnd = 0;
        double sum = 0;
        double avg = 0.0D;
        while (windowEnd < array.length) {
            sum += array[windowEnd];
            windowEnd++;
            if (windowEnd - windowStart == k) {
                sum = windowStart == 0 ? sum : sum - array[windowStart - 1];
                avg = sum / k;
                slidingAverage.add(avg);
                avg = 0;
                windowStart++;
            }

        }

        return slidingAverage;
    }

    public static void main(String[] args) {
        List<Double> result = calculateSlidingAverage(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });// .forEach(System.out::println);
        System.out.println("Result is " + result);
    }
}
