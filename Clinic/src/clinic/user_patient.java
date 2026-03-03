/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author Ali's Laptop
 */
public class user_patient extends user{
   
    public Patient p1;

    public user_patient(Patient p1, String username, String Password) {
        super(username, Password);
        this.p1 = p1;
    }

    public user_patient(Patient p1) {
        this.p1 = p1;
    }
    public user_patient(){}

    public Patient getP1() {
        return p1;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }

    public void setP1(Patient p1) {
        this.p1 = p1;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
