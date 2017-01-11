import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class IntersectionTwoArrays {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 2, 1};
		int[] array2 = {2,2};
		
		IntersectionTwoArrays hp = new IntersectionTwoArrays();
		

	}
	
 public int[] intersection(int[] nums1, int[] nums2) {
	 HashSet<Integer> set = new HashSet<Integer>();
     for(int i=0;i<nums1.length;i++)
         set.add(nums1[i]); 
     List<Integer> resultList = new ArrayList<Integer>();
     for (int i=0;i<nums2.length;i++)
         if(set.contains(nums2[i])){
             resultList.add(nums2[i]);
             set.remove(nums2[i]); 
         }
     int result[] = new int[resultList.size()];
     for(int i=0;i<resultList.size();i++)
         result[i]=resultList.get(i);
     return result;

    }

}
