package Core.Application.Wrappers;

public class BaseResponse {
    public T Value;
    public T getValue() {
        return Value;
    }
    public void setValue(T value) {
        Value = value;
    }
    public ServiceResponse(T value){
        Value value;
    }
    
}
