
package clinic;

public class Reservation {
    Person p1=new Patient();
    Person d1=new Doctor();
     private String patientDisease;
    private String Doctor_Name;
     int Doctor_ID;
    public int reservation_num;
    private String Doctor_Specialization;
     public String Patient_ID;
     public String date;
     public Timeslot t1;
     
        
   

    public Reservation(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public Reservation() {
    }
    

    public Person getP1() {
        return p1;
    }

  
    public String getPatientDisease() {
        return patientDisease;
    }

    public Person getD1() {
        return d1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }


    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public void setD1(Person d1) {
        this.d1 = d1;
    }

 

    public void setDoctor_Name(String Doctor_Name) {
        this.Doctor_Name = Doctor_Name;
    }

    public void setDoctor_ID(int Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }

    public void setDoctor_Specialization(String Doctor_Specialization) {
        this.Doctor_Specialization = Doctor_Specialization;
    }

    public String getDoctor_Name() {
        return Doctor_Name;
    }

    public int getDoctor_ID() {
        return Doctor_ID;
    }

    public String getDoctor_Specialization() {
        return d1.getSpecialization();
    }

    public int getPatient_ID() {
        return p1.ID;
    }

    public void setReservation_num(int reservation_num) {
        this.reservation_num = reservation_num;
    }
 
}
