
public class mergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = new int[10];
		nums1[0] = 1; nums1[1] = 2;nums1[2] = 3; nums1[3] = 4;
		int[] nums2 = {5,6,7,8};
		int m = 4;
		int n = nums2.length;
		
		mergeSortedArray hp = new mergeSortedArray();
		hp.merge(nums1, m, nums2, n);
		
		for(int i: nums1){
			System.out.print(i + " ");
		}
		
	}
	
	 public void merge(int[] A, int m, int[] B, int n) {
		 while(m > 0 && n > 0){
	            if(A[m-1] > B[n-1]){
	                A[m+n-1] = A[m-1];
	                m--;
	            }else{
	                A[m+n-1] = B[n-1];
	                n--;
	            }
	        }
	 
	        while(n > 0){
	            A[m+n-1] = B[n-1];
	            n--;
	        }
	       
	    }

}
