package base;

import java.util.Arrays;

public class TargetSumPairs {

    static int findPairs(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        Arrays.sort(array);
        int count = 0;
        int start = 0, end = array.length-1;

        while (start <= end) {
            if (array[start] + array[end] == target) {
                while (start+1 < end && array[start] == array[start+1]) {
                    System.out.println(array[start] + ", " + array[end]);
                    start++;
                    count++;
                }
                while (end-1 > start && array[end-1] == array[end]) {
                    System.out.println(array[start] + ", " + array[end]);
                    end--;
                    count++;
                }
                System.out.println(array[start] + ", " + array[end]);
                count++;
                start++;
                end--;
            }
            else if (array[start] + array[end] > target) {
                end--;
            }
            else {
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 7, -1, 5};
        int target = 6;

        int pairs = findPairs(array, target);
        System.out.println(pairs);
    }
}
