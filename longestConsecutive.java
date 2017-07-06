public class Solution {
	public int longestConsecutive(final List<Integer> a) {
	    
	    Set<Integer> set = new HashSet();
	    
	    for(Integer i : a) {
	        set.add(i);
	    }
	    
	    int max = 0;
	    
	    for(Integer i : a) {
	       
	       int val = i;

	       if(set.contains(val)) 
	       {
	           int up = val + 1;
	           int count = 1;
	           
	           while(set.contains(up))
	           {
	               count++;
	               set.remove(up);
	               up++;
	           }
	           
	           int down = val - 1;
	           
	           while(set.contains(down))
	           {
	               count++;
	               set.remove(down);
	               down--;
	           }
	           
	           max = Math.max(max, count);
	           set.remove(val);
	       }
	    }
	    
	    return max;
	}
}
