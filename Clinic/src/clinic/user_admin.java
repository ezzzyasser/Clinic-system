
package clinic;


public class user_admin extends user {
    Admin a1;
    public user_admin(){
    }
    
    public user_admin(Admin a1, String username, String Password) {
        super(username, Password);
        this.a1 = a1;
    }

    public user_admin(Admin a1) {
        this.a1 = a1;
    }

    public Admin getA1() {
        return a1;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }

    public void setA1(Admin a1) {
        this.a1 = a1;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }   
}