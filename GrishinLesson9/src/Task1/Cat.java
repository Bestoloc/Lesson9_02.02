package Task1;

public class Cat extends Pet{
    protected Cat(){
        super("Мяу мяу");
        super.setPawsCount(4);
    }

    @Override public void giveVoice(){
        System.out.println(getVoice());
    }
    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }
}
