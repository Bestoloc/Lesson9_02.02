package Task1;

public abstract class Pet {
    public String voice;
    public int paws;

    public Pet(String voice){
        this.voice = voice;
    }

    public void sleep(){
        System.out.println("Сплю");
    }

    public void play(){
        System.out.println("Играю");
    }
    public abstract void giveVoice();
    public String getVoice(){
        return voice;
    }
    public int getPawsCount(){
        return paws;
    }
    public void setPawsCount(int paws){
        this.paws = paws;
    }

}
