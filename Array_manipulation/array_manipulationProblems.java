public class array_manipulationProblems {
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
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        reversearray(arr);
    }

}
