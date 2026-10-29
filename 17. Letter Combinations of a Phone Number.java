class Solution {
    void solve(String digits, String[] mapping, int index, StringBuilder ans, List<String> list){
        if(index>=digits.length()){
            list.add(ans.toString());
            return;
        }
        int value = digits.charAt(index) - '0';
        String str = mapping[value];
        for(int i=0; i<str.length(); i++){
            ans.append(str.charAt(i));
            solve(digits, mapping, index+1, ans, list);

            //backtracking
            ans.deleteCharAt(ans.length()-1);
            
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int index = 0;
        StringBuilder ans = new StringBuilder();
        List<String> list = new ArrayList<>();
        solve(digits, mapping, index, ans, list);
        return list;
    }
}
