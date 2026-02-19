class Solution {
    public int countBinarySubstrings(String s) {
        char prev = s.charAt(0);
        int buff = 0;
        List <Integer> l = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(prev != c){
                l.add(buff);
                buff = 1;
                prev = c;
                continue;
            }
            buff++;
        }
        l.add(buff);
        int res =0 ;
        for(int i = 0; i < l.size()-1 ; i++){
            res = res + Math.min(l.get(i),l.get(i+1));
        }

        return res;
        
    }
}
