import java.util.Scanner;

public class lesson5{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
// If condation
    // int x = 18;
    // if (x >= 18)
    // {
    //     System.out.println("eligiable for vote");
    // }
    //if - else condation
    // System.out.print("enter a value :");
    // int a = sc.nextInt();

    // if(a>=18){
    //     System.out.println("eligiable");
    // }else{
    //     System.out.println("Not eligiable");
    // }
//Even , Odd program
    // System.out.print("enter a number :");
    // double x = sc.nextDouble();

    // if(x % 2 == 0){
    //     System.out.println("Even");
    // }else{
    //     System.out.println("Odd");
    // }
     
    //  System.out.print("Enter a num: ");
    //  int b = sc.nextInt();
    //  if(b > 0){
    //     System.out.println("positive");
    //  }else if( b < 0){
    //     System.out.println("negative");
    //  }else{
    //     System.out.println("Zero");
    //  }

    //Multiple if else condition 

    System.out.print("Enter a marks :");
    int marks = sc.nextInt();
 if(marks > 100){
    System.out.println("Grade: A");
 }
    else if(marks >= 80){
        System.out.println("Grade: B");
    }
 else if(marks >=60){
    System.out.println("Grade: C");
 }
 else if(marks >=40){
    System.out.println("Grade: D");
 }else{
    System.out.println("Fail");
 }
 sc.close();
}
}