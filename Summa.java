// arr = [3,3,4,5,3,3,3,4,4,5,5,5,2,2]
// res= [3,3,3,3,3,5,5,5,5,4,4,4,2,2]

class Summa {
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }
    private static void sort(int[] arr , int[] hash){

        for(int i = 0 ; i < arr.length ; i ++){
            int greatIndex = i;
            for(int j = i+1 ; j < arr.length-1 ; j++){
                System.out.print(arr[j]);
                if(hash[arr[i]] < hash[arr[j]]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args){
        int[] arr ={3,3,4,5,3,3,3,4,4,5,5,5,2,2};
        int n = arr.length;
        int[] hash = new int[100];
        int[] noDup = new int[n];
        int curr = 0;


        for(int i = 0 ; i < n ; i++){
            if(hash[arr[i]] == 0){
                noDup[curr++] = arr[i];
            }
            hash[arr[i]]++;
        }


        int[] res = new int[curr];
        for(int k = 0 ; k < curr ; k++){
            res[k] = noDup[k];
        }

        sort(res,hash);

        int[] output = new int[n];
        int c = 0;
        for(int p = 0 ; p < res.length ; p++){
            
            for(int h = 0 ; h < hash[res[p]] ; h++){
                System.out.println(res[p]);
                output[c++] = res[p];
            }
        }
        System.out.println();
        printArr(output);
    }  
}