import java.util.Map;


public class CopyListwithRandomPointer {

	public static void main(String[] args) {
		

	}
	
	public RandomListNode copyRandomList(RandomListNode head) {  
	    Map<RandomListNode, RandomListNode> map = new HashMap<>();  
	    RandomListNode dummy = new RandomListNode(0);  
	    RandomListNode node = dummy, h = head;  
	    while(head != null) {  
	        RandomListNode copy = new RandomListNode(head.label);  
	        map.put(head, copy);  
	        node.next = copy;  
	        node = node.next;  
	        head = head.next;  
	    }  
	    node = dummy.next;  
	    while(node != null) {  
	        if(h.random != null) {  
	            node.random = map.get(h.random);      
	        }  
	        h = h.next;  
	        node = node.next;  
	    }  
	      
	    return dummy.next;  
	}  

}
