package main.cczq.zrh;

import java.util.Collections;

public class Solutions31 {
	public void nextPermutation(int[] nums) {
		int indexL = nums.length-2;
        int indexS = nums.length-1;
        
        while(indexL>=0 && nums[indexL]>=nums[indexS]) {
        	indexL-=1;
        	indexS-=1;
        }
        
        if(indexL>=0) {
            for(int i=nums.length-1;i>=0;i--) {
                if(nums[i]>nums[indexL]) {
                    int swap = nums[i];
                    nums[i]=nums[indexL];
                    nums[indexL]=swap;
                    break;
                }
            }
        }
        for(int i=indexS,j=nums.length-1;i<j;i++,j--) {
        	int swap = nums[i];
        	nums[i]=nums[j];
        	nums[j]=swap;
        }
    }
}
