package Core.Domain.Common;
import java.time.LocalTime;


public class BaseEntity{
    public int id;
    public LocalTime createDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalTime getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalTime createDate) {
        this.createDate = createDate;
    }
    
}