class Solution {
    public int lengthOfLongestSubstring(String s) {
        int highest = 0;
        int n = s.length();
        int start = 0;

        Set<Character> se = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            while(se.contains(s.charAt(i))){
                se.remove(s.charAt(start));
                start++;
            }
            se.add(s.charAt(i));
            highest = Math.max(highest, i - start+1);
        }
        return highest;
    }
}
