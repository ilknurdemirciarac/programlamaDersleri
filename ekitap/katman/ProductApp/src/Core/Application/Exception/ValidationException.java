package Core.Application.Exception;
public class ValidationException extends Exception{
    public ValidationException():
    this("Validation error occured"){}
    public ValidationException(String message):
    base(message){

    }
    public ValidationException(Exception ex):this(ex.message) {
        
    }
    
}