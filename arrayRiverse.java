public class arrayRiverse {

    public static void main(String[] args) {

        int[] arr = {9, 19, 29, 39, 49, 59};
        

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        

        for (int value : arr) {
            System.out.println("Reversed array is: " + value + " ");
        }
        
    }
}