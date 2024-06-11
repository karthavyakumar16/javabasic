package bank1;


    public class LoginService {

        static int maxAttempts = 3;

        public String login(User userInput) {


            String bankUserName = "kk";
            String bankPassword = "123";

            if (!userInput.isLocked) {
                if (userInput.name.equals(bankUserName) && userInput.password.equals(bankPassword)) {
                    System.out.println("login successful");
                } else {
                    userInput.numOfAttempts = userInput.numOfAttempts + 1;

                    if (userInput.numOfAttempts >= maxAttempts) {
                        userInput.isLocked = true;

                    } else {
                        return "you have entered wrong credientials you have left with" + (maxAttempts - userInput.numOfAttempts);
                    }
                }
            } else {
                return "user is locked";
            }return "";
        }

    }

