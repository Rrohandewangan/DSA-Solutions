public class findUnique {

    public static int ans(int[] arr) {
        int unique = 0 ;
        for(int val : arr) {
            unique ^= val ;
        }
        return unique ;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4} ;
        System.out.println(ans(arr));
    }
    
}
