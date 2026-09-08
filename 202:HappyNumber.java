class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        int num;
        while(n>1){
            num = 0;
            while(n>0){
                int digit = n%10;
                n/=10;
                num += digit*digit;
            }
            if(!set.add(num)){
                return false;
            }else{
                set.add(num);
                n = num;
            }
        }
        if(!set.contains(1)){
            return false;
        }
        return true;
    }
}
