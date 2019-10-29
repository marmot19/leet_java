package main.cczq.zrh;
import java.util.*;

public class Solutions39 {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	private int[] candidates;
	private int len;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	this.len = candidates.length;
    	if(len==0) return result;
//    	先排序，才能避免出现重复同样结果集的情况，在例子中是[2,2,3]的情况
    	Arrays.sort(candidates);
        this.candidates = candidates;
        findCombinationSum(target, 0, new Stack<>());
        return result;
    }
    
    private void findCombinationSum(int residue,  int start, Stack pre) {
    	if(residue==0) {
    		result.add(new ArrayList(pre));
//    		跳出递归，才能走到下面的回溯，即pre.pop
    		return;
    	}
    	for(int i=start;i<len&&residue-candidates[i]>=0;i++) {
    		pre.add(candidates[i]);
//    		因为允许取重复元素，所以传入的起始位置是i，而不是i+1
    		findCombinationSum(residue-candidates[i], i, pre);
//    		stack.pop 弹出栈顶的元素，这是回溯的核心步骤
    		pre.pop();
    	}
    }
}
