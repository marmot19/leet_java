package main.cczq.zrh;

import java.util.Arrays;

public class Solutions16 {
    public int threeSumClosest(int[] nums, int target) {
    	int result = 0;
    	int gap = Integer.MAX_VALUE;
    	int[] arr = new int[3];
        if(nums.length<3) return result;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++) {
        	int left = i+1;
        	int right = nums.length-1;
        	
        	while(left<right) {
        		int minus = nums[i]+nums[left]+nums[right]-target;
        		int temp = Math.abs(minus);
        		if(temp<gap) {
        			arr[0]=nums[i];
        			arr[1]=nums[left];
        			arr[2]=nums[right];
        			gap=temp;
        			result=nums[i]+nums[left]+nums[right];
//        			while(left<right && nums[left]==nums[left+1]) left+=1;
//        			while(left<right && nums[right]==nums[right-1]) right-=1;
        		}
        		if(minus<0) left+=1;
        		if(minus>0) right-=1;
        		if(minus==0) return result;
        		
        	}
        }
        return result;
    }
    public static void main(String[] args) {
    	Solutions16 solutions16 = new Solutions16();
//    	int[] nums = 
//    	{13,2,0,-14,-20,19,8,-5,-13,-3,20,15,20,5,13,14,-17,-7,12,-6,0,20,-19,-1,-15,-2,8,-2,-9,13,0,-3,-18,-9,-9,-19,17,-14,-19,-4,-16,2,0,9,5,-7,-4,20,18,9,0,12,-1,10,-17,-11,16,-13,-14,-3,0,2,-18,2,8,20,-15,3,-13,-12,-2,-19,11,11,-10,1,1,-10,-2,12,0,17,-19,-7,8,-19,-17,5,-5,-10,8,0,-12,4,19,2,0,12,14,-9,15,7,0,-16,-5,16,-12,0,2,-16,14,18,12,13,5,0,5,6};
    	int[] nums = {0,1,2,-3};
    	int target = 1;
    	
    	System.out.println(solutions16.threeSumClosest(nums,target));

    }
}
