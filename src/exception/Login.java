package exception;

public class Login {
    public String validuserName="12345";
    public String validpassword="54321";
    public void login(String username,String password ){
        if(username.equals(validuserName)&&password.equals(validpassword)){
            System.out.println("login sucessfull");
        }
    }
}
