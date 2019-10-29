package main.cczq.zrh;
import java.util.*;

public class Solutions39 {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	private int[] candidates;
	private int len;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	this.len = candidates.length;
    	if(len==0) return result;
//    	�����򣬲��ܱ�������ظ�ͬ������������������������[2,2,3]�����
    	Arrays.sort(candidates);
        this.candidates = candidates;
        findCombinationSum(target, 0, new Stack<>());
        return result;
    }
    
    private void findCombinationSum(int residue,  int start, Stack pre) {
    	if(residue==0) {
    		result.add(new ArrayList(pre));
//    		�����ݹ飬�����ߵ�����Ļ��ݣ���pre.pop
    		return;
    	}
    	for(int i=start;i<len&&residue-candidates[i]>=0;i++) {
    		pre.add(candidates[i]);
//    		��Ϊ����ȡ�ظ�Ԫ�أ����Դ������ʼλ����i��������i+1
    		findCombinationSum(residue-candidates[i], i, pre);
//    		stack.pop ����ջ����Ԫ�أ����ǻ��ݵĺ��Ĳ���
    		pre.pop();
    	}
    }
}
