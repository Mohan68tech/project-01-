class factorial{
    private int n;

    public int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n* factorial(n-1);

    }
    

// public class recursion {

    public static void main(String[] args){

        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
