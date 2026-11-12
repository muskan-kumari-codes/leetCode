class Solution {
    public int minAddToMakeValid(String s) {
        
        int close = 0;
        int open = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                open+=1;
            }
            else if(ch==')'){
                if(open!=0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        
        return open+close;
    }
}
