import java.util.*;

public class input2{
    public static void main(String[] args){
        
     
      Scanner sc = new Scanner(System.in);

      System.out.print("enter a : ");
      int a = sc.nextInt();
    //   System.out.print("enter b : ");
    //   int b = sc.nextInt();
    //   System.out.println("Answer :-");
    //   System.out.println("Sum : a + b =" + ( a + b));
    //   System.out.println("Mul : a*b =" + (a*b));
    //   System.out.println("div : a/b ="  + (a/b));
    //   System.out.println("Sub : a - b ="  + (a - b));
    //   System.out.println("rem : a%b ="  + (a%b)); //gives remainder
    System.out.println((a % 2 == 0) );//even

      sc.close();

    }
}