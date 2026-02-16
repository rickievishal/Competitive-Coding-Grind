class Solution {
    public int reverse(int x) {
        int m = 1;
        if(x<0){
            m= - 1;
        }
        x = Math.abs(x);
        String n = Integer.toString(x);
        String str = new StringBuilder(n).reverse().toString();
        System.out.println(str);
        String check = "2147483647";
        if(check.length() <= str.length()){
            for(int i = 0; i < check.length() ; i++){
                int ch = Integer.valueOf(check.charAt(i));
                int strn = Integer.valueOf(str.charAt(i));
                if(strn < ch){
                    break;
                }
                if(strn > ch){
                    return 0;
                }
            }
        }
        return m*Integer.valueOf(str);

    }
}
