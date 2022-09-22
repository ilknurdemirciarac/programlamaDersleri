package gameHomework;

public class MemberManager implements IMemberService {
    @Override
    public void add(Member member){
        System.out.println("Merhaba\n" + member.getFirstName()+" kaydınız tamamlandı. Bilgiler eklendi.");
    }
    @Override
    public void update(Member member){
        System.out.println("Oyuncu" + member.getFirstName()+" bilgileri güncellendi");
    }
    @Override
    public void delete(Member member){
        System.out.println("Oyuncu" + member.getFirstName()+" silindi");
    }

}
