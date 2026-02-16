class Solution {
    public boolean isPalindrome(int x) {
        // if(x < 0){
        //     return false;
        // }

        // List<Integer> n = new ArrayList<>();
        // while(x != 0){
        //     n.add(x%10);
        //     x=x/10;
        // }

        // for(int i = 0 ; i < n.size()/2 ; i++){
        //     if(n.get(i) != n.get(n.size()-i-1)){
        //         return false;
        //     }
        // }
        // return true;
        if(x < 0) {
            return false;
        }
        int copy = x;
        int rev = 0;
        int p = 0;
        while(copy != 0){
            rev = (rev * 10) + (copy%10);
            copy = copy /10;
        }
        if (rev == x) return true;
        else return false;
    }

}
