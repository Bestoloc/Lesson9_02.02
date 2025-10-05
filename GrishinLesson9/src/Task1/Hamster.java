package Task1;

public class Hamster extends Pet{
    protected Hamster(){
        super("Фыр фыр");
        super.setPawsCount(4);
    }
    @Override public void giveVoice(){
        System.out.println(getVoice());
    }
    public void hideFood(){
        System.out.println("Вся еда - в щёчках!");
    }
}
