import java.util.Scanner;
public class Input{
    public static void main(String[] args){

        // Scanner is predefined Java class used to read input from the keyboard.

       Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your name: ");
    //     String name = sc.nextLine();
    //     System.out.println("Welcome " + name);
    //     sc.close();

    //   System.out.print("enter your age:  ");
    //   int age = sc.nextInt();
    //   System.out.println("Age = " + age);

    System.out.print("Enter you name: " );
    String name = sc.nextLine();
    
    System.out.print("Enter your city: ");
    String city = sc.nextLine();
    
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.print("Enter your grade: ");
    
    char grade = sc.next().charAt(0);
    System.out.print("Enter your salary: ");

    double salary = sc.nextDouble();

System.out.println("Name : " + name);
System.out.println("City : " + city);
System.out.println("age :" + age);
System.out.println("grade : " + grade);
System.out.println("salary : " + salary);
sc.close();
    }
}