package main.cczq.zrh;
/*����һ���ɰ����ظ����ֵ����У��������в��ظ���ȫ���С�

ʾ��:

����: [1,1,2]
���:
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
	//���ǰ���Ԫ���뵱ǰԪ����ȣ���nums.get(n),˵���Ѿ���������
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
