import java.util.HashMap;
class Leet383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> map1 = new HashMap<>();
        HashMap <Character,Integer> map2 = new HashMap<>();

        int mLength = magazine.length();
        int rLength = ransomNote.length();
        if(rLength > mLength){
            return false;
        }
        for(char i : magazine.toCharArray()){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
                continue;
            }
            map1.put(i,1);
        }
        for(char j : ransomNote.toCharArray()){
            if(map2.containsKey(j)){
                map2.put(j,map2.get(j)+1);
                continue;
            }
            map2.put(j,1);
        }
        for(char k : map2.keySet()){
            if(map1.containsKey(k)){
                if(map2.get(k) > map1.get(k)){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("hello");
        System.out.println(canConstruct("a","b"));
    }
}