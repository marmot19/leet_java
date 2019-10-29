package main.cczq.zrh;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

class Solution46 {
    List<List<Integer>>out=new LinkedList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> temp=new ArrayList();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }
        backTrack(0,n,temp);
        return out;
        
    }
    public void backTrack(int first,int n, ArrayList nums){
        if(first==n){
            out.add(new ArrayList<Integer>(nums));
        }
        for(int i=first;i<n;i++){
            Collections.swap(nums,first,i);
            backTrack(first+1,n,nums);
            Collections.swap(nums,first,i);
            
        }
        
    }
}