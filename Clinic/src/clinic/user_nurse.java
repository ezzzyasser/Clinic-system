package clinic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zezoy
 */
public class user_nurse extends user {
    Nurse n1;

    public user_nurse(Nurse n1, String username, String Password) {
        super(username, Password);
        this.n1 = n1;
    }

    public Nurse getN1() {
        return n1;
    }

    public void setN1(Nurse n1) {
        this.n1 = n1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
