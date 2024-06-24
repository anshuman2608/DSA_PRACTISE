package collections;
import java.time.LocalDate;
import java.util.*;

public class Mobile implements Comparable<Mobile>{
    String modelName;
    double price;
    LocalDate mfg;
    public Mobile(String modelName,double price ,LocalDate mfg){
        this.modelName=modelName;
        this.price=price;
        this.mfg=mfg;
    }
    
    @Override
    public int compareTo(Mobile o) {
        // TODO Auto-generated method stub
        //Moblile o=(Moblile)m;
        
        if(this.price>o.price){
            return 1;
        }if(this.price<o.price){
            return -1;
        }
        int compareByModel=modelName.compareTo(o.modelName);
        if(compareByModel!=0){
            return compareByModel;
        }
        int compareByDate=mfg.compareTo(o.mfg);
        return compareByDate;
        
    }
    @Override
    public String toString(){
        return this.modelName+" "+this.price+" "+this.mfg;
    }
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile("Z31", 35000, LocalDate.parse("2021-01-01"));
    Mobile m2 = new Mobile("N35", 26000, LocalDate.parse("2019-01-01"));
    Mobile m3 = new Mobile("N35", 26000, LocalDate.parse("2018-01-01"));
    Mobile m4 = new Mobile("J37", 24000, LocalDate.parse("2020-01-01"));
    Mobile m5 = new Mobile("S63", 58000, LocalDate.parse("2021-10-01"));
    Mobile m6 = new Mobile("J37", 24000, LocalDate.parse("2020-01-01"));
    
    Set<Mobile> mobileQueue = new TreeSet<>();
    mobileQueue.add(m1);
    mobileQueue.add(m2);
    mobileQueue.add(m3);
    mobileQueue.add(m4);
    mobileQueue.add(m5);
    mobileQueue.add(m6);
    mobileQueue.add(m1);
    mobileQueue.add(m2);
    mobileQueue.add(m3);
    mobileQueue.add(m4);
    mobileQueue.add(m5);
    mobileQueue.add(m6);

    Iterator<Mobile> itr=mobileQueue.iterator();
    while(itr.hasNext()){
        Mobile m=itr.next();
        System.out.println(m.toString());
    }

    }

    



}


