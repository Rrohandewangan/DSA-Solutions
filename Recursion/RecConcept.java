public class RecConcept {
    
    //print number from n to 1 ->
    // static void print(int n) {
    //     if(n == 1) {
    //         System.out.println(n);
    //         return ;
    //     }
    //     System.out.println(n);
    //     print(n - 1);
    // }


    // find the nth fibonacci number ->
    // static int fibonacci(int n) {
    //     if(n < 2) {
    //         return n ;
    //     }
    //     return fibonacci(n-1) + fibonacci(n-2) ;
    // }


    // Binary Search using recursion ->
    // static int search(int[] arr, int target, int st, int end) {

    //     if(st > end) {
    //         return -1 ;
    //     }
    //     int mid = st + (end - st) / 2 ;

    //     if(arr[mid] == target) {
    //         return mid ;
    //     } else if(target < arr[mid]) {
    //         return search(arr, target, st, mid - 1) ;
    //     } else {
    //         return search(arr, target, mid + 1, end) ;
    //     }
    // }


    /// Que3 -> find the factorial of nth number 
    // static int fact(int n) {
    //     if(n == 0 || n == 1) {
    //         return 1 ;
    //     }

    //     return n * fact(n - 1) ;
    // }


    // // que4 -> find sum of digits in number n
    // static int digitSum(int n) {
    //     if(n == 0) {
    //         return 0 ;
    //     } 

    //     return (n % 10) + digitSum(n / 10) ;
    // }

    // que5 -> find product of digits in number n
    // static int prod(int n) {
    //     if(n % 10 == n) {
    //         return  n;
    //     } 

    //     return (n % 10) * prod(n / 10) ;
    // }


    // Concept of n-- and --n -> 
    // n--  => first pass the value of n and substract it by one 
    // --n  => first substract value by 1 and then pass the value of n

    // static void concept(int n) {
    //     if(n == 0) {
    //         return ;
    //     }

    //     System.out.println(n);
    //     // concept(n--); it gives infinte recursion and stack overflow error 
    //     concept(--n);
    // }


    // que6 -> reverse a digits in number n
    // static int sum = 0 ;
    // static void reverse1(int n) {
    //     if(n == 0) {
    //         return ;
    //     }
    //     int rem = n % 10 ;
    //     sum = sum * 10 + rem ;
    //     reverse1(n/10);
    // }


    // private static int helper(int n, int digits) {
    //     if(n % 10 == n) {
    //         return n ;
    //     }
    //     int rem = n % 10 ;
    //     return rem * (int) Math.pow(10, digits-1) + helper(n/10, digits-1) ;
    // }

    // static int reverse2(int n) {
    //     // sometimes you migth need some additional variables in the argument 
    //     // in that case, make another function
    //     int digits = (int)(Math.log10(n) + 1) ;
    //     return helper(n, digits) ;
    // }



    // // que7 -> check a number is palindrome or not 
    
    // static boolean palindrome(int n) {
    //     return n == reverse2(n) ;
    // }


    // que8 -> count number of zeros in a number 
    // special pattern, how to pass a value to above calls
    // static int count(int n) {
    //     return helper(n, 0) ;
    // }
    // private static int helper(int n, int count) {
    //     if(n == 0) {
    //         return count ;
    //     }

    //     int rem = n % 10 ;
    //     if(rem == 0) {
    //         return helper(n/10, count + 1) ;
    //     }
    //     return helper(n/10, count) ;
    // }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 55, 66, 78} ;
        // int target = 66 ;
        // System.out.println(search(arr, target, 0, arr.length - 1));
        // print(5);

        // System.out.println(count(300087087));
        
    }
}
