class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = Integer.MAX_VALUE;
        int prevOcc = 1;
        int n = nums.length;
        int ptr=0;
        for(int i = 0 ; i < n ; i++){
            if(prev == nums[i]){
                if(prevOcc  == 2){
                    continue;
                }
                prevOcc++;
                
            }else{
                prev = nums[i];
                prevOcc=1;
            }
            nums[ptr++] = nums[i];
        }
        return ptr;
    }
}
