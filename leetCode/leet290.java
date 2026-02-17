class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character,String> h1 = new HashMap<>();
        HashMap <String,Character> h2 = new HashMap<>();


        String[] words = s.split(" ");
        int n = pattern.length();
        if(pattern.length() != words.length) return false;
        for(int i = 0 ; i < n ; i++){
            char c = pattern.charAt(i);
            String str = words[i];
            if(h1.containsKey(c)){
                if(!Objects.equals(h1.get(c),str)){
                    return false;
                }
            }else{
                h1.put(c,str);
            }
            if(h2.containsKey(str)){
                if(!Objects.equals(h2.get(str),c)){
                    return false;
                }
            }else{
                h2.put(str,c);
            }
        }
        return true;
        
    }
}
