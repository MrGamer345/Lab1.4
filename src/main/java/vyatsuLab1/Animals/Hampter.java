package vyatsuLab1.Animals;

public class Hampter extends Home_Animals{
    private static int count;
    public Hampter(String name, int age, int maxRunDist, int maxSwimDist, String voice) {
        super(name, age, maxRunDist, maxSwimDist, voice);
        count++;
    }
    public  static  int getCount5() {
        return  count;
    }
}
