import java.util.*;
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] firstLocations = new int[26];
        char[] chars = s.toCharArray();
        Arrays.fill(firstLocations, -1);
        for(int i=0; i< chars.length; i++){
            int currentLetterInt = (int)chars[i]-97;
            if(firstLocations[currentLetterInt]== -1){
                firstLocations[currentLetterInt]=i;
            }else if(distance[currentLetterInt] != (i-firstLocations[currentLetterInt]-1)){
                return(false);
            }
        }
        return(true);
    }
}