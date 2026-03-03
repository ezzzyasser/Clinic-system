package clinic; 
import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends Person{
    String bloodType;
    String membershipType;
    String Guardian;
    static int countt=0;
    static public int reservation_num=0;
     int s = 0;
        int ss= 0;
        static int count=0;
        int countad=0;
        int countchoosedoc=0;
        int pID;
static int choosetime1;
    public Patient() {
    }

    public Patient(String bloodType, String membershipType, String Guardian, int SSN, int ID, String firstName, String lastName, int Age, String phoneNumber, String Gender, String DOB, String Address, String Nationality, String Email) {
        super(SSN, ID, firstName, lastName, Age, phoneNumber, Gender, DOB, Address, Nationality, Email);
        this.bloodType = bloodType;
        this.membershipType = membershipType;
        this.Guardian = Guardian;
    }

   public void AddPatient(){
      Scanner inp = new Scanner(System.in);
      System.out.println("*SSN: ");
      SSN=inp.nextInt();
     
      System.out.println("*ID: ");
      ID=inp.nextInt();
       System.out.println("*FirstName: ");
       firstName = inp.next();
       System.out.println("*LastName: ");
       lastName = inp.next();
        System.out.print("*Age: ");
      Age=inp.nextInt();
        System.out.println("*Phone Number: ");
      phoneNumber=inp.next();
       System.out.println("Date of birth: ");
      DOB=inp.next();
       System.out.println("Address: ");
      Address=inp.next();
       System.out.println("Gender: ");
      Gender=inp.next();
      System.out.println("Nationality: ");
      ID=inp.nextInt();
      System.out.println("*Email: ");
      Email=inp.next();
      System.out.println("*Blood Type: ");
      bloodType=inp.next();
       System.out.println("Membership Type: ");
      membershipType=inp.next();
       System.out.println("Guardian: (Optional)");
      Guardian=inp.next();
       
       countt++;
       
   }
   public void disp(){
       
       System.out.print("Patient number ");
       System.out.println(count++);
       System.out.println(" info: ");
       System.out.print("ID= ");
       System.out.println(ID);
       System.out.print("Full name: ");
       System.out.println(firstName+" "+lastName);
       System.out.print("Age: ");
       System.out.println(Age);
       System.out.print("Phone Number: ");
       System.out.println(phoneNumber);
       System.out.print("Address: ");
       System.out.println(Address);
       System.out.print("Email: ");
       System.out.println(Email);
   
     
   }

   public  void Update(){
       
       int choice = 0;
       System.out.println("choose from the options: ");
       System.out.println("1: Edit Phone number ");
       System.out.println("2: Edit Address ");
       System.out.println("3: Edit Email ");
       System.out.println("4: Edit membershipType ");
       System.out.println("5: Edit Guardian ");
       Scanner inp=new Scanner(System.in);
       choice=inp.nextInt();
       switch(choice){
           case 1:
               System.out.println("Enter the new phone number: ");
                Scanner inpp=new Scanner(System.in);
                phoneNumber=inpp.nextLine();
                System.out.println(" Your Phone number is Updated successfully");
                break;
           case 2:
               System.out.println("Enter the new address:  ");
                Scanner inpp2=new Scanner(System.in);
                Address=inpp2.nextLine();
                 System.out.println(" Your Address is Updated successfully");
                break;
           case 3:
                System.out.println("Enter the new Email:  ");
                Scanner inpp3=new Scanner(System.in);
                Email=inpp3.nextLine();
                 System.out.println(" Your Email is Updated successfully");
            break;
           case 4:
                System.out.println("Enter the new MemberShip Type:  ");
                Scanner inpp4=new Scanner(System.in);
                membershipType=inpp4.nextLine();
                 System.out.println("Thank you! Your MemberShip Type is Updated successfully");
                break;
           case 5:
                System.out.println("Enter the new Guardian:  ");
                Scanner inpp5=new Scanner(System.in);
                Guardian=inpp5.nextLine();
                 System.out.println("Thank you! Your Guardian is Updated successfully");
                break;
           default:
               System.out.println("Wrong input!!");
           
       }
   }
 
   static public void addreservation(){
       Scanner spID=new Scanner(System.in);
               System.out.println("Enter your ID:  ");
               int pID=spID.nextInt();
               
       System.out.println("Choose one of the specializations: ");
       System.out.println("1: Orthopedic");
       System.out.println("2: Opthamology");
       Scanner inpp = new Scanner(System.in);
       int choice=inpp.nextInt();
       switch(choice){
           case 1:

               System.out.println("Doctors are: ");
              for(int i =0;i<arraylists.arr3.size();i++){
         if(arraylists.arr3.get(i).getSpecialization()=="orthepedic"){
                System.out.println(i+": "+arraylists.arr3.get(i).firstName+" "+arraylists.arr3.get(i).lastName); 
         }
           }
              Scanner choosedoc=new Scanner(System.in);
              int choosedocc=choosedoc.nextInt();
              
              
              System.out.println("Choose one of the available slot");
              if(choosedocc==0){
              for(int i=0;i<arraylists.arr8.size();i++){
                  
                  if(arraylists.arr3.get(0).ID==arraylists.arr8.get(i).d1.ID){
                      if (arraylists.arr8.get(i).avalible==true) {   
                          System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);
                      }
                    
                  }
              
                 
              }
              Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
              }
               if(choosedocc==1){
              for(int i=0;i<arraylists.arr8.size();i++){
                  
                  if(arraylists.arr3.get(1).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);                  
                  }
                 Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
              }
              }
              else if(choosedocc==2){
              for(int i=0;i<arraylists.arr8.size();i++){
                  
                  if(arraylists.arr3.get(2).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);                  
                  }
                 Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
              }
              }
              else if(choosedocc==3){
              for(int i=0;i<arraylists.arr8.size();i++){
                  
                  if(arraylists.arr3.get(3).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);                  
                  }
                 Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
              }
              }
               else if(choosedocc==4){
              for(int i=0;i<arraylists.arr8.size();i++){
                  
                  if(arraylists.arr3.get(4).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);                  
                  }
                 Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
              }
              }
                else  if(choosedocc==5){
              for(int i=0;i<arraylists.arr8.size();i++){
                  
                  if(arraylists.arr3.get(5).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date); 
                   continue;
                  }
                  Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
                  
                 
              }
              }
              
                   /* Scanner choosetime=new Scanner(System.in);
                  int choosetimee=choosetime.nextInt();
                  
                    if(choosetimee==1){
                  System.out.println("You choosed time slot number 1 which is ");
                 System.out.println(arraylists.arr3.get(choosedocc).getTimeslot(0));
                 arraylists.arr3.get(choosedocc).setTimeslot(0);
                  }
                    else {
                  System.out.println("You choosed time slot number 2 which is ");
                 System.out.println(arraylists.arr3.get(choosedocc).getTimeslot(1));
                 arraylists.arr3.get(choosedocc).setTimeslot(1);
                  }*/
                    
              for(int i=0;i<arraylists.arr.size();i++){
              if(arraylists.arr.get(i).getID()==pID){
                  Patient p=new Patient();
                  p=arraylists.arr.get(i);
                  Doctor d=new Doctor();
                  d=arraylists.arr3.get(choosedocc);
                       reservation_num++;
          Scanner dd=new Scanner(System.in);
         System.out.println("Enter Your Desease");
         String pd=dd.nextLine();
         Reservation temp=new Reservation();
         temp.setPatientDisease(pd);
         int PID=p.getID();
         int DID=d.getID();
         String Dspec=d.getSpecialization();
       String Dname=d.getFirstName()+" "+d.getLastName();
       temp.setDoctor_ID(DID);
       temp.setD1(d);
       temp.setP1(p);
       temp.setDoctor_Name(Dname);
       temp.setDoctor_Name(Dname);
       temp.setReservation_num(reservation_num);
       temp.t1=arraylists.arr8.get(choosetime1-1);
       System.out.println("Your Reservation ID is: "+reservation_num);
       arraylists.r1.add(temp); 
              }
              }  
              break;
               
           case 2:
             
                   System.out.println("Doctors are: ");
              for(int j =0;j<12;j++){
         if(arraylists.arr3.get(j).getSpecialization()=="Opthamology"){
                System.out.println(j+": "+arraylists.arr3.get(j).firstName+" "+arraylists.arr3.get(j).lastName);        
         }
           }
              
             Scanner choosedoc2=new Scanner(System.in);
              int choosedocc2=choosedoc2.nextInt();
              System.out.println("Choose one of the available slot");
              if(choosedocc2==6){
              for(int i=0;i<arraylists.arr8.size();i++){
                  if(arraylists.arr3.get(6).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);    
                   
                  }
              }
                  Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
              }
               if(choosedocc2==7){
              for(int i=0;i<arraylists.arr8.size();i++){
                  if(arraylists.arr3.get(7).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);   
                   
                  }
                 
               }
              Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
               }
                if(choosedocc2==8){
              for(int i=0;i<arraylists.arr8.size();i++){
                  if(arraylists.arr3.get(8).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date); 
                   
                  }
                }
                              Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
                }
                if(choosedocc2==9){
              for(int i=0;i<arraylists.arr8.size();i++){
                  if(arraylists.arr3.get(9).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);                  
                   
                  } 
              }
              Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                  
                }
                if(choosedocc2==10){
              for(int i=0;i<arraylists.arr8.size();i++){
                  if(arraylists.arr3.get(10).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);                  
                    
                  }
                 
              }
              Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                }
                 if(choosedocc2==11){
              for(int i=0;i<arraylists.arr8.size();i++){
                  if(arraylists.arr3.get(11).ID==arraylists.arr8.get(i).d1.ID&&arraylists.arr8.get(i).isAvilable()==true){
                   System.out.println((i+1)+" : time slot number "+(i+1)+" is "+arraylists.arr8.get(i).date);                  
                    
                  }
                  
              }
              Scanner inptime=new Scanner(System.in);
                   choosetime1=inptime.nextInt();
                  arraylists.arr8.get(choosetime1-1).avalible=false;
                 }
              
                    /*Scanner choosetime2=new Scanner(System.in);
                  int choosetimee2=choosetime2.nextInt();
                    if(choosetimee2==1){
                  System.out.println("You choosed time slot number 1 which is ");
                 System.out.println(arraylists.arr3.get(choosedocc2-1).getTimeslot(0));
                 arraylists.arr3.get(choosedocc2-1).setTimeslot(0);
                  }
                    else {
                  System.out.println("You choosed time slot number 2 which is ");
                 System.out.println(arraylists.arr3.get(choosedocc2-1).getTimeslot(1));
                 arraylists.arr3.get(choosedocc2-1).setTimeslot(1);
                  */

                    
                    for(int i=0;i<arraylists.arr.size();i++){
                if(arraylists.arr.get(i).ID==pID){
                   Patient p=new Patient();
                  p=arraylists.arr.get(i);
                  Doctor d = new Doctor();
                  d=arraylists.arr3.get(choosedocc2);
                       reservation_num++;
       Scanner dd=new Scanner(System.in);
       System.out.println("Enter Your Desease");
       String pd=dd.nextLine();
       Reservation temp=new Reservation();
       temp.setPatientDisease(pd);
       int PID=p.getID();
       int DID=d.getID();
       String Dspec=d.getSpecialization();
       String Dname=d.getFirstName()+" "+d.getLastName();
       temp.setDoctor_ID(DID);
       temp.setD1(d);
       temp.setP1(p);
       temp.setDoctor_Name(Dname);
       temp.setDoctor_Name(Dname);
       temp.setReservation_num(reservation_num);
       temp.t1=arraylists.arr8.get(choosetime1-1);
       System.out.println("Your Reservation ID is: "+reservation_num);
       arraylists.r1.add(temp); 
              }
              }
   
               break;    
       }
         
   }
  
   public static void cancelReservation(){
       Scanner scanid=new Scanner(System.in);
                    System.out.println("Enter your id:  ");
                    int rid2=scanid.nextInt();
                    System.out.println("Enter your reservation id: ");
                    int rid=scanid.nextInt();
                    for(int i=0;i<arraylists.arr.size();i++){
                    if(arraylists.arr.get(i).getID()==rid2){
                       for (int ii=0;ii<arraylists.r1.size();ii++) {
        if(arraylists.r1.get(ii).reservation_num==rid){
            for(int j=0;j<arraylists.arr8.size();j++){
            if(arraylists.arr8.get(j).d1.ID==arraylists.r1.get(ii).Doctor_ID){
            arraylists.arr8.get(j).avalible=true;
            }
            }
            arraylists.r1.remove(ii);
            reservation_num--;
            
        }
        else 
             System.out.println("Sorry, Invalid Reservation ");
   }                 
                    }
                    }
   }
   
     public static void cancelReservation(int rid ){
       Scanner scanid=new Scanner(System.in);
                    System.out.println("Enter your id:  ");
                    int rid2=scanid.nextInt();
                   
                    for(int i=0;i<arraylists.arr.size();i++){
                    if(arraylists.arr.get(i).getID()==rid2){
                       for (int ii=0;ii<arraylists.r1.size();ii++) {
        if(arraylists.r1.get(ii).reservation_num==rid){
            for(int j=0;j<arraylists.arr8.size();j++){
            if(arraylists.arr8.get(j).d1.ID==arraylists.r1.get(ii).Doctor_ID){
            arraylists.arr8.get(j).avalible=true;
            }
            }
            arraylists.r1.remove(ii);
            reservation_num--;
          
        }
        else 
             System.out.println("Sorry, Invalid Reservation ");
   }                 
                    }
                    }
   }
   
    public static void BrowseReservation(){
        Scanner PatientID=new Scanner(System.in);
                    System.out.println("Enter your ID :  ");
                    int PatID=PatientID.nextInt(); 
        for (int B=0;B<arraylists.r1.size();B++) {
        if(arraylists.r1.get(B).p1.ID==PatID){
           System.out.println("Reservation ID :"+ arraylists.r1.get(B).reservation_num);
            System.out.println("Reservation Date :"+ arraylists.r1.get(B).date);
           System.out.println("Patient Disease:"+ arraylists.r1.get(B).getPatientDisease());
           System.out.println("Doctor's Name:"+ arraylists.r1.get(B).getDoctor_Name());
           System.out.println("Specialization: "+ arraylists.r1.get(B).getDoctor_Specialization());
        }
        else
            System.out.println("Invalid Reservation");
   }
   }
  
  
   public static void updateReservation(){
       System.out.println("Enter your Reservation ID: ");
       Scanner inpu = new Scanner(System.in);
       int ReservationNum=inpu.nextInt();
       int choices = 0;
        for (int s=0;s<arraylists.r1.size();s++) {
        if(arraylists.r1.get(s).reservation_num==ReservationNum){
                System.out.println("choose from the options: ");
       System.out.println("1: Update your Reservation ");
       System.out.println("2: Cancel your Reservation ");
       System.out.println("3: Book a new Reservation ");
       Scanner inp=new Scanner(System.in);
       choices=inp.nextInt();
            }
        else 
        System.out.println("Sorry! The Reservation ID that you have Entered is not Available");
        
       switch(choices){
           case 1:
               System.out.println("Enter your disease");
               Scanner inpt = new Scanner (System.in);
              String disease = inpt.nextLine();
               arraylists.r1.get(s).setPatientDisease(disease);
               
              break;
           case 2:
               cancelReservation(ReservationNum);
                System.out.println(" Thank you! Your Reservation is Cancelled Successfully. ");
               break;
           case 3:
               /*
                System.out.println("Enter your ID");
               Scanner inptt = new Scanner (System.in);
               int PatientID = inptt.nextInt();
               Doctor temp2=new Doctor();
               Patient temp1=new Patient();
               for(int i=0;i<arraylists.arr.size();i++){
               if(arraylists.arr.get(i).getID()==PatientID){
               temp1=arraylists.arr.get(i);
               }
               }
                System.out.println("Enter The Doctor ID");
               Scanner inpts = new Scanner (System.in);
               int DocID = inpts.nextInt();
                for(int i=0;i<arraylists.arr3.size();i++){
               if(arraylists.arr3.get(i).getID()==DocID){
               temp2=arraylists.arr3.get(i);
               }
               }*/
                addreservation();
                 System.out.println(" Thank you! Your Reservation is Booked Successfully. ");
               
               
           default:
               System.out.println("Invalid Reservation!");
   }
   }
}
}
