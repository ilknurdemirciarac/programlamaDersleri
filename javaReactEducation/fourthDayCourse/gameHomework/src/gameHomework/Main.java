package gameHomework;



public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Member member1=new Member();
        member1.setId(15);
        member1.setFirstName("İde");
        member1.setSurName("idem");
        member1.setDateOfBirth(1990);
        member1.setNationalityId((long) 121232211);
        Game game1=new Game();
        game1.setId(1);
        game1.setGameName("Değerler");
        game1.setPrice(19);
        Campaign campaign1=new Campaign();
        campaign1.setId(1);
        campaign1.setCampaignName("Ogrenci");
        campaign1.setDiscount(10);

        MemberManager memberManager=new MemberManager();
        GameManager gameManager=new GameManager();
        CampaignManager campaignManager=new CampaignManager();
        SalesManager salesManager=new SalesManager();

        memberManager.add(member1);
        gameManager.add(game1);
        campaignManager.add(campaign1);
        salesManager.Sales(member1, game1);
        salesManager.SalesWithCampaign(member1,game1,campaign1);
        memberManager.update(member1);
        salesManager.Sales(member1, game1);

        
    }
    
}
