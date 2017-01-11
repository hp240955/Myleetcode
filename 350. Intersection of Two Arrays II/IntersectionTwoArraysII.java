import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class IntersectionTwoArraysII {

	public static void main(String[] args) {
	
		int[] array1 = {1, 2, 2, 1,4,3,2,1,3,2,3,2,3};
		int[] array2 = {2,2,3,2,1,2,4,3,2,3,6,5,8};
		
		IntersectionTwoArraysII hp = new IntersectionTwoArraysII();
		
		for(int i: hp.intersect(array1, array2)){
			System.out.println(i);
		}

	}
	
	 public int[] intersect(int[] nums1, int[] nums2) {
	        
		 HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		 HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		 
		 Arrays.sort(nums1); Arrays.sort(nums2);
		 int freq = 0;
		 
		 for(int i = 0; i < nums1.length; i++){
			 if(map1.containsKey(nums1[i])){
				 freq = freq +1;
				 map1.put(nums1[i], freq);
			 }
			 else{
				 freq = 1;
				 map1.put(nums1[i], freq);
			 }
		 }
		 
		 for(int i = 0; i < nums2.length; i++){
			 if(map2.containsKey(nums2[i])){
				 freq = freq +1;
				 map2.put(nums2[i], freq);
			 }
			 else{
				 freq = 1;
				 map2.put(nums2[i], freq);
			 }
		 }
		 
		 Object[] key = map1.keySet().toArray();
		 HashMap<Integer, Integer> commonMap = new HashMap<Integer, Integer>();
		 int temp = 0;
		 for(int i = 0; i < key.length; i++){
			 temp = (Integer)key[i];
			 if(map2.containsKey(temp)){
				 commonMap.put(temp, Math.min(map1.get(temp), map2.get(temp)));
			 }		 
		 }
		 
		 Object[] key2 = commonMap.keySet().toArray();
		 List<Integer> resultList = new ArrayList<Integer>();
		 
		 for(int i = 0; i < key2.length; i++){
			 temp = (Integer)key2[i];
			 for(int j = 0; j<commonMap.get(temp); j++){
				 resultList.add(temp);
			 }
		 }
		 
		 int result[] = new int[resultList.size()];
		 for(int i=0;i<resultList.size();i++)
	         result[i]=resultList.get(i);
	     return result;	 
		 
	    }

}
