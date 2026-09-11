public class arraySmall{
    public static void main(String[] args){
        int arr[] = {2, 44, 667, 8 , 0};
        int smallest = arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
          }      
      System.out.println("Smallest array is: " + smallest);
  }
    }
