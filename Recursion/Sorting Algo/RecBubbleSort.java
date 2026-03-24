
import java.util.Arrays;

public class RecBubbleSort {
    
    static void bubble(int[] arr, int r, int c) {
        if(r == 0) {
            return ;
        }
        if(c < r) {

            if(arr[c] > arr[c + 1]) {
                //swap
                int temp =  arr[c] ;
                arr[c] = arr[c + 1] ;
                arr[c + 1] = temp ;
            }

            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r-1, 0);
        }

    }

    static void bubbleSort2(int[] arr, int i, int n) {
        if(n == 1) {
            return ;
        }

        if(i < n - 1) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i] ;
                arr[i] = arr[i+1] ;
                arr[i+1] = temp ;
            }
            bubbleSort2(arr, i + 1, n);
        } else {
            bubbleSort2(arr, 0, n-1);
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1} ;
        // bubble(arr, arr.length - 1, 0);
        bubbleSort2(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
