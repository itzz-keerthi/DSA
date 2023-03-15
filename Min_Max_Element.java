/* TASK

Maximum and minimum of an array using minimum number of comparisons  

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
              
APPROACH: DIVIDE AND CONQUER ALGORITHM

TIME COMPLEXITY: O(n)  */

package Arrays;

public class MaxMinElement {
	
	static class Pair {
        int min;
        int max;
    }

    public static Pair getMaxMin(int[] arr, int low, int high) {
        Pair result = new Pair();
        Pair leftResult = new Pair();
        Pair rightResult = new Pair();
        int mid;

        // Base case: If there is only one element
        if (low == high) {
            result.max = arr[low];
            result.min = arr[low];
            return result;
        }

        // If there are two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                result.max = arr[low];
                result.min = arr[high];
            } else {
                result.max = arr[high];
                result.min = arr[low];
            }
            return result;
        }

        // If there are more than 2 elements
        mid = (low + high) / 2;
        leftResult = getMaxMin(arr, low, mid);
        rightResult = getMaxMin(arr, mid + 1, high);

        // Compare minimums of two parts
        if (leftResult.min < rightResult.min) {
            result.min = leftResult.min;
        } else {
            result.min = rightResult.min;
        }

        // Compare maximums of two parts
        if (leftResult.max > rightResult.max) {
            result.max = leftResult.max;
        } else {
            result.max = rightResult.max;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 8, 6, 2, 9 };
        Pair result = getMaxMin(arr, 0, arr.length - 1);
        System.out.println("Minimum element is " + result.min);
        System.out.println("Maximum element is " + result.max);
    }

}
