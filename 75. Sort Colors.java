class Solution {
    public void sortColors(int[] nums) {
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) {
                sum0++;
            }else if(nums[i]==1){
                sum1++;
            }else{
                sum2++;
            }
        }
        int i=0;
        while(i<sum0 && i<nums.length){
            nums[i] = 0;
            i++;
        }
        while(i<sum1+sum0 && i<nums.length){
            nums[i] = 1;
            i++;
        }
        while(i<nums.length){
            nums[i] = 2;
            i++;
        }

    }
}
