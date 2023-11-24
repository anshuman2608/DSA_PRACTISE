package collections;
import java.util.*;

class Student{
   private int roll;
   private String name;
   
   public Student(int roll, String name){
         this.roll=roll;
         this.name=name;
  }
  public Student(){
   }
   
  public int getRoll(){
    return roll;
   }
  public void setRoll(int roll){
    this.roll=roll;
   }
   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name=name;
   }
   
   
   
   
 }   
 
 class Main{
    public static void main(String[] args){
    List<Student> list=new ArrayList<>();
    Student s1=new Student(1,"Anshuman");
    Student s2=new Student(2, "Sakshi");
    list.add(s1);
    list.add(s2);
    
    Iterator<Student> itr=list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
 }
}
    
    
    
    
    
    
