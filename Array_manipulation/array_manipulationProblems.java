
import java.util.HashMap;

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
        /*  Main file
        public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        shiftby1(arr);
        for(int num:arr){
            System.out.println(num + " ");
        }
        System.out.println();
        }

        } */
    }


    //Find High frequency and low frequency elements
    static int[] getHighLowfreqElements(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // insert data
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0) +1);
        }
        // HAshmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > highestFreq) {
                //update the hgihesrt
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowestFreq) {
                //update the lowest
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5};
        int ans[] = getHighLowfreqElements(arr);
        System.out.println("highest freq wala num " + ans[0]);
        System.out.println("lowest freq wala num " + ans[1]);

    }

}
