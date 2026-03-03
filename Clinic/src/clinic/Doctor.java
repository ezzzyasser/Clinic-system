package clinic;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Person {
    public String Specialization;
    String room_num;
   public static double fees;
    double income;
    public static int numm=10;

    public static int getNumm() {
        return numm;
    }
     

    public Doctor(String Specialization, String room_num, double fees, int SSN, int ID, String firstName, String lastName, int Age, String phoneNumber, String Gender, String DOB, String Address, String Nationality, String Email) {
        super(SSN, ID, firstName, lastName, Age, phoneNumber, Gender, DOB, Address, Nationality, Email);
        this.Specialization = Specialization;
        this.room_num = room_num;
        this.fees = fees;
    }

    

    Doctor() {  
    }

    @Override
    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }

    static public int getFees() {
        return (int) fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Doctor{" + "timeslot=" + arraylists.arr8 + ", Specialization=" + Specialization + ", room_num=" + room_num + ", fees=" + fees + ", income=" + income + '}';
    }

   static public void increase()
   {numm++;}
   
  public void display(){
     System.out.print("this is the time that the doctor is availabe in :  ");
     System.out.println(arraylists.arr8);
     System.out.print("this is the doctor specialization :  ");
     System.out.println(Specialization);
     System.out.print("this is the doctors room number :  ");
     System.out.println(room_num);
     System.out.print("this is the doctors id:  ");
     System.out.println(ID);
     System.out.print("the docotrs name is  :  ");
     System.out.println(firstName +" "+ lastName);
     System.out.print("the doctors age is : ");
     System.out.println(Age);
     System.out.print("this is the phone number of the doctor:  ");
     System.out.println(phoneNumber);
     System.out.print("this is the doctors gender :  ");
     System.out.println(Gender);
  }  
  
  
  static public void update_timeslot(){
      Scanner docinp=new Scanner(System.in);
      System.out.println("Enter Doctor ID");
      int docid=docinp.nextInt();
      System.out.println("Enter the old date: ");
      Scanner inp = new Scanner(System.in);
      String t=inp.next();
      for(int i=0;i<arraylists.arr8.size();i++){
      if((t == null ? arraylists.arr8.get(i).date == null : t.equals(arraylists.arr8.get(i).date)) && docid==arraylists.arr8.get(i).d1.ID){
          System.out.println("Enter the new time slot: ");
          String newdate=inp.next();
          arraylists.arr8.get(i).date=newdate;
      }   
      }
      for(int j=0;j<arraylists.arr8.size();j++){
      if(arraylists.arr8.get(j).date == null ? t != null : !arraylists.arr8.get(j).date.equals(t)&&docid!=arraylists.arr8.get(j).d1.ID){
          System.out.println("time slot is not available to be updated");
          break; 
      }
      }
  }
 
  static public void updatefees(){
      int f;
      double oldfees;
      Scanner inp=new Scanner(System.in);
      System.out.println("Enter doctor id: ");
      int idd=inp.nextInt();
      for(int i=0;i<arraylists.arr3.size();i++){
      if(arraylists.arr3.get(i).ID==idd){
         oldfees =arraylists.arr3.get(i).fees;
       System.out.println("Enter the new fees: ");
       f=inp.nextInt();
     arraylists.arr3.get(i).fees=f;
     System.out.println("the old fees is: "+oldfees);
          System.out.println("the new fees is: "+f);
      }
      }

      for(int i=0;i<arraylists.arr3.size();i++){
      if(arraylists.arr3.get(i).ID!=idd){
       System.out.println("Invalid Doctor ID: ");
       break;
      }
      }
     
  }
 
  
 static public void viewtimeslot(){
      System.out.println("Enter doctor id: ");
  Scanner inpp=new Scanner(System.in);
   int id=inpp.nextInt();
      for(int j=0;j<arraylists.arr8.size();j++){
      if(id==arraylists.arr8.get(j).d1.ID){
          System.out.println(arraylists.arr8.get(j).date);
      }
 
          
  
  }
 }
  
  
  
  static public void creatorder (){
      Scanner inp=new Scanner(System.in);
      System.out.println("Enter your ID");
      int docid=inp.nextInt();
      for(int i=0;i<arraylists.arr3.size();i++){
      if(arraylists.arr3.get(i).ID==docid){
      System.out.println("Enter the medical name ");
      String o=inp.next();
       double price;
        for(int j=0;j<arraylists.arr7.size();j++){
    if(o == null ? arraylists.arr7.get(j).name == null : o.equals(arraylists.arr7.get(j).name)){
    System.out.print("the medicines is avilable ");
    price= arraylists.arr7.get(j).price;
    System.out.print("price of medicine : ");
    System.out.println(price);
       System.out.println("Enter 1 if you want to order , 2 for cancel");
       int choice=inp.nextInt();
       if(choice==1){
           System.out.println("Enter the current Date");
        String date=inp.next();
        
       arraylists.oo.add(new Order(numm,date,arraylists.arr7.get(j),arraylists.arr3.get(i)));
    
           System.out.println("You ordered a new order with number "+numm);
           System.out.println("in Date "+ date);
           System.out.println("With medicine name "+ arraylists.arr7.get(j).name);
              increase();
       }
   }
   else{
       System.out.print("the medicines is not avilable ");
       break;
           }
   
  }
      
      }
          
      }
      
  
  }
  
  
 static public void viewreport(){
      int count=0;
        int total_revenues=0;
        int index = 0;
        System.out.println("Enter your ID");
        Scanner inp=new Scanner(System.in);
        int docid=inp.nextInt();
        
        for(int i=0;i<arraylists.arr3.size();i++){
                if(arraylists.arr3.get(i).ID==docid){
                 index=i;
                 break;
                }
                   
              
        
        }
            
            for(int j=0;j<arraylists.r1.size();j++){
            if(arraylists.r1.get(j).Doctor_ID==arraylists.arr3.get(index).ID)
             count++;  
            }
            total_revenues+=(int) (count*arraylists.arr3.get(index).fees);
            System.out.println(arraylists.arr3.get(index).ID + " " + arraylists.arr3.get(index).firstName + " "+ arraylists.arr3.get(index).lastName );
            System.out.print("Number of reservations is: ");
            System.out.println(count);
            System.out.println("The Fees is: ");
            System.out.println(count*arraylists.arr3.get(index).fees);
     
      
        System.out.println("The Doctor Total Revenues: "+ total_revenues);
        
  
  }
  }
