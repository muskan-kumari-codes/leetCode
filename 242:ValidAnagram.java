class Solution {
    public boolean isAnagram(String s, String t) {
        Stack<Character> stack = new Stack<>();
        
        if(s.length() != t.length())
            return false;
            
        for(int i=0; i<t.length(); i++){
            stack.push(t.charAt(i));
        }

        for(int i=0; i<s.length(); i++){
            if(stack.contains(s.charAt(i))){
                stack.remove(Character.valueOf(s.charAt(i)));
            }
        }
        return stack.isEmpty();
    }
}
