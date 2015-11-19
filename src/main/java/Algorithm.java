import java.util.*;

/**
 * Created by kishaku on 19/11/2015.
 */
public class Algorithm {

    public static void main(String[] args) {

        int[] inputNumbers1 = {1, 2, 5, 10, 20, 1};
        int[] inputNumbers2 = {1, 2, 5, 10, 20, 1,10,10};
        int[] inputNumbers3 = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(solution(inputNumbers1));
        System.out.println(solution2(inputNumbers2));
        System.out.println(solution3(inputNumbers3));
    }

   /** median of an array

   * X[N/2] if N is an even number
    *  X[(N-1)/2] if N is an even number
    */
    private static int solution(int[] A) {
        int[] inputNumbers = A;
        int median;
        Arrays.sort(inputNumbers);
        if (inputNumbers.length % 2 == 0) {
            median = inputNumbers[inputNumbers.length / 2];
        } else {
            median = inputNumbers[(inputNumbers.length) - 1 / 2];
        }
        return median;

    }

    /**
     *return the number that occurs most in array
     */
    private static Integer solution2(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i : A) {
            Integer count = map.get(i);
            map.put(i, count != null ? count + 1 : 0);
        }

        Integer mostOccurredNumber = Collections.max(map.entrySet(), new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }).getKey();
        return mostOccurredNumber;
    }

    /**
     *Given an array consisting of n integers return the size of the largest set s[k] for this array
     */
    private static int solution3(int[] A) {

        int[] inputNumbers = A;
        int i;
        int count = 0;
        for (int k = 0; k < A.length; k++) {
            i = k;
            while (A[i] > 0) {

                i = A[i];
                A[i] = A[i] * -1;
                count++;
            }
        }
        return count;

    }

}
