package training;

import java.util.Arrays;

public class ReverseOfAnSubArrray {
public void subArray(int k) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int len=arr.length;
	int arrb[]= new int[len];
	int j=len;
	//subArray
	for(int i=0; i<len; i+=k) {
		int start=i;
		int end=Math.min(i+k-1, len-1);
		while(start<=end) {
			int temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
System.out.println("--------");
System.out.println(Arrays.toString(arr));
}
	public static void main(String[] args) {
		ReverseOfAnSubArrray rs= new ReverseOfAnSubArrray();
		rs.subArray(3);
	}

}