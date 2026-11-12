class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int add = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.isEmpty()){
                    add+=1;
                }
                else{
                    st.pop();
                }
            }
        }
        
        return add+st.size();
    }
}
