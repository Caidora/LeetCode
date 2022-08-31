class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax = 0;
        int totalMax = -10000;
        for(int i = 0; i<nums.length; i++){
            currentMax = Math.max(nums[i], nums[i]+currentMax);
            if(currentMax>totalMax){
                totalMax = currentMax;
            }
        }
        return(totalMax);
        
    }
}