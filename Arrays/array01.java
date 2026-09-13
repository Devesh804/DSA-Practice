
public class array01 {

    // average array
    static double getAverage(int[] arr) {
        double sum = 0;
        for(int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    // multiply each element by 10
    static int[] multiplyby10(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
            
        }

        return newArray;
    }


    // Find taget element
    static boolean findtarget(int arr[], int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        // agar poora arr traverse krne ke baad bhi target nhi milta hai
        // to return false kr denge
        return false;
    }

    // Find maximum element
    static int getmaximum(int arr[]) {
        int maxi = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        // yaha tak pura array comparae ho chuka hoga 
        // and maximum element ki value me store ho chuki hai
        return maxi;
    }

    //Find postive sum and negative sum
    static int[] getPosNegSum(int arr[]) {
        int posSum = 0;
        int negSum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0){
                // add in posSum
                posSum += arr[i];
            }

            else{
                // add im negSum
                negSum += arr[i];
            }
        }

        int ans[] = {posSum, negSum};
        return ans;

           //main file
//     public static void main(String[] args) {
//         int arr[] = {2,-3,-5,-7,9};
//         int ans[] = getPosNegSum(arr);
//         System.out.println("Positive numbers sum: " + ans[0]);
//         System.out.println("Negative numbers sum: " + ans[1]);
//     }

// }
    }
   


    // Count no. of 0's and 1's
    static int[] Count0and1(int arr[]) {
        int zerocount = 0;
        int onecount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zerocount++;
            }
            else{
                onecount++;
            }
        }
        int ans[] = {zerocount, onecount};
        return ans;

        // main file
        /*public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1};
        int ans[] = Count0and1(arr);
        System.out.println("No. of 0's: " + ans[0]);
        System.out.println("No. of 1's: " + ans[1]);
    }

}*/
    }


    // Find first unsorted element in array
    static int getUnsortedelem(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i+1] <= arr[i]) {
                return arr[i+1];
            }
    }
    return -1;
// main class
/*public static void main(String[] args) {
        int arr[] = {1,2,4,7,11,3,23};
        System.out.println("Unsorted element is: " + getUnsortedelem(arr));
    }
}
 */
}


    //swap two elements in array
    static void swapelements(int arr[]){
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        /*Main file
        public static void main(String[] args) {
        int arr[] = {1,2,4,7,11,3,23};
        swapelements(arr);
        System.out.println("Array with swapped elements is: "
                + Arrays.toString(arr));
    }
}
 */
    }


    // Print Array Intersection element
    static void Commonelements(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i] + "");
                }
            }
        }
        /* Main file
        public static void main(String[] args) {
        int arr1[] = {1,2,4,5,6,8,9};
        int arr2[] = {2,3,4,7,8};
        System.out.println("Common elements are: ");
        Commonelements(arr1, arr2);
    }
}
 */
    }

    // two extreme elements in array
    static void AlternateExtremeElems(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <= j) {
            if(i == j){
                System.out.println(arr[i]);
                return;
            }
            else{
                // i<j wala case
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
        /* main file
          public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,8,9};
        AlternateExtremeElems(arr);
    }
}

         */
    }

    // Type io 
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,8,9};
        AlternateExtremeElems(arr);
    }
}
