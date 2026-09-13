public class array_manipulationProblems {

    //REverse an array
    static void reversearray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }
        //print the array
        for(int k:arr){
            System.out.println(k);
        }
        /* Main file
         public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        reversearray(arr);
    }

} */
    }

    //ShiftBy1
    static void shiftby1(int[] arr) {
        int n=arr.length-1;
        int temp = arr[n];
        for(int i=n; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        shiftby1(arr);
        for(int num:arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }

}
