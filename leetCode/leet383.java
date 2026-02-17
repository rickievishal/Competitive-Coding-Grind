class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();

        for(char c : ransomNote.toCharArray()){
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)+1);
                continue;
            }
            h1.put(c,1);
        }
        for(char c : magazine.toCharArray()){
            if(h2.containsKey(c)){
                h2.put(c,h2.get(c)+1);
                continue;
            }
            h2.put(c,1);
        }
        for(Map.Entry<Character,Integer> entry : h1.entrySet()){
            int value = entry.getValue();
            char key = entry.getKey();
            if(value > h2.getOrDefault(key,0)){
                return false;
            }
        }
        return true;
    }
}
