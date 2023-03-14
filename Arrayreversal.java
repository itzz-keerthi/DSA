/*TASK

Given an array (or string), the task is to reverse the array/string.
Examples : 
 

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}  */

package Arrays;

public class ArrayReversal {
	
	static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	static void display(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int arr[]= {6,2,1,4,5};
		display(arr,5);
		reverse(arr,0,4);
		System.out.println("Reversed array");
		display(arr,5);
		
	}
}
