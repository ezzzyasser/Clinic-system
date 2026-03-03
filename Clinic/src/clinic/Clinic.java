package clinic; 
import static clinic.arraylists.arr3;
import java.util.ArrayList;
import java.util.Scanner;
public class Clinic {
    static public void  main1() {
        arraylists.nrr.add(new Nurse("ROOM 1","11","120",15006,6,"rawan","khaled",46,"1234567834","female","19/8/1980","nasr city","egyption","rawan@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 2","12","130.0",15896,1,"ali","kdwany",42,"1234556699","male","20/11/1980","nasr city","egyption","ali@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 3","13","140",16586,2,"ahmed","ali",35,"12375365256","male","20/11/1987","obour","egyptian","boyka@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 4","14","150",19478,3,"magdy","magdy",30,"12023146599","male","20/11/1992","madinty","egyptian","magdy@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 5","15","160",18123,4,"ahmed","magdy",33,"123457536","male","20/11/1989","rehab","egyptian","ahmed@gmail.com"));
        arraylists.userpatient.add(new user_patient(arraylists.arr.get(0),"Sarah","123"));
          arraylists.userpatient.add(new user_patient(arraylists.arr.get(1),"Taleen","1234"));
 arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(0),"rawankhaled","675vjmv"));
 arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(1),"saragamal","fngj8"));
arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(2),"alimostafa","jkdsn7y"));
arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(3),"ezzhesham","ehy734"));
arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(4),"aliahmed","asmdnj"));
        arraylists.arr3.add(new Doctor("orthepedic","11",120.0,10868,0,"ahmed","magdy",32,"1234567899","male","20/11/1990","obour","egyption","werty@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","12",130.0,15896,1,"ali","kdwany",42,"1234556699","male","20/11/1980","nasr city","egyption","ali@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","13",140,16586,2,"ahmed","ali",35,"12375365256","male","20/11/1987","obour","egyptian","boyka@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","14",150,19478,3,"magdy","magdy",30,"12023146599","male","20/11/1992","madinty","egyptian","magdy@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","15",160,18123,4,"ahmed","magdy",33,"123457536","male","20/11/1989","rehab","egyptian","ahmed@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","16",190,12125,5,"alaa","ziad",36,"156985647123","female","20/11/1986","rehab","egyptian","alaa@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","10",110,10658,6,"noha","magdy",36,"12345679665","female","20/11/1986","nasrcity","egyptian","noha@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","9",100,15753,7,"sara","kdwany",42,"8984556699","female","20/11/1980","madinty","egyptian","sara@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","8",170,16159,8,"rawan","ali",35,"123789526984","female","20/11/1987","obour","egyption","rawan@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","7",180,19123,9,"ali","magdy",30,"12023146599","male","20/11/1992","madinty","egyption","ali@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","6",200,18145,10,"may","magdy",33,"123457536","female","20/11/1989","rehab","egyption","may@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","5",100,12123,11,"alaa","ziad",36,"156985679868","male","20/11/1986","obour","egyption","alaa@gmail.com"));
        arraylists.arr8.add(new Timeslot("11/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("12/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("13/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("14/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("15/11/2022",arraylists.arr3.get(6)));
        
        arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(0).name="profine";
         arraylists.arr7.get(0).price=62.5;
         arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(1).name="panadol";
         arraylists.arr7.get(1).price=80;
          arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(2).name="zinc";
         arraylists.arr7.get(2).price=22.99;
          arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(3).name="vitamin c";
         arraylists.arr7.get(3).price=45.3;
         
         arraylists.arr4.add(new Admin());
         arraylists.arr4.get(0).ID=20;
         arraylists.arr4.get(0).firstName="ali";
         arraylists.arr4.get(0).lastName="mohamed";
         arraylists.arr4.get(0).setAdmin_field("Modifing");
         arraylists.arr4.add(new Admin());
         arraylists.arr4.get(1).ID=30;
         arraylists.arr4.get(1).firstName="ezz";
         arraylists.arr4.get(1).lastName="eldien";
         arraylists.arr4.get(1).setAdmin_field("Viewing");
         
         
       
         
         
         
         
         
          
        int s = 0;
        int ss= 0;
        int count=0;
        int countad=0;
        int countchoosedoc=0;
        int pID;
        do{
        System.out.println("Select user type: ");
        System.out.println("1: Admin ");
        System.out.println("2: Patient");
        System.out.println("3: Doctor");
        System.out.println("4: Nurses");
        Scanner inp1=new Scanner(System.in);
        s=inp1.nextInt(); 
        
        switch(s){
            case 1:
                Scanner inp=new Scanner(System.in);
                System.out.println("1: add new admin");
                System.out.println("2: add income to doctor");
                System.out.println("3: add a doctor in a specific specialization");
                System.out.println("4: view medical supplies orders");
                System.out.println("5: Generate a report ");
                System.out.println("6: Display Admins ");
                int adchoice;
                adchoice=inp.nextInt();
                switch(adchoice){
                    case 1: 
                       arraylists.arr4.add(new Admin()); 
                       arraylists.arr4.get(countad).Create_Admiin();
                       countad++;
                        System.out.println("Thank you! Your Account is Created successfully");
                       break;
                    case 2:
                        Admin.Add_payment();
                         System.out.println("Thank you! The income is added successfully");
                        break;
                    case 3:
                        Admin.addDoctorInSpecificSpec();
                         System.out.println("Thank you! The Doctor is added successfully");
                        break;
                    case 4:
                        Admin.view_med();
                        break;      
                    case 5:
                        Admin.GenerateReport();
                        break; 
                    case 6: 
                        Admin.Display();
                        break;
                }               
                break;
            case 2:              
                do{
                System.out.println("1: Create account");
                System.out.println("2: Update account");
                System.out.println("3: Book an appointment");
                System.out.println("4: Cancel an appointment");
                System.out.println("5: Edit an appointment");
                System.out.println("6: View Doctor Available appointments");
                System.out.println("7: Browse your Booked appointments");
                System.out.println("8: Display");
                System.out.println("9: Exit");
              
                Scanner inp4=new Scanner(System.in);
                ss=inp4.nextInt();
            switch (ss) {
                case 1:
                    arraylists.arr.add(new Patient());
                   arraylists.arr.get(count).AddPatient();
                    count++;
                      System.out.println("Thank you! Your Account is Created successfully");
                    break;
                case 2:
        System.out.println("Enter the patient ID: ");
        Scanner inp2=new Scanner(System.in);
        int m;
        m =inp2.nextInt(); 
        for(int j=0;j<arraylists.arr.size();j++){
       if(arraylists.arr.get(j).ID==m){
            arraylists.arr.get(j).Update();
        }  
       }
        int size =arraylists.arr.size()-1;
       
          if( arraylists.arr.get(size).ID!=m)
                System.out.println("INVALID ID ");
                    break;
                case 3:
                    Patient.addreservation();
                     System.out.println("Thank you! Your Reservation is Booked successfully");
                    break;
                case 4:            
                  Patient.cancelReservation();
                   System.out.println("Thank you! Your Reservation is Cancelled successfully");
                    break;
                     case 5:
                       Patient.updateReservation();
                        System.out.println("Thank you! Your Reservation is Updated successfully");
                    break;
                     case 6:
                    break;
                     case 7:
                      Patient.BrowseReservation();
                       
                    break;
                     case 8:
                         Scanner dispinp = new Scanner(System.in);
                         System.out.println("Enter the pateint ID: ");
                         int dispID;
                         dispID=dispinp.nextInt();
                         for(int i=0;i<arraylists.arr.size();i++){
                         if(dispID==arraylists.arr.get(i).ID){
                             arraylists.arr.get(i).disp();
                         }
                         }
                         
                    break;
                default:
                    break;
            }
            }while(ss!=9); 
                
                break;

            case 3:
                
                System.out.println("1- update time slot ");
                System.out.println("2- View Timeslot");
                System.out.println("3- update fees");
                System.out.println("4- order medical supplies");
                System.out.println("5- view doctor revenues report");
                Scanner inp100=new Scanner(System.in);
                int choicee=inp100.nextInt();
                switch(choicee){
                    case 1:
                        Doctor.update_timeslot();
                        break;
                    case 2:
                        Doctor.viewtimeslot();
                        break;
                    case 3:
                        Doctor.updatefees();
                        break;
                    case 4:
                        Doctor.creatorder();
                        break;
                    case 5:
                        Doctor.viewreport();
                        break;
                }
                break;
            case 4:
                
                break;
            default:
                System.out.println("Wrong input");
        }        
    }while(true);

    }
    static public void guimain(){
       
        arraylists.arr3.add(new Doctor("orthepedic","11",120.0,10868,0,"ahmed","magdy",32,"1234567899","male","20/11/1990","obour","egyption","werty@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","12",130.0,15896,1,"ali","kdwany",42,"1234556699","male","20/11/1980","nasr city","egyption","ali@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","13",140,16586,2,"ahmed","ali",35,"12375365256","male","20/11/1987","obour","egyptian","boyka@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","14",150,19478,3,"magdy","magdy",30,"12023146599","male","20/11/1992","madinty","egyptian","magdy@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","15",160,18123,4,"ahmed","magdy",33,"123457536","male","20/11/1989","rehab","egyptian","ahmed@gmail.com"));
        arraylists.arr3.add(new Doctor("orthepedic","16",190,12125,5,"alaa","ziad",36,"156985647123","female","20/11/1986","rehab","egyptian","alaa@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","10",110,10658,6,"noha","magdy",36,"12345679665","female","20/11/1986","nasrcity","egyptian","noha@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","9",100,15753,7,"sara","kdwany",42,"8984556699","female","20/11/1980","madinty","egyptian","sara@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","8",170,16159,8,"rawan","ali",35,"123789526984","female","20/11/1987","obour","egyption","rawan@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","7",180,19123,9,"ali","magdy",30,"12023146599","male","20/11/1992","madinty","egyption","ali@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","6",200,18145,10,"mai","magdy",33,"123457536","female","20/11/1989","rehab","egyption","may@gmail.com"));
        arraylists.arr3.add(new Doctor("Opthamology","5",100,12123,11,"3laa","ziad",36,"156985679868","male","20/11/1986","obour","egyption","alaa@gmail.com"));
        arraylists.arr8.add(new Timeslot("11/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("12/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("13/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("14/11/2022",arraylists.arr3.get(0)));
        arraylists.arr8.add(new Timeslot("15/11/2022",arraylists.arr3.get(6)));
        
        arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(0).name="profine";
         arraylists.arr7.get(0).price=62.5;
         arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(1).name="panadol";
         arraylists.arr7.get(1).price=80;
          arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(2).name="zinc";
         arraylists.arr7.get(2).price=22.99;
          arraylists.arr7.add(new Medical_Supplay());
        arraylists.arr7.get(3).name="vitamin c";
         arraylists.arr7.get(3).price=45.3;
         arraylists.nrr.add(new Nurse("ROOM 1","11","120",15006,6,"rawan","khaled",46,"1234567834","female","19/8/1980","nasr city","egyption","rawan@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 2","12","130.0",15896,1,"ali","kdwany",42,"1234556699","male","20/11/1980","nasr city","egyption","ali@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 3","13","140",16586,2,"ahmed","ali",35,"12375365256","male","20/11/1987","obour","egyptian","boyka@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 4","14","150",19478,3,"magdy","magdy",30,"12023146599","male","20/11/1992","madinty","egyptian","magdy@gmail.com"));
        arraylists.nrr.add(new Nurse("ROOM 5","15","160",18123,4,"ahmed","magdy",33,"123457536","male","20/11/1989","rehab","egyptian","ahmed@gmail.com"));
        
 arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(0),"rawankhaled","675vjmv"));
 arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(1),"saragamal","fngj8"));
arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(2),"alimostafa","jkdsn7y"));
arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(3),"ezzhesham","ehy734"));
arraylists.usernurse.add(new user_nurse(arraylists.nrr.get(4),"aliahmed","asmdnj"));
         
     
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(0),"ahmedmagdy1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(1),"alikdwany1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(2),"ahmedali1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(3),"magdymagdy1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(4),"ahmedmagdy1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(5),"alaaziad1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(6),"nohamagdy1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(7),"sarakdwany1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(8),"rawanali1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(9),"alimagdy1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(10),"maimady1","1234"));
         arraylists.userdoc.add(new user_Doc(arraylists.arr3.get(11),"3laaziad1","1234"));
         
         arraylists.arr4.add(new Admin());
         arraylists.arr4.get(0).ID=20;
         arraylists.arr4.get(0).firstName="ali";
         arraylists.arr4.get(0).lastName="mohamed";
         arraylists.arr4.get(0).setAdmin_field("Modifing");
         arraylists.arr4.get(0).Gender="Male";
         arraylists.arr4.add(new Admin());
         arraylists.arr4.get(1).ID=30;
         arraylists.arr4.get(1).firstName="mariam";
         arraylists.arr4.get(1).lastName="ahmed";
         arraylists.arr4.get(1).setAdmin_field("Viewing");
         arraylists.arr4.get(1).Gender="Female";
         
         arraylists.useradmin.add(new user_admin(arraylists.arr4.get(0),"alimohamed1","12345"));
         arraylists.useradmin.add(new user_admin(arraylists.arr4.get(1),"mariamahmed1","12345"));
         
         arraylists.r1.add(new  Reservation());
         arraylists.r1.get(0).d1=arraylists.arr3.get(0);
        
            
           Login_Page ali=new Login_Page();
           ali.setVisible(true);
         
           
    }
    public static void main(String[] args) {
        guimain();
}
}