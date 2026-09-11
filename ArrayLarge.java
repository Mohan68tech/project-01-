//CODING — Find the largest element in an integer array.

public class ArrayLarge{

   public static void main(String[] args){

    int[] arr = {12, 6, 78, 21, 88};
    int largest = arr[0];

    for(int i = 0; i<=arr.length-1; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    System.out.println("Largest  array is: " + largest);
   }
}
