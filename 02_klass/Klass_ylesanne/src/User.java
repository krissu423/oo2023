import java.util.Date;

public class User {
    String username;
    String password;
    String email;
    String firstname;
    String lastname;
    boolean active;
    Date createTime;
    Date deleteTime;

    public User(String username, String password, String email, String firstname, String lastname){
    this.username = username;
    this. password = password;
    this.email = email;
    this.firstname = firstname;
    this.lastname = lastname;
    this.active = true;
    this.createTime = new Date();
    this.deleteTime = null;
    }

    public String deleteUser(){
        this.active = false;
        this.deleteTime = new Date();
        return "User deleted!";
    }

    public String changePassword(String newPassword){
        this.password = newPassword;
        System.out.println("Password changed");
    }
}
