package main.cczq.zrh;
/*给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

注意:
不能使用代码库中的排序函数来解决这道题
*/
public class Solutions75 {
	public void sortColors(int[] nums) {
        int p0=0;
        int p2=nums.length-1;
        int cur=0;
        while(cur<=p2) {
        	if(nums[cur]==0) {
        		int temp = nums[cur];
        		nums[cur++] = nums[p0];
        		nums[p0++] = temp;
        	}else if(nums[cur]==2) {
        		int temp = nums[cur];
        		nums[cur] = nums[p2];
        		nums[p2--]=temp;
        	}else {
        		cur++;
        	}
        }
    }
}
