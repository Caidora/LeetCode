class Solution {
    public int search(int[] nums, int target) {
        int currentHigh = nums.length;
        int currentLow = 0;
        int currentMid = -1;
        while(true){
            if(currentMid == (currentLow +currentHigh)/2){
                return(-1);
            }
            currentMid = (currentLow+currentHigh)/2;
            if(nums[currentMid]<target){
                currentLow = currentMid;
            }else if(nums[currentMid]>target){
                currentHigh = currentMid;
            }else{
                return(currentMid);
            }
        }
    }
}