public class MergeSort {

    static int[] arr;

    public static void display(int[] arr){

        System.out.print("[ ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.print("]");
    }

    public static void createArray(int n){

        arr = new int[n];
        int len = arr.length;

        System.out.print("[ ");
        for(int i=len; i > 0; i--){
            arr[len-i] = i;
            System.out.print( arr[len-i] + ", ");
        }
        System.out.println("]");
    }

    public static void mergeSort(int[] arr){

        int n = arr.length;
        if (n < 2) return;

        int mid = n/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[n-mid];

        // start fill the left half arr
        for (int i=0; i < mid; i++){
            leftHalf[i] = arr[i];
        }

        // fill the right half arr
        for (int i=mid; i<n; i++){
            rightHalf[i-mid] = arr[i];
        }

        //start D&C to merge sort recursively
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf){

        int leftLen = leftHalf.length;
        int rightLen = rightHalf.length;

        int i = 0, j= 0, k = 0;

        while (i < leftLen && j < rightLen){

            if (leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftLen){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightLen){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
