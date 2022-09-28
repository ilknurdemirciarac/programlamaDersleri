package Core.Domain.Entities;

import java.text.DecimalFormat;

import Core.Domain.Common.BaseEntity;

public class Product extends BaseEntity{
    public String name;
    public DecimalFormat value;
    public int quantity;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public DecimalFormat getValue() {
        return value;
    }
    public void setValue(DecimalFormat value) {
        this.value = value;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
}
