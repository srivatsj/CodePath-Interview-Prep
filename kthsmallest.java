public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int kthsmallest(final List<Integer> a, int k) {
	    
	    Collections.sort(a);
	    return a.get(k -1);
	}
}
