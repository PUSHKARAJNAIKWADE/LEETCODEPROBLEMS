class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int current_max=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                current_max=current_max+nums[i];
            }
            else{
                max=Math.max(max,current_max);
                current_max=nums[i];
            }
        }
        max=Math.max(max,current_max);
        return max;
    }
}