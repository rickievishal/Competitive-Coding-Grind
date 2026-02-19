class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int right = 0;
        int left = n - 1;
        int maxArea = 0;
        while(right<left){
            int l = height[left];
            int r = height[right];

            int area = Math.abs((right- left)*Math.min(r,l));
            maxArea = Math.max(maxArea,area);
            if(r > l){
                left--;
            }else{
                right++;
            }
        }
        return maxArea;
    }
}
