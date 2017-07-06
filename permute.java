public class Solution {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    
	    Map<Integer, Integer> map = new HashMap();
	    
	    for(Integer i : a) {
	        
	        if(!map.containsKey(i))
	            map.put(i, 0);
	            
	        map.put(i, map.get(i) + 1);
	    }
	    
	    ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();
	    
	    perm(map, sol, new ArrayList<Integer>(), a.size());
	    
	    return sol;
	}
	
	public void perm(Map<Integer, Integer> map, ArrayList<ArrayList<Integer>> sol, ArrayList<Integer> part, int size) {
	    
	    if(part.size() == size)
	    {
	        sol.add(new ArrayList(part));
	        return;
	    }
	    
	    for(Integer key : map.keySet()) {
	        
	        int count = map.get(key);
            if(count == 0) continue;
	        
	        part.add(key);
	        map.put(key, map.get(key) -1);
	        perm(map, sol, part, size);
	        part.remove(part.size() -1);
	        map.put(key, map.get(key) +1);
	    }
	    
	}
}
