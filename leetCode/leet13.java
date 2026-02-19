class Solution {
    public static void reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the characters at the start and end positions
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers inward
            start++;
            end--;
        }
    }
    public int romanToInt(String s) {
        HashMap <Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int res = 0;
        int maxPrev = 0;
        char[] cr = s.toCharArray();
        reverse(cr);
        for(char c : cr){
            int value = m.get(c);
            maxPrev = Math.max(maxPrev,value);
            if(maxPrev > value){
                res = res - value;
                continue;
            }
            res = res + value;
        }
        return res;

    }
}
