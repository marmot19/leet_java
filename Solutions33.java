package main.cczq.zrh;


/*
 * ÊäÈë: nums = [4,5,6,7,0,1,2], target = 0
   Êä³ö: 4
*/
public class Solutions33 {
	public int search(int[] nums, int target) {
		if(nums.length==0) return -1;
		if(nums.length==1 && nums[0]!=target) return -1;
		if(nums.length==1 && nums[0]==target) return 0;
        int pivot = nums.length-2;
        int index = -1;
        while(pivot>=0 && nums[pivot]<nums[pivot+1]) {
        	pivot--;
        }
        if(pivot>=0) {
	        if(target == nums[pivot]) {
	        	index = pivot;
	        }else if(target <= nums[nums.length-1]) {
	        	index = searchDes(nums, target,pivot+1,nums.length-1);
	        }else if(target<=nums[pivot]) {
	        	index = searchDes(nums, target,0,pivot);
	        }
        }else {
        	index = searchDes(nums, target, 0,nums.length-1);
        }
        return index;
    }
	
	public int searchDes(int[] nums, int target, int start, int end) {
		int len = end-start+1;
		int mid = start+len/2;
		int index = 0;
		if(end<start && nums[mid]!=target) return -1;
		if(nums[mid]==target) {
			index = mid;
		}else if(nums[mid]>target) {
			index = searchDes(nums, target, start, mid-1);
		}else if(nums[mid]<target) {
			index = searchDes(nums, target, mid+1, end);
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,1};
		int target = 1;
		
		Solutions33 s = new Solutions33();
		System.out.println(s.search(nums, target));
	}
}
