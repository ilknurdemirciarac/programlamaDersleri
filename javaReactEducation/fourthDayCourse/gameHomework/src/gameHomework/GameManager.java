package gameHomework;

public class GameManager implements IGameService {
    @Override
    public void add(Game game){
        System.out.println(game.getGameName()+" oyunu "+game.getPrice()+"₺ fiyatla eklendi.");
    }
    @Override
    public void update(Game game){
        System.out.println(game.getGameName()+" oyunu "+game.getPrice()+"₺ fiyatı güncellendi.");
    }
    @Override
    public void delete(Game game){
        System.out.println(game.getGameName()+" oyunu silindi");
    }
    
}
