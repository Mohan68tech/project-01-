public class ArraySumandAvg {

    public static void main(String[] args) {

        int[] arr = {25, 55, 10, 85, 99};

        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is: " + average);
    }
}