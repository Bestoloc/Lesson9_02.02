package Task1;

public class Spider extends Pet{
    protected Spider(){
        super("*ШшШшш*");
        super.setPawsCount(8);
    }
    @Override public void giveVoice(){
        System.out.println(getVoice());
    }
}
