package Task1;

public class Dog extends Pet{
    protected Dog(){
        super("Гав гав");
        super.setPawsCount(4);
    }
    @Override public void giveVoice(){
        System.out.println(getVoice());
    }
    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
