import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Integer, Integer> M = new HashMap<Integer, Integer>(26);
        for(char i: magazine.toCharArray()){
            int asciiValue = (int)i-97;
            int currentValue = 0;
            if(M.containsKey(asciiValue)){
                currentValue = M.get(asciiValue);
            }
            if(currentValue == 0){
                M.put(asciiValue, 1);
            }else{
                M.put(asciiValue, currentValue+1);
            }
        }
        for(char i: ransomNote.toCharArray()){
            int asciiValue = (int)i-97;
            
            if(M.containsKey(asciiValue)){
                if(M.get(asciiValue)==0){
                    return(false);
                }else{
                M.put(asciiValue, M.get(asciiValue)-1);
            }
            }else{
                return(false);
            }
        }
        return(true);
    }
}
/**
 * Creates a hashmap with the count of each letter occuring in the magazine.
 * Then for every character in ransomNote it lowers the count of that character in magazine by 1. 
 * If it ever trys to remove a character from magazine but magazine has no more letters in it then it returns false.
 * 
 * In heindsight. An implementation using a simple int[] instead of a HashMap would have been much more efficient. 
 */