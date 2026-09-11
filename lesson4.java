import java.util.Scanner;
public class lesson4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// Question 1
        // int a = 20;
        // int b = 10;

        // System.out.println(a + b);
        // System.out.println(a > b);
    // Question 2

        // int a = 5;

        // System.out.println(a++);
        // System.out.println(a);

        // question 3

       // int a = 10;
// reminder
        // System.out.println(a % 3);
        // question 4
        
        // int age = 18;
        // boolean hasid = true;
        // System.out.println( age >= 18 && hasid);

//   7. Find the sum of even numbers from 1 to 100

    //     int Sum = 0;
    //     for(int i=2; i<=100; i+=2){
    //         // System.out.println(i);
    //         Sum += i;
    //     }
    //         System.out.println("Sum of even numbers from 1 to 100 is: " + Sum);
    //     }
    // }
                    
                    // 7. Find the sum of odd numbers from 1 to 100
                    // int Add = 0;
                    // for(int i = 1; i<=100; i+=2){
                    //     Add += i;
                    // }
                    // System.out.println(" Sum of odd number : " + Add);

                    // 9. Print the multiplication table of a number

                    // int n =6;
                    // int i;
                    
                    // for(i=1; i<=10; i++){
                    //     int mull = n * i;
                    //       System.out.println(n + " * "+ i + " = "  + mull);
                    // }

                    //10. Calculate the factorial of a number
                //    int fact = 1;
                //    int n = 7;
                //    for(int i=1; i<=n; i++){
                //     fact *= i;
                //    }
                //     System.out.println("factorial of " + n + " is :" + fact);

                          // 11. Count the number of digits

                        //   int num = 677656;
                        //   int count = 0;
                        //   int temp = num;
                        //   for(; num >0; num = num/10){
                        //     count++;
                        //   }         
                        //   System.out.println("number of digits in " + temp +" is : "+ count); 

                        //12.find the sum of digits of a number    
                        // int  num = 164564;
                        // int sum = 0;
                        // int Add = num;

                        //    for(; num > 0; num = num/10){
                        //         sum = sum + num % 10;
                        //    }
                        //     System.out.println("Sum of digits in " + Add + " is: " + sum);

                      //  13 reverse a number

                    //     int num = 123456;
                    //     int reverse = 0;
                    //     for(; num >0; num = num/10){
                    //    int digit = num % 10;
                    //    reverse = reverse * 10 + digit;
                    //     }
                    //     System.out.println("reverse number : "+reverse);

                    // leap year range from 2000 to 2026
                
                    // int year;
                    // for(year = 2000; year <= 2026; year++){
                    // if((year % 4 ==0 && year % 100 != 0 )|| (year % 400 == 0)){
                    //        System.out.println("leap year " + year);
                    // }
                    
                    //        }

                    // for(int i = 1; i<=10; i++){
                    //     if(i==6)
                    //        // break;
                    //        continue;
                    //         System.out.println(i);
                    //     }
                        
                        // 
System.out.print("enter a Student marks :");
int[] marks = new int[5];
marks[0] = sc.nextInt();
marks[1] = sc.nextInt();
marks[2] = sc.nextInt();
marks[3] = sc.nextInt();
marks[4] = sc.nextInt();

int sum = 0;
float percentage  =0;
float totalmarks = 500;

for(int i = 0; i<marks.length; i++){
    sum = sum + marks[i];
//    if(totalmarks == sum + marks[i]){
  // }    
}
 System.out.println("Sum of total marks: " + sum);

 if(totalmarks != 0){
    percentage = ((sum/totalmarks) * 100);
    System.out.println("Percentage of marks : " + percentage);
 }
 if(percentage >= 90){
    System.out.println("Grade : A");
 }
    else if(percentage >= 80){
        System.out.println("Grade : B");
    }
    else if(percentage >= 70){
        System.out.println("Grade : C");
    }
    else if(percentage >= 60){
        System.out.println("Grade : D");
    }
    else{
        System.out.println("Grade : F");
    }

    System.out.println("exit..!");   
    } 
    }

