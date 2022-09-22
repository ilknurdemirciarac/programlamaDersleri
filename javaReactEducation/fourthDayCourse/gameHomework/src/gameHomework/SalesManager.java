package gameHomework;



public class SalesManager implements ISalesService{
    
    @Override
    public void Sales(Member member, Game game) {
        System.out.println(member.getFirstName()+" oyuncusuna ait "+game.getGameName()+" oyun satıldı. ");
        
    }
    @Override
    public void SalesWithCampaign(Member member, Game game, Campaign campaign) {
        System.out.println(member.getFirstName()+" oyuncusuna ait "+campaign.getCampaignName()+" kampanyasıyla "+campaign.getDiscount()+"% indirimli "+game.getGameName()+" oyun satıldı. ");
    }
}
