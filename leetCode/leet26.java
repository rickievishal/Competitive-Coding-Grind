class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int ptr = 0;
        int prev =Integer.MAX_VALUE;
        for(int i =0 ; i < n ; i++){
            if(prev == nums[i]){
                continue;
            }
            
            nums[ptr++] = nums[i];
            prev = nums[i]; 
        }
        return ptr;
    }
}
