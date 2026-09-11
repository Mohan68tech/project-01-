class StudentInfo{
    private String name ;
    private int rollno;
    private double marks;


    void StudentInfo(String name, int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;

    }

    public void displayStudentInfo(){
        System.out.println("Name : "+ name);
        System.out.println("Rollno :"+ rollno);
        System.out.println("Marks :"+ marks);

    }
}

public class Student{
    public static void main(String[] args){

        StudentInfo SI = new StudentInfo();
        // StudentInfo SI = new StudentInfo("Raj", 20, 76);
        

        SI.StudentInfo("Mohan", 01, 75);
        

        SI.displayStudentInfo();
        
    }
}