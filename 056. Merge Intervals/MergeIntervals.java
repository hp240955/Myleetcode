import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {

	}
	
	public class Interval {
		      int start;
		      int end;
		      Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
		 }
	
	public List<Interval> merge(List<Interval> intervals) {
        
		List<Interval> result = new ArrayList<Interval>();
		if(intervals == null || intervals.size() ==0){
			return result;
		}
		
		Collections.sort(intervals, new IntervalCom());
		
		Interval last = intervals.get(0);
		for(int i = 1; i < intervals.size(); i++){
			Interval curr = intervals.get(i);
			if(last.end<curr.start){
				result.add(last);
				last = curr;
			}
			else{
				if(last.end < curr.end)
					last.end = curr.end;
			}
		}
		
		result.add(last);
		return result;
		
		
		
    }
	
	public class IntervalCom implements Comparator<Interval>{
		 public int compare(Interval a, Interval b) {
	            return a.start - b.start;
	        }
	}

}
