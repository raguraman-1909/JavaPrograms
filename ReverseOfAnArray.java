package training;

import java.util.Arrays;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int len = arr.length;
		int arrb[]= new int[len];
		int j=len;
		for(int i=0; i<len; i++) {
			arrb[j -1]=arr[i];
			j--;
		}
System.out.println(Arrays.toString(arrb));
	}

}
