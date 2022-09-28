package Core.Application.Dto;

import java.net.PortUnreachableException;

public class ProductViewDto {
    public int id;
    public String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
