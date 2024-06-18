package exception;

public class InvalidCredentails extends Exception {
    private String code;


    InvalidCredentails(String code,String message){
        super(message);
        this.code=code;

    }


    @Override
    public String toString() {
        return "InvalidCredentails{" +
                "code='" + code + '\'' +
                '}';
    }
}
