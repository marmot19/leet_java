package main.cczq.zrh;
/*给定一个可包含重复数字的序列，返回所有不重复的全排列。

示例:

输入: [1,1,2]
输出:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]

*/

import java.util.*;

public class Solutions47 {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        ArrayList list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(nums[i]);
        backTrack(0, n, list);
		return res;
    }
	
	public void backTrack(int first, int n, ArrayList<Integer>nums) {
		if(first>=n) {
			res.add(new ArrayList<Integer>(nums));
		}
		for(int i=first;i<n;i++) {
			if(isReapet(nums,first,i)) continue;
			Collections.swap(nums, first, i);
			backTrack(first+1, n, nums);
			Collections.swap(nums, first, i);
		}
	}
	//如果前面的元素与当前元素相等，即nums.get(n),说明已经做过排列
	public boolean isReapet(ArrayList<Integer>nums,int first,int n) {
		for(int i=first;i<n;i++) {
			if(nums.get(i)==nums.get(n)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Solutions47 solutions47 = new Solutions47();
		int[] nums = {2,2,1,1};
		System.out.println(solutions47.permuteUnique(nums));
	}
}
