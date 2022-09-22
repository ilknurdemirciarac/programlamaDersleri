package gameHomework;

public class CampaignManager implements ICampaignService{
    @Override
    
        public void add(Campaign campaign){
            System.out.println(campaign.getCampaignName()+" adlı oyun %" +campaign.getDiscount()+"ile kampanya eklendi");
        }
        @Override
        public void update(Campaign campaign){
            System.out.println(campaign.getCampaignName()+" adlı oyun %" +campaign.getDiscount()+"ile kampanya güncellendi");
        }
        @Override
        public void delete(Campaign campaign){
            System.out.println(campaign.getCampaignName()+" adlı oyun %" +campaign.getDiscount()+"ile kampanya silindi");
        }

    
    
}
