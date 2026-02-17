class Solution {
    public static int find(int[] nums , int target, int s){
        int start = s+1 ;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;

    }
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i = 0 ; i < n ; i++){
            int t = target - numbers[i];
            int index = find(numbers,t,i);
            if(index != -1 && i != index){
                int[] res = new int[2];
                res[0]=i+1;
                res[1]=index+1;
                return res;
            }
        }
        int[] res = new int[2];
        return res;
    }
}
