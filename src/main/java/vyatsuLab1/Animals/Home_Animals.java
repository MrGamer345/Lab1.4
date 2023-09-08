package vyatsuLab1.Animals;
public abstract class Home_Animals extends Animal{
    private String voice;
    public Home_Animals(String name, int age, int maxRunDist, int maxSwimDist, String voice) {
        super(name, age, maxRunDist, maxSwimDist);
        this.voice = voice;
    }
    public String getVoice(){
        return voice;
    }
}