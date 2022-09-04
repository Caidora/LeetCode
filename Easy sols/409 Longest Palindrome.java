class Solution {
    public int longestPalindrome(String s) {
        int[] lowers = new int[26];
        int[] uppers = new int[26];
        char[] chars = s.toCharArray();
        for(char c: chars){
            if((int)c-96>0){
                lowers[(int)c-97]++;
            }else{
                uppers[(int)c-65]++;
            }
        }
        int currentIdx = 0;
        int totLetters = 0;
        boolean isSingle = false;
        while(currentIdx <26){
            if(lowers[currentIdx]>=2){
                totLetters+=2;
                lowers[currentIdx] -= 2;
            }else if(lowers[currentIdx]==1){
                isSingle = true;
                lowers[currentIdx]--;
            }else if(lowers[currentIdx]==0){
                currentIdx++;
            }
        }
        currentIdx = 0;
        while(currentIdx <26){
            if(uppers[currentIdx]>=2){
                totLetters+=2;
                uppers[currentIdx] -= 2;
            }else if(uppers[currentIdx]==1){
                isSingle = true;
                uppers[currentIdx]--;
            }else if(uppers[currentIdx]==0){
                currentIdx++;
            }
        }
        if(isSingle){
            return(totLetters+1);
        }else{
            
            return(totLetters);
        }
    }
};