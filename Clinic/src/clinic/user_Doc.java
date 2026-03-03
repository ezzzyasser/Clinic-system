/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author Ali's Laptop
 */
public class user_Doc extends user {
    
    Doctor d1;

    public user_Doc(Doctor d1, String username, String Password) {
        super(username, Password);
        this.d1 = d1;
    }

    public user_Doc(Doctor d1) {
        this.d1 = d1;
    }

    public user_Doc() {
    }

    public void setD1(Doctor d1) {
        this.d1 = d1;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Doctor getD1() {
        return d1;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }
    
    
}
