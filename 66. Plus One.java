class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--){
            int sum = digits[i] + carry;
            carry = sum/10;
            digits[i] = sum%10;
        }
        if(carry!=0){
            int[] ans = new int[digits.length+1];
            ans[0] = carry;
            return ans;
        }
        return digits;
    }
}
