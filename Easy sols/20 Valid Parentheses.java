class Solution {
    public boolean isValid(String s) {
        String valids = "()[]{}";
        StringBuffer stack = new StringBuffer(s.length());
        stack.append('0');
        for(char i: s.toCharArray()){
            
            if(i == valids.charAt(0)||i==valids.charAt(2)||i==valids.charAt(4)){
                stack.append(i);
                continue;
            }else if(i == valids.charAt(1) && stack.charAt(stack.length()-1)==valids.charAt(0)){  
                if(stack.length()>1){
                    stack.deleteCharAt(stack.length()-1);
                }
                continue;
            }else if(i == valids.charAt(3) && stack.charAt(stack.length()-1)==valids.charAt(2)){               
                if(stack.length()>1){
                    stack.deleteCharAt(stack.length()-1);
                }
                continue;
            }else if(i == valids.charAt(5) && stack.charAt(stack.length()-1)==valids.charAt(4)){               
                if(stack.length()>1){
                    stack.deleteCharAt(stack.length()-1);
                }
                continue;
            }
            return(false);
            
        }
        if(stack.length() == 1){
            return(true);
        }else{
            
            return(false);}
    }
}