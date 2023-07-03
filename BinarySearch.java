package training;

public class BinarySearch {
	 int binarysearch(int n, int k) {
		 int arr[]= {1,2,3,4,5,6,7,8,9,10}; 
	        int start =0;
	        int end=n-1;
	        
	        while(start<=end){
	            int mid=(start+end)/2;
	        if (arr[mid]==k)
	            return mid;
	        if(arr[mid]<k){
	            start =mid+1;
	        }
	        else
	            end=mid-1;
	        }
	        return -1;    
	
	 }
	public static void main(String[] args) {
		BinarySearch bc= new BinarySearch();
		bc.binarysearch(10,8);

	}

}
