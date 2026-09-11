public class arrayEvenorOdd {

    public static void main(String[] args) {

        int[] arr = {1, 8, 11, 18, 21, 28, 0};

        int evenCount = 0;
        int oddCount = 0;

        for (int value : arr) {

            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}