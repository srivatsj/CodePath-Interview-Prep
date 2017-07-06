public class Solution {
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	   
	   int size = a + (a -1);
       ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>(size);

        for (int r = 0; r < size; r++) {
            ArrayList<Integer> ls = new ArrayList<Integer>(size);
            
            for (int c = 0; c < size; c++) {
              ls.add(0);
            }
            
            sol.add(ls);
        }

       int left = 0;
       int right = size -1;
       int top = 0;
       int bottom = size -1;
        
        while(left <= right && top <= bottom) {
            
            for(int i=left; i<= right; i++) {
              sol.get(top).set(i, a);
            }
            
            top++;
            
            for(int i=top; i<= bottom; i++) {
                sol.get(i).set(right, a);
            }
            
            right--;
            
            for(int i=right; i>= left; i--) {
                sol.get(bottom).set(i, a);
            }
            
            bottom--;
            
            for(int i=bottom; i>= top; i--) {
                sol.get(i).set(left, a);
            }
            
            left++;
            a--;
        }
	    
	   return sol;
	}
	
}
