/* TASK

Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.

This problem is also the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra. The problem is as follows:

Given N balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls). 

Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

*/

/*
 Here's how we can implement the Dutch National Flag Algorithm in Java to sort an array consisting of only 0, 1, and 2 with minimum time and space complexity:
 The sortArray method takes in an array arr and sorts it using the Dutch National Flag Algorithm. It initializes three pointers: low points to the first element in the array, mid points to the second element in the array, and high points to the last element in the array.

The algorithm uses the mid pointer to traverse the array from left to right. If the current element is 0, it swaps it with the element pointed to by the low pointer, increments both low and mid, and continues. If the current element is 1, it simply increments mid and continues. If the current element is 2, it swaps it with the element pointed to by the high pointer, decrements high, and continues.

After the algorithm finishes, the array will be sorted in non-decreasing order of 0, 1, and 2.

The time complexity of this algorithm is O(n), where n is the size of the array, and the space complexity is O(1), since we are only using a few pointers to keep track of indices in the array. */
package Arrays;

public class SortArrayof012 {
	public static int[] sortArray(int[] arr) {
	    int low = 0;
	    int mid = 0;
	    int high = arr.length - 1;
	    while (mid <= high) {
	        if (arr[mid] == 0) {
	            int temp = arr[low];
	            arr[low] = arr[mid];
	            arr[mid] = temp;
	            low++;
	            mid++;
	        } else if (arr[mid] == 1) {
	            mid++;
	        } else {
	            int temp = arr[high];
	            arr[high] = arr[mid];
	            arr[mid] = temp;
	            high--;
	        }
	    }
	   return arr;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,0,2,0,1};
		int[] result= sortArray(arr);
		for(int i=0;i<result.length;i++) {
		System.out.print(result[i]+" ");
		}
	}
}
