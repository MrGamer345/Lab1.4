package vyatsuLab1.Animals;

public class Dog extends Animal{
    private static int count1;

    public Dog(String name, int age,int maxRunDist, int maxSwimDist) {
        super(name, age, maxRunDist, maxSwimDist);
        count1++;
    }
    public  static  int getCount1() {
        return  count1;
    }
}
