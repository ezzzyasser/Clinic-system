
package clinic;



import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
public class Person {

   int SSN;
   public int ID;
   String firstName;
   String lastName;
   int Age;
   String phoneNumber;
   String Gender;
   String DOB;
   String Address;
   String Nationality;
   String Email;

    public Person(int SSN, int ID, String firstName, String lastName, int Age, String phoneNumber, String Gender, String DOB, String Address, String Nationality, String Email) {
        this.SSN = SSN;
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = Age;
        this.phoneNumber = phoneNumber;
        this.Gender = Gender;
        this.DOB = DOB;
        this.Address = Address;
        this.Nationality = Nationality;
        this.Email = Email;
    }

   
    
    public Person(){
    };

    public int getSSN() {
        return SSN;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return Age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return Address;
    }

    public String getNationality() {
        return Nationality;
    }

    public String getEmail() {
        return Email;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    

    
     public void disp(){
       System.out.println(SSN);
       System.out.println("ali");
   }
     public void AddPatient(){
     }
  
     public void Create_Admiin(){}
    

    void Create_Admin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public String getSpecialization() {
        return " ";
    }
     public String getTimeslot(int i) {
        
        return " ";
    }
     public void setTimeslot(int i) {
        
    }
       public static void addreservation(Person p,Person d){
           
   }
        public static void cancelReservation(int i){
       
        }
            public static ArrayList<Order> getOo() {
        return arraylists.oo;
    }
               static public void view_med(){
        
        
    
    }
   }
   
   



