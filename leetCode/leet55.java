class Solution {
    public boolean canJump(int[] nums) {
        int maxStep = 0;
        int n = nums.length;
        if(n == 1) {
            return true;
        }
        for(int i = 0 ; i < n ; i++){
            if(i > maxStep){
                return false;
            }
            maxStep = Math.max(maxStep,i+nums[i]);
        }
        return true;
    }
}
