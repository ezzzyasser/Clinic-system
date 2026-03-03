/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author zezoy
 */
class Timeslot {
    String date;
    boolean avalible;
   public Doctor d1;
    public Nurse n1;
    
    public Timeslot() {
        this.d1 = new Doctor();
        avalible=true;
    }

    public Timeslot(String date,Doctor d1) {
        this.d1 = d1;
        this.date = date;
        avalible=true;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isAvilable() {
        return avalible;
    }

    public void setAvilable(boolean avilable) {
        this.avalible = avalible;
    }

   
    
}