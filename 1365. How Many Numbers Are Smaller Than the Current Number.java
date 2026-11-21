class Solution {
    public void insertionSort(int [] nums){
        int n = nums.length;
        for(int i=1; i<n; i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }
        insertionSort(ans);
        for(int i=0; i<nums.length; i++){
            int j=0;
            while(ans[j]!=nums[i]){
                j++;
            }
            nums[i] = j;
        }
        return nums;
    }
}
