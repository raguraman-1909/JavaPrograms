package training;

import java.util.Scanner;

public class BinarySearchWithInput {
	public void binarysearch(int n, int k) {
		Scanner b sc = new Scanner(System.in);
	System.out.println("Enter the row for an array");
		n = sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements");
	for(int i=0; i<n; i++)
		arr[i]= sc.nextInt();
		
	System.out.println("Enter the value you have to find");
		k = sc.nextInt();
		// code here
        int start =0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
        if (arr[mid]==k) {
           System.out.println(mid+" is the index");
           break;
        }
        else if(arr[mid]<k)
            start =mid+1;  
        else if(arr[mid]>k)
            end=mid-1;
        else 
        	System.out.println("Number not found");
        }
    }
public static void main (String []args){
	// For two dimensional array
//	Scanner sc = new Scanner(System.in);
//int a,b,i,j;

//	System.out.println("Enter the row for an array");
//		a = sc.nextInt();

//	System.out.println("Enter the row for an array");
//	 	b = sc.nextInt();	
//int arr[][]= new int[a][b];	
//	System.out.println("Enter the elements of the array");
//	
//	for(i=0; i<a; i++)
//	for(j=0; j<b; j++) {
//	
//		arr[i][j]= sc.nextInt();
//	}
	 	
//	for(int ar[]  : arr) {
//		for(int num : ar) {
//			System.out.println(num);
//		}

	BinarySearchWithInput bs=new BinarySearchWithInput();
	bs.binarysearch(0, 0);
}
		
}

