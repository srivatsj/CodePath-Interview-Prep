public class Solution {
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    ArrayList<Integer> sol = new ArrayList<Integer>(a.size());
	    
	    for(int k=0; k<a.size(); k++)
	        sol.add(-1);
	    
	    if(a.size() == 0) return sol;
	    
	    Stack<Integer> st = new Stack();
	    st.push(0);
	    
	    for(int i=1; i<a.size(); i++) {
	        int val = a.get(i);
	        
	        while(!st.isEmpty() && val > a.get(st.peek())) {
	            sol.set(st.pop(), val);
	        }
	        
	        st.push(i);
	    }
	   
      return sol;
	}
}
