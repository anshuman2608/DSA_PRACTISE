package Exception;

class InvalidRollNumberException extends RuntimeException{ //step-1
  InvalidRollNumberException(String message){//step-2
    super(message);
  }

  @Override
  public String toString(){//step-3
    return "InvalidRollNumberException: " + getMessage();
  }
}


class InvalidNameException extends RuntimeException{//step-1
  InvalidNameException(String message){//step-2
    super(message);
  }

  @Override
  public String toString(){//step-3
    return "InvalidNameException: " + getMessage();
  }
}


public class ExceptionDemoSeven{
  //say we are maintaining data of student
  private int rollNo;
  private String name;

  public void setRollNo(int rollNo) throws InvalidRollNumberException{
    if(rollNo < 0 || rollNo > 40){
      //throw InvalidRollNumberException
      InvalidRollNumberException rnExc = new InvalidRollNumberException("Roll number must be from 1 to 40");
      throw rnExc;
    }
    this.rollNo = rollNo;
  }

  public int getRollNo(){
    return rollNo;
  }

  public void setName(String name) {
    if(name == null || name.length() < 3){
      InvalidNameException nmExc = new InvalidNameException("Name is required and must be of minimum 3 characters");
      throw nmExc;
    }
    this.name = name;
  }

  public String getName(){
    return name;
  }

  @Override
  public String toString(){
    return "Student[Roll no " + rollNo + ", name = " + name + "]";
  }

  public static void main(String args[]){
    ExceptionDemoSeven st = new ExceptionDemoSeven();
    
      st.setRollNo(25);
      st.setName("");
      System.out.println(st);
    //catch(InvalidRollNumberException | InvalidNameException ex){
      System.out.println();
    //}
  }
}
