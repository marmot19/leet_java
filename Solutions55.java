package main.cczq.zrh;

import java.util.Arrays;

/*给定一个非负整数数组，你最初位于数组的第一个位置。

数组中的每个元素代表你在该位置可以跳跃的最大长度。

判断你是否能够到达最后一个位置。

示例 1:

输入: [2,3,1,1,4]
输出: true
解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
示例 2:

输入: [3,2,1,0,4]
输出: false
解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
。*/
public class Solutions55 {
	public boolean canJump(int[] nums) {
		int lastPos = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lastPos){
                lastPos=i;
            }
        }
        return lastPos==0;
	}
//	boolean[] isSeen;
//	public boolean canJump(int[] nums) {
//		if(nums.length<=1) return true;
//        int end = nums.length-1;
////        isSeen = new boolean[nums.length];
////        Arrays.fill(isSeen, false);
//        if(myCanJump(0, nums[0], nums)) return true;
//        return false;
//    }
//	
//	public boolean myCanJump(int start, int end, int[] nums) {
//		if(start>=nums.length-1 || start+nums[start]>=nums.length-1) return true;
//		if(nums[start]==0) return false;
//		for(int i=start+1; i<=end;i++) {
//			int value = nums[i];
//			if(myCanJump(i, i+value, nums)) {
//				return true;
//			}else {
//				nums[i]=0;
//			}
//		}
//		return false;
//	}
//	
	public static void main(String[] args) {
		int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
//		int[] nums = {3,2,1,0,4};
		Solutions55 s = new Solutions55();
		System.out.println(s.canJump(nums));
	}
}
