public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message){
        super(message);
    };
    public InvalidAmountException(){
        getMessage();
    };
};
