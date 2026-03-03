/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author Ali's Laptop
 */
public class user {
    String username;
    String Password;

    public user(String username, String Password) {
        this.username = username;
        this.Password = Password;
    }

    public user() {
        this.username = "";
        this.Password = "";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", Password=" + Password + '}';
    }
    
    
    
}
