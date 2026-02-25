public class FlippingImage {

     //TC -> O(n * m) n = row.length and m = row[0].length ;
    // // SC -> O(1)
    // public static int[][] flipAndInvertImage(int[][] image) {
    //         for(int[] row : image) {
    //             // reverse the array
    //             for(int i=0; i<(image[0].length + 1) / 2 ; i++) {
    //                     // swap 
    //                     int temp = row[i] ^ 1 ;
    //                     row[i] = row[image[0].length - i - 1] ^ 1 ;
    //                     row[image[0].length - i - 1] = temp ;
    //             }
    //         }
    //         return image ;
    // }

    // TC -> O(n * m) n = row.length and m = row[0].length ;
    // SC -> O(1)
    public static int[][] flipAndInvertImage(int[][] image) {
            for(int[] row : image) {
                // reverse the array
                int st  = 0 ;
                int end = image.length - 1 ;

                while(st <= end) {
                    int temp = row[st] ^ 1 ;
                    row[st] = row[end] ^ 1 ;
                    row[end] = temp ;

                    st++ ; end-- ;
                }
            }
            return image ;
    }
    public static void main(String[] args) {
        
    }
    
}
