import java.util.Arrays;

public class RecSelectionSort {
    
    // static void selection(int[] arr, int r, int c, int maxIdx) {
    //     if(r == 0) {
    //         return ;
    //     }
    //     if(c < r) {

    //         if(arr[c] > arr[maxIdx]) {
    //             selection(arr, r, c + 1, c);
    //         } else {
    //             selection(arr, r, c + 1, maxIdx);
    //         }

    //     } else {
    //         int temp = arr[r - 1] ;
    //         arr[r - 1] = arr[maxIdx] ;
    //         arr[maxIdx] = temp ;

    //         selection(arr, r - 1, 0,0);

    //     }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1} ;
        selection2(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

}
