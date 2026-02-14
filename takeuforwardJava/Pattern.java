import java.util.HashMap;

public class Pattern{
    private static void leftTriangle(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void leftTriangleLetters(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print((char)(j+'A'+1));
            }
            System.out.println();
        }
    }
    private static void rightTriangle(int size){
        for(int i = 1 ; i < size ; i++){
            for(int k = 1 ; k <= size-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void rightTriangleLetters(int size){
        for(int i = 1 ; i < size ; i++){
            for(int k = 1 ; k <= size-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print((char)(j+'A'-1));
            }
            System.out.println();
        }
    }
    private static void equalTriangle (int size){
        for(int i = 1 ; i < size ; i++){
            for(int k = 1 ; k <= size-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            for(int l = i-1 ; l >= 1 ; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    private static void equalTriangleLetters (int size){
        for(int i = 1 ; i < size ; i++){
            for(int k = 1 ; k <= size-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print((char)(j+'A'-1));  
            }
            for(int l = i-1 ; l >= 1 ; l--){
                System.out.print((char)(l+'A'-1));
            }
            System.out.println();
        }
    }
    private static void invertedTriangle(int size){
        int n = size;
        for(int i = n ; i > 0 ; i--){
            for(int l = 1 ; l <= n-i ; l++){
                System.out.print(" ");
            }
            for(int k = 1 ; k < i ;k++){
                System.out.print(k);
            }
            for(int j = i ; j > 0 ; j--){ 
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void findSize(String s){
        System.out.println(s);
        int n = s.length();
        HashMap <Character,Integer> map = new HashMap<>();
        HashMap <Character,Integer> mapc = new HashMap<>();
        int largeVowelOccurance = 0;
        int largeConOccurance = 0;
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
                largeVowelOccurance = Math.max(largeVowelOccurance,map.get(c));
            }else{
                if(mapc.containsKey(c)){
                    mapc.put(c,mapc.get(c)+1);
                    largeConOccurance = Math.max(largeConOccurance,mapc.get(c));
                }else{
                    mapc.put(c,1);
                }
            }
        }
        System.out.println("Consonant : "+largeConOccurance+ "  Vowels : "+largeVowelOccurance );
    }
    public static void main(String[] args){
        
        // equalTriangleLetters(5);
        // rightTriangleLetters(5);

        findSize("eeaaaaibb");

    }
}