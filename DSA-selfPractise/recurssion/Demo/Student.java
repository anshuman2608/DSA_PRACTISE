package Demo;

class Student{
  int rollNo;
  String name;
  static int counter=1;

//   static{
//     counter = 1;
//   }

  Student(String name){
    rollNo = counter++;
    this.name = name;
  }

  public static void main(String args[]){
    Student s1 = new Student("Akshay");
    Student s2 = new Student("Chaitanya");
    Student s3 = new Student("Devendra");

    System.out.println(s1.rollNo + ": " + s1.name);
    System.out.println(s2.rollNo + ": " + s2.name);
    System.out.println(s3.rollNo + ": " + s3.name);
  }
}
