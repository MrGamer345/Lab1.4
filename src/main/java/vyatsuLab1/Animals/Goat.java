package vyatsuLab1.Animals;

public class Goat extends Home_Animals{
    private static int count;

    public Goat(String name, int age, int maxRunDist, int maxSwimDist, String voice) {
        super(name, age, maxRunDist, maxSwimDist, voice);
        count++;
    }

    public  static  int getCount4() {
        return  count;
    }
}
