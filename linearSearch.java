public class linearSearch{
    public static void main(String[] args){

        int arr[] = {24, 45, 10, 40, 50, 60};
        int n = arr.length;
        int search = 45;
         
         for(int i=0; i<n; i++){
            if(arr[i] == search){
            System.out.println("array found at the index " + i);   
            return ;    
              }
         }
             System.out.println("array not found"); 
    }
}