class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] h = new int[26];
        for(char c : magazine.toCharArray()){
            h[(c - 'a')]++;
        }
        for(char c : ransomNote.toCharArray()){
            if(h[(c-'a')] == 0){
                return false;
            }
            h[(c-'a')]--;
        }
        return true;
    }
}
