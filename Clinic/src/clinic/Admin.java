package clinic;
import java.util.ArrayList;
import java.util.Scanner;


public class Admin extends Person {
    private String admin_field;
    static private int count=0;
 
    
    public Admin(){}

  

    public Admin(String admin_field) {
        this.admin_field = admin_field;
    }

 
    
    public void setAdmin_field(String admin_field) {
        this.admin_field = admin_field;
    }

    
    public String getAdmin_field() {
        
        return admin_field;
        
    }
    
    public static void Add_payment(){
        
        Scanner inpincome=new Scanner(System.in);
        
                        
                        System.out.println("Enter Admin ID");
                        int adminID=inpincome.nextInt();
                      
                       
                        for(int i=0;i<arraylists.arr4.size();i++){
                        if(adminID==arraylists.arr4.get(i).ID){
                         System.out.println("Enter Doctor ID");
                        int docincomeid=inpincome.nextInt();
                        for(int j=0;j<12;j++){
                        if(arraylists.arr3.get(j).ID==docincomeid){
                            
                            System.out.println("Enter the Salary");
                            Scanner inpsalary=new Scanner(System.in);
                            int salary=inpsalary.nextInt();
                            arraylists.arr3.get(j).setIncome(salary);
                        }
                        else if(arraylists.arr3.get(j).ID==docincomeid)
                                System.out.println("invalid id");
                        }
                        }
                        
                        else
                                System.out.println("invalid Admin id please check your input and try again.");
                        break;
                              
                        }
                        
                        
    }
    
    public void Create_Admiin(){
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter admin ID");
        ID=inp1.nextInt();
        System.out.println("Enter admin Feild");
        admin_field=inp1.next();
        System.out.println("Enter admin First Name: ");
        firstName=inp1.next();
        System.out.println("Enter admin Last Name: ");
        lastName=inp1.next();
        
    }

    static public void view_med(){
        System.out.println("the medical supplies orders are ");
        for(int i=0;i<arraylists.oo.size();i++){
                        System.out.println(arraylists.oo.get(i).order_num+" "+arraylists.oo.get(i).m1.name);
                        System.out.println("for doctor: "+arraylists.oo.get(i).d1.firstName+" "+arraylists.oo.get(i).d1.lastName);
        }
    }
    static public void addDoctorInSpecificSpec(){
    Scanner temp=new Scanner(System.in);
                        System.out.println("Enter the specialization");
                        String spec=temp.nextLine();
                        if(spec!="orthepedic"||spec!="Opthamology"){
                            System.out.println("Wronge Input!!");
                            
                        }
                            
                        System.out.println("*SSN: ");
                        int SSN=temp.nextInt();
                        System.out.println("*ID: ");
                        int ID=temp.nextInt();
                         System.out.println("*FirstName: ");
                         String firstName = temp.next();
                            System.out.println("*LastName: ");
                       String lastName = temp.next();
                             System.out.print("*Age: ");
                         int Age=temp.nextInt();
                              System.out.println("*Phone Number: ");
                          String  phoneNumber=temp.next();
                           System.out.println("Date of birth: ");
                         String DOB=temp.next();
                          System.out.println("Address: ");
                           String Address=temp.next();
                          System.out.println("Gender: ");
                         String Gender=temp.next();
                         System.out.println("Nationality: ");
                         String Nationality=temp.next();
                          System.out.println("*Email: ");
                          String Email=temp.next();
                         System.out.println("Room Number: ");
                        String room_num=temp.next();
                         System.out.println("Fees: ");
                        double fees=temp.nextDouble();
     arraylists.arr3.add(new Doctor(spec,  room_num, fees, SSN,  ID,  firstName,  lastName,  Age,  phoneNumber,  Gender,  DOB,  Address,  Nationality,  Email));
    
    
    }
    static public void GenerateReport(){
        int count=0;
        int total_revenues=0;
        
        for(int i=0;i<arraylists.arr3.size();i++){
            count=0;
            for(int j=0;j<arraylists.r1.size();j++){
            if(arraylists.r1.get(j).Doctor_ID==arraylists.arr3.get(i).ID)
             count++;  
            }
            total_revenues+=(int) (count*arraylists.arr3.get(i).fees);
            System.out.println(arraylists.arr3.get(i).ID + " " + arraylists.arr3.get(i).firstName + " "+ arraylists.arr3.get(i).lastName );
            System.out.print("Number of reservations is: ");
            System.out.println(count);
            System.out.println("The Fees is: ");
            System.out.println(count*arraylists.arr3.get(i).fees);
            System.out.println("The Salary is: ");
            System.out.println(arraylists.arr3.get(i).income);
            
        }
        System.out.println("The Total Revenues: "+ total_revenues);
        
    }
    static public void Display(){
    for(int i=0;i<arraylists.arr4.size();i++){
        System.out.println("Admin number "+(i+1)+" : "+arraylists.arr4.get(i).firstName+" "+ arraylists.arr4.get(i).lastName);
        System.out.println("With admin field: "+ arraylists.arr4.get(i).admin_field);
        
    }
      
}
    
}