class Solution {
    static int pivotIndex(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        if(nums[s]<nums[e]){
            return -1;
        }
        while(e>=s){
            int mid = s+(e-s)/2;
            if(nums[mid] <= nums[n-1]){
                e = mid-1;
            }else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] nums, int s, int e, int target){
        while(e>=s){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot_index = pivotIndex(nums);
        int n = nums.length;
        int ans = -1;
        if(pivot_index==-1){
            ans = binarySearch(nums, 0, n-1, target);
            return ans;
        }else{
            int startArray1 = 0;
            int endArray1 = pivot_index;
            if(target >= nums[startArray1] && target <= nums[endArray1]){
                ans = binarySearch(nums, startArray1, endArray1, target);
            }

            int startArray2 = pivot_index+1;
            int endArray2 = n-1;
            if(target >= nums[startArray2] && target<=nums[endArray2]){
                ans = binarySearch(nums, startArray2, endArray2, target);
            }
        }
        return ans;
        
    }
}
