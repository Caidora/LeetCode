import java.util.*;
class Solution {
    public int longestNiceSubarray(int[] nums) {
        Vector<Integer> currentSubArray;
        int longestSubArray = 1;
        if(nums.length==1){
            return(1);
        }
        for(int i = 0; i<nums.length;i++){
            currentSubArray = new Vector<Integer>();
            currentSubArray.add(nums[i]);
            for(int j = i+1; j<nums.length; j++){
                int next = nums[j];
                int flag = 0;
                for(int k: currentSubArray){
                    if((next&k)!=0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    currentSubArray.add(next);
                }else{
                    break;
                }
            }
                longestSubArray = Math.max(longestSubArray, currentSubArray.size());
            
            
        }
        
            
        return(longestSubArray);
    }
}