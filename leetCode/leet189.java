class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int norm = k % n ;
        System.out.println(norm);
        if(norm == 0){
            return;
        }
        int[] res = new int[n];
        
        int ptr = 0;
        for(int i = 0; i < n ; i++){
            res[(i+k)%n] = nums[i];
        }
        for(int o = 0; o < nums.length ; o++){
            nums[o] = res[o];
        }
        
    }
}
