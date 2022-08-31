class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lowerBound = 0;
        int upperBound = n;
        int middleBound = 0;
        while(lowerBound <=upperBound){
            middleBound = lowerBound+(upperBound-lowerBound)/2;
            if(isBadVersion(middleBound)){
                upperBound = middleBound-1;
            }else{
                lowerBound =  middleBound+1;
            }
            
        }
        return(lowerBound);
    }
    boolean isBadVersion(int version){
        return(version==10);
    }
}