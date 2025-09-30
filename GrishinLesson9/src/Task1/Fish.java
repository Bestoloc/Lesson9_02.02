package Task1;

public class Fish extends Pet{
    protected Fish(){
        super("Буль буль");
    }
    @Override public void giveVoice(){
        System.out.println(getVoice());
    }

}
