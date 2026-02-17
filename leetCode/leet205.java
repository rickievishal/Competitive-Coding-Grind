class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1 = new HashMap<>();
        HashMap<Character,Character> h2 = new HashMap<>();

        int n = s.length();
        for(int i =0;i<n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(h1.containsKey(c1)){
                if(h1.get(c1)!=c2){
                    return false;
                }
                continue;
            }else{
                h1.put(c1,c2);
            }
            if(h2.containsKey(c2)){
                if(h2.get(c2)!=c1){
                    return false;
                }
                continue;
            }else{
                h2.put(c2,c1);
            }


            
        }
        return true;
    }
}
