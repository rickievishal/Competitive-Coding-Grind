class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i = 0 ; i < n-1 ; i++){
            int t = target - nums[i];
            for(int j = i+1; j < n ; j++){

                if(t == nums[j]){
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        int[] res = new int[2];
        return res;
    }
}
