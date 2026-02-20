import java.util.* ;
public class FindUnion {

public static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {

  // to store union of both array
  ArrayList<Integer> union = new ArrayList<>() ;

 int i = 0 ; // pointer for arr1 
 int j = 0 ; // pointer for arr2

 while(i < n && j < m) { // run a loop till end

  // if element of arr1 is smaller
  if(arr1[i] < arr2[j]) {
    // add if empty or not duplicates
    if(union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
      union.add(arr1[i]) ;
    }
    i++ ; // move pointer of arr1
  } 
  // if element of arr2 is smaller
  else if(arr2[j] < arr1[i]) {
    // add if empty or not duplicates
    if(union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
      union.add(arr2[j]) ;
  }
  j++ ; // move pointer of arr2
 }
 // if both element are equal 
 else {
  // elements are equal, add once if not duplicate
  if(union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
      union.add(arr1[i]) ;
 }
 i++; j++ ; // move both pointer
 }
 }

// append remaining element from arr1
while(i < n) {
    if(union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
      union.add(arr1[i]) ;
    }
    i++ ;
} 

// append remaining element from arr2
while( j < m) {
 if(union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
      union.add(arr2[j]) ;
  }
  j++ ;
}
return union ;
}
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ;
       int arr1[] = {1,2,3,4,5}; 
       int n = arr1.length ;
       int arr2[] = {2,3,4,4,5} ;
       int m = arr2.length ;

      System.out.println(FindUnion(arr1, arr2, n, m));
    }
}
