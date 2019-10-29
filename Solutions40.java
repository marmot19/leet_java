package main.cczq.zrh;

import java.util.*;

public class Solutions40 {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	int len;
	int[] candidates;
//	Set nums ;
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.len = candidates.length;
        if(len==0) return res;
        Arrays.sort(candidates);
        this.candidates = candidates;
//        this.nums = new HashSet<>(Arrays.asList(candidates));
        findCombinationSum(target, 0, new Stack<>());
        return res;
    }
	
	private void findCombinationSum(int residue, int start, Stack<Integer> pre) {
		if(residue == 0) {
			res.add(new ArrayList(pre));
			return;
		}
		for(int i=start;i<len&&residue-candidates[i]>=0; i++) {
			pre.add(candidates[i]);
			findCombinationSum(residue-candidates[i], i+1, pre);
			while(candidates[i+1]==candidates[i]) i++;
			pre.pop();
		}
	}
	
}
