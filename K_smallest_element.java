/* PROBLEM

Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
Output: 10    */

/*To find the Kth smallest element in the given array with minimum time and space complexity, we can use the QuickSelect algorithm. QuickSelect is a variation of the QuickSort algorithm, where instead of sorting the entire array, we only sort a part of the array that contains the Kth smallest element.

Here's how we can implement QuickSelect in Java:

The quickSelect method takes in an array arr and an integer k, and returns the Kth smallest element in the array. It first initializes the left and right pointers to the start and end of the array, respectively. It then repeatedly partitions the array around a pivot element until the pivot element is the Kth smallest element.

The partition method is used to partition the array around the pivot element. It selects the rightmost element as the pivot, and iterates through the array from left to right. If an element is smaller than the pivot, it swaps it with the element at the current position of the left pointer and increments the left pointer. Finally, it swaps the pivot element with the element at the position of the left pointer.

The time complexity of QuickSelect is O(n), where n is the size of the array, and the space complexity is O(1).*/


package Arrays;
public class KthElement {
	public static int quickSelect(int[] arr, int k) {
	    int left = 0;
	    int right = arr.length - 1;

	    while (true) {
	        int pivotIndex = partition(arr, left, right);
	        if (pivotIndex == k - 1) {
	            return arr[pivotIndex];
	        } else if (pivotIndex > k - 1) {
	            right = pivotIndex - 1;
	        } else {
	            left = pivotIndex + 1;
	        }
	    }
	}

	private static int partition(int[] arr, int left, int right) {
	    int pivot = arr[right];
	    int i = left;

	    for (int j = left; j < right; j++) {
	        if (arr[j] < pivot) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	        }
	    }

	    int temp = arr[i];
	    arr[i] = arr[right];
	    arr[right] = temp;

	    return i;
	}
	public static void main(String[] args) {
		int arr[]= {2,6,8,1,4,0};
		int k=3;
		int result= quickSelect(arr,k);
		System.out.println(result);
	}
}
