class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for(int val : nums){
            if(val==max || val==max2 || val==max3){
                continue;
            }

            if(val>max){
                max3 = max2;
                max2 = max;
                max = val;
            }else if(val>max2){
                max3 = max2;
                max2 = val;
            }else if(val>max3){
                max3 = val;
            }
        }

        if(max3 == Long.MIN_VALUE){
            return (int)max;
        }

        return (int)max3;
    }
}
