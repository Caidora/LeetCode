class Solution {
    public boolean isPalindrome(String s) {
        char[] frontHalfChars;
        char[] backHalfChars;
        s = s.replaceAll(
          "[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if(s.length()%2==0){
            frontHalfChars = (s.substring(0, s.length()/2)).toCharArray();
            backHalfChars = (s.substring(s.length()/2, s.length())).toCharArray();
        }else{
            frontHalfChars = (s.substring(0, s.length()/2+1)).toCharArray();
            backHalfChars = (s.substring(s.length()/2, s.length())).toCharArray();
            s = s +" ";
        }
        for(int i = 0; i<(s.length()/2);i++){
            if(frontHalfChars[i]!=backHalfChars[(s.length()/2)-i-1]){
                return(false);
            }
        }
        return(true);
    }
}