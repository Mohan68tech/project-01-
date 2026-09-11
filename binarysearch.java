public class binarysearch{
    public void main(String[] args){

        // int arr[] = {10, 20, 30, 40, 50, 60, 70};
        // int key = 20;
        // int left = 0;
        // int right = arr.length - 1;

        // while(left <= right){
        //     int mid = (left + right) / 2;
        //     if(arr[mid] == key) {
        //         System.out.println("element found at index : " + mid);
        //         return ;
        //     }
        //     else if (key < arr[mid]){
        //         right = mid -1 ;
        //     }
        //     else{
        //         left = mid + 1;
        //     }
        // }
        // System.out.println("element not found");
 
                            //  Q1


        // int arr[] = {2, 5, 8, 12, 16, 23, 38};
        // int key = 16;
        // int left = 0;
        // int right = arr.length - 1;

        // // System.out.println("Left :" + left);

        // while(left <= right ){
        //     int mid = (left + right) /2;
        //     if(arr[mid] == key){
        //         System.out.println("index number found :" + mid);
        //         return ;
        //     }else if  (key > arr[mid] ){
        //         left = mid + 1;
        //     }else{
        //         right = mid - 1;
        //     }
        // }
                                   //Q2. Search for 10
                                 // Target = 10
                                  // arr = {1, 3, 5, 7, 10, 12, 15}
                                // Write a Java binary-search program to find the target.
// int arr[] = {1, 3, 5, 7, 10, 12, 15};
// int left =0;
// int right = arr.length - 1;
// int search = 10;
// while (left <= right){

//     int mid = (left + right )/2;
//     if(arr[mid] == search){
//         System.out.println("index found: " + mid);
//         return ;
//     }else if(search < arr[mid]){
//         right = mid - 1;
//     }else{
//         left = mid + 1;
//     }
// }
                               // Q3. Element not present
                               // arr = {2, 4, 6, 8, 10, 12}
                              // Target = 7
                             // Use binary search and determine what the program should return when the element is not found

// int arr[] = {2, 4, 6, 8, 10, 12};
// int target = 7;
// int left = 0;
// int right = arr.length - 1;

// while(left < right){
//     int mid = (left + right)/2;
//     if(arr[mid] == target){
//         System.out.println("element found : " + mid);
//         return ;
//     }else if(arr[mid] > target){
//         right = mid -1;
//     }else{
//         left = mid +1;
//     }
// }
// System.out.println("element not found: ");

                            // Q4. Find the index
                             // arr = {10, 20, 30, 40, 50, 60}
                          // Target = 40
                         // What index should binary search return?
int arr[] = {10, 20, 30, 40, 50, 60};
int target = 40;
int low = 0;
int high = arr.length;

while(low < high){
int mid = (low + high)/2;
if(arr[mid] == target){
    System.out.println("index return :" + mid);
    return;
}else if(arr[mid] > target){
    high--;
}else{
    low++;
}
}
System.out.println("element not found : ");
    }
    }