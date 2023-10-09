class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        boolean targetIsFound = false;

        while(left <= right){
            mid = left + (right - left) / 2;
            if(target == nums[mid]){
                targetIsFound = true;
                break;
            }

            if(target < nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }
        if(targetIsFound){
            int leftP = mid;
            int rightP = mid;
            while(leftP > 0 && nums[leftP] == target){
                if(nums[leftP -1] == target) {
                    leftP--;
                }else break;
            }
            while(rightP < nums.length - 1 && nums[rightP] == target){
                if(nums[rightP + 1] == target) {
                    rightP++;
                }else break;
            }

            if(leftP == rightP){
                return new int[]{leftP, leftP};
            }else return new int[]{leftP, rightP};



        }else return new int[]{-1, -1};
    }
}