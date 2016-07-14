
package Beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.io.Serializable;

@Named(value = "newUser")
@Dependent
public class NewUser implements Serializable {

    private String fname;
    private String lname;
    private String email;
    
    public NewUser() {
        fname = "";
        lname = "";
        email = "";
    }
    
    public NewUser(String fname, String lname, String email) {
        this.fname=fname;
        this.lname=lname;
        this.email=email;
    }
    
    public String getFname(){
        return fname;
    }
    
    public String getLname(){
        return lname;
    }
    
    public String getEmail(){
        return email;
    }
    
}
