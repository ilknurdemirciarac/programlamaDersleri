package gameHomework;
public class Game extends GameManager {
    private int id;
    private String gameName;
    private double price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void game(int id,String gameName,double price){
        setId(id);
        setGameName(gameName);
        setPrice(price);

    }

}
