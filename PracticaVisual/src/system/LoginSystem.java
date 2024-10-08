/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

/**
 *
 * @author Isaac
 */
public class LoginSystem {
    public String User= "admin" , password="admin";

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean verifyLogin(String User, String password){
  
    return(User.equals(this.getUser())&&password.equals(this.getPassword()));
    }
}
