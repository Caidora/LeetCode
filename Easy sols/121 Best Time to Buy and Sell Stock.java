class Solution {
    public int maxProfit(int[] prices) {
        int lowest = 10000;
        int output = 0;
        int currentHighestProf = 0;
        for(int i = 0; i<prices.length; i++){
            if(lowest>prices[i]){
                lowest = prices[i];
            }
            currentHighestProf = prices[i] - lowest;
            if(currentHighestProf > output){
                output = currentHighestProf;
            }
        }
        return(output);
    }
}