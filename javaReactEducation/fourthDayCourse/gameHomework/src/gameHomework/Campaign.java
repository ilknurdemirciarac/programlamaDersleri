package gameHomework;
public class Campaign extends CampaignManager{
    private int id;
    private String campaignName;
    private int discount;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCampaignName() {
        return campaignName;
    }
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public void campaign(int id,String campaignName,int discount){
        setId(id);
        setCampaignName(campaignName);
        setDiscount(discount);

    }
    
}
