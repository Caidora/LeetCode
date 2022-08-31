import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int letterValue;
        for(int i = 0; i < s.length(); i++){
            letterValue = (int) sChar[i];
            sCounts[letterValue-97] += 1;
        }
        for(int i = 0; i < t.length(); i++){
            letterValue = (int) tChar[i];
            tCounts[letterValue-97] += 1;
        }
        return(Arrays.equals(tCounts,sCounts));
    }
}