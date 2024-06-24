package collections;
class Student{
    int roll;
    String name;
    int marks;
    public Student(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    
    
}
interface int1{
    void details(Student s);

}
public class StudentWithLambda {
    //defining a and implementing a functional interface with an abstract method
    // which will take Student object and print the student details.
    public static void main(String[] args) {
        Student s1=new Student(1, "Anshuman", 10);
        System.out.println(s1);
    int1 i1=(s)-> System.out.println(s.name+" "+s.roll+" "+s.marks);
    i1.details(s1);
    }
    
}
