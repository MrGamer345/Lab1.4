package vyatsuLab1.Animals;

public class Tiger extends Animal{
    private static int count2;
    public Tiger(String name, int age, int maxRunDist, int maxSwimDist) {
        super(name, age, maxRunDist, maxSwimDist);
        count2++;
    }
    public  static  int getCount2() {
        return  count2;
    }
}
