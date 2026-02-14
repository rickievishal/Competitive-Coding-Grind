class Leetx {
    private static void printArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
    private static void solution(int[] arr){
        int n = arr.length;
        boolean isFull = false;
        int prev = arr[0];
        int curr = 1 ;
        for(int i = 1 ; i < n ; i++){
            if(prev == arr[i]){
                if(isFull){
                    continue;
                }else{
                    arr[curr++] = arr[i];
                    isFull = true;
                }
            }else{
                arr[curr++]=arr[i];
                prev=arr[i];
                isFull = false;
            }
        }
        printArr(arr);

    }
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3,3,4,4};
        System.out.println("hello");
        solution(arr);

    }
}


