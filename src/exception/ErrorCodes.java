package exception;

public enum ErrorCodes {
    InvalidCredentails("INVALID USERNAME","INVALID PASSWORD")
    ;
    private String code;
    private String message;
    ErrorCodes(String code,String message){
        this.code=code;
        this.message=message;
    }

    @Override
    public String toString() {
        return "ErrorCodes{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
