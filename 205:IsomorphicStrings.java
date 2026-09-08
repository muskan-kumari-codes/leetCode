class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a) && map.get(a)!=b){
                return false;
            }
            if(reverse.containsKey(b) && reverse.get(b)!=a){
                return false;
            }
            map.put(a,b);
            reverse.put(b,a);
        }

        return true;
    }
}
