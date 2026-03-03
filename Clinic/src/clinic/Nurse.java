package clinic;

import java.util.Scanner;

public class Nurse extends Person{
    
    String doctor_room_num;
    String doctor_name;
    String doctor_id;
    

    public Nurse() {
    }

    public Nurse( String doctor_room_num, String doctor_name, String doctor_id, int SSN, int ID, String firstName, String lastName, int Age, String phoneNumber, String Gender, String DOB, String Address, String Nationality, String Email) {
        super(SSN, ID, firstName, lastName, Age, phoneNumber, Gender, DOB, Address, Nationality, Email);
      
        this.doctor_room_num = doctor_room_num;
        this.doctor_name = doctor_name;
        this.doctor_id = doctor_id;
    }



   
   

    public String getDoctor_room_num() {
        return doctor_room_num;
    }

    public void setDoctor_room_num(String doctor_room_num) {
        this.doctor_room_num = doctor_room_num;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    @Override
    public String toString() {
        return "Nurse{" + ", doctor_room_num=" + doctor_room_num + ", doctor_name=" + doctor_name + ", doctor_id=" + doctor_id + '}';
    }

    

   
    public void display(){
    
      System.out.print("this is the nurse room number : ");
    System.out.println(doctor_room_num);
      System.out.print("this is the doctor that this nurse work with : ");
    System.out.println(doctor_name);
      System.out.print("this is the doctor id that this nurse work with : ");
    System.out.println(doctor_id);
      System.out.print("the nurse name is : ");
    System.out.println(firstName +" "+lastName);
      System.out.print("this is the nurse id : ");
    System.out.println(ID);
    }
public void update_timeslot(String t){
    int i=0;
      Scanner inp = new Scanner(System.in);
      while(i<arraylists.arr8.size()){
      if(arraylists.arr8.get(i).date == null ? t == null : arraylists.arr8.get(i).date.equals(t)){
          System.out.println("Enter the new time slot: ");
          if(arraylists.arr8.get(i).avalible==true){
              System.out.println("the time slot is avilable");
          arraylists.arr8.get(i).date=inp.next();}
          else{
          System.out.println("the time slot is not avilable");
          }   
      }
      i++;
      }
  }

 public void viewtimeslot(int id){
  Scanner inpp=new Scanner(System.in);
  for(int ii =0;ii<arraylists.arr8.size();ii++){
  if (id==ID){
  System.out.print(arraylists.arr8);
  }
  }
  }
 
 
  
    }