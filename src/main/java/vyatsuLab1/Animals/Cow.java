package vyatsuLab1.Animals;

public class Cow extends Home_Animals {
    private static int count;

    public Cow(String name, int age, int maxRunDist, int maxSwimDist, String voice) {
        super(name, age, maxRunDist, maxSwimDist, voice);
        count++;
    }

    public  static  int getCount3() {
        return  count;
    }
}
