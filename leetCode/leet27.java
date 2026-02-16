class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int ptr = 0;
        for(int i =0 ; i < n ; i++){
            if(val == nums[i]){
                continue;
            }
            nums[ptr++] = nums[i];
        }
        return ptr;
    }
}
