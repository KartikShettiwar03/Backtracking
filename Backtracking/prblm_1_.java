public class prblm_1_{
    public static void backtracking_arrays(int arr[],int i){
        if(i==arr.length){
            print(arr);
            return;
        }//Base Case
        arr[i] = i+1;
        backtracking_arrays(arr,i+1);//Recurrsion
        arr[i] -=2;//BackTrack
        if(i==0){
            print(arr);
        }
    }
    /* 
     * Time => O(n)
     * Space => O(n)
    */
    public static void print(int arr[]){
        System.out.println();
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        backtracking_arrays(arr,0);
        print(arr);
    }
}