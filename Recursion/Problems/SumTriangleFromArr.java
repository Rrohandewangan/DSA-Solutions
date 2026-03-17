package Problems;

import java.util.Arrays;

public class SumTriangleFromArr {
    
 static void printTri(int[] arr) {
    if(arr.length == 1) {
        System.out.println(Arrays.toString(arr));
        return ;
    }

    int[] temp = new int[arr.length - 1] ;

    for(int i=0; i<temp.length; i++) {
        temp[i] = arr[i] + arr[i + 1] ;
    }

    printTri(temp);

    System.out.println(Arrays.toString(arr));
 }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5} ;

        printTri(arr);
    }
}
