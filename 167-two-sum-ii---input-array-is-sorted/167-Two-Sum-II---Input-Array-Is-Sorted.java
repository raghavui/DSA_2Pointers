class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int[] ans = new int[2];
        while(i<nums.length && j>=0){
            if(nums[i]+nums[j] > target){
                j--;
            }
            else if(nums[i]+nums[j] < target){
                i++;
            }
            else{
                return new int[]{i+1, j+1};
            }
        }
        return ans;
    }
}