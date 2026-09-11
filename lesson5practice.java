import java.util.Scanner;
public class lesson5practice{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

                   // Largest of three number :-

//      System.out.print("Enter a :");
//       int a = sc.nextInt();
//       System.out.print("Enter b: ");
//      int b = sc.nextInt();
//       System.out.print("Enter c: ");
//     int c = sc.nextInt();
       
//        if( a >= b && a >= c)  {
//         System.out.println("largest number a : " + a );
//        }else if(b >= c && b >= a){
//        System.out.println("largest number b : " +b);
// }else{
//   System.out.println("Larger number c : " +c);
// }
    

                 // Student Marks
                //  System.out.print("enter marks : ");
                //  int marks = sc.nextInt();

                //  if(marks < 0 || marks >100 ){
                //   System.out.println("Invalid input...! marks must be between 0 to 1oo" );
                //  }else if(marks >= 90){
                //   System.out.println("Grade A :" +marks );
                //  }else if(marks >=80){
                //   System.out.println("grade B :" +marks );
                //  }else if(marks >=70){
                //   System.out.println("Grade C : " + marks);
                //  }else if(marks >= 60){
                //   System.out.println("Grade D :" + marks);
                //  }else{
                //   System.out.println(" Fail ");
                //  }

                // Switch case
                // System.out.print("First number a: ");
                // int a = sc.nextInt();
                // System.out.print("Second number b: ");
                // int b = sc.nextInt();
                // System.out.print("Choice calulater case :");
                // int calulater = sc.nextInt();

                // switch(calulater)

                // {

                // case 1 :
                //     System.out.println((a+b)+  " : Addition");
                //     break;

                //     case 2:
                //         System.out.println((a-b)+ " : Subtraction");
                //         break;

                //         case 3:
                //             System.out.println((a*b)+ " : Multiplication");
                //             break;

                //             case 4:
                //                 System.out.println((a/b)+ " : Division");
                //                 break;

                //                 case 5:
                //                     System.out.println(" Remainder : " + (a%b) );
                //                     break;
    

                //                     default:
                //                         System.out.println("Invalid");
                // } 


                 //Leap year
                 System.out.print("enter a year :");
                 int year = sc.nextInt();
                
                if(year % 400 == 0){
                    System.out.println(" Leap year : " );
                }else if(year % 4 == 0 && year % 100 != 0){
                    System.out.println("Leap  year");
                }else{
                    System.out.println("Not a leap year");
                }
                 }
}
