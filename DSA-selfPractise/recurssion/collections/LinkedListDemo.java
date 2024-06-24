package collections;
import java.util.*;


class Customer {
  private String customerId;
  private String customerName;
  private double orderAmount;

  public Customer(String customerId, String customerName, double orderAmount) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.orderAmount = orderAmount;
  }

  @Override
  public String toString() {
    return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", orderAmount=" + orderAmount + "]";
  }
}

public class LinkedListDemo {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  List<Customer> list = new LinkedList<>();
  char addAnotherCustomer = 'y';
  do {
    System.out.print("Enter customer id, name and order amount ");
    String customerId = sc.next();
    String customerName = sc.next();
    double orderAmount = sc.nextDouble();
    list.add(new Customer(customerId, customerName, orderAmount));
    System.out.print("Do you want to add another customer? (y/n) ");
    addAnotherCustomer = sc.next().toLowerCase().charAt(0);
  }while(addAnotherCustomer == 'y');

  Object orr[] = list.toArray();
  for(Object o: orr)
    System.out.println(o);

  System.out.println();

  Queue<Customer> customerQueue = new LinkedList<>(list);
  Iterator<Customer> itr = customerQueue.iterator();
  while(itr.hasNext()) {
    Customer customer = itr.next();
    System.out.println(customer);
  }

  sc.close();
  }
  
}



