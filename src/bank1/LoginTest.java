package bank1;


    public class LoginTest {

        public static void main(String[] args){

            User user = new User();
            user.name="kk";
            user.password="123";

            LoginService loginService = new LoginService();

            String  first = loginService.login(user);
            String  second = loginService.login(user);
            String  third = loginService.login(user);
            String  fourth = loginService.login(user);

            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(fourth);


        }
    }

