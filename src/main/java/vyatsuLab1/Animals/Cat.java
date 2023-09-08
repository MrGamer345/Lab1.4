package vyatsuLab1.Animals;

public class Cat extends Animal{
    private static int count;
    public Cat( String name, int age,int maxRunDist ,int maxSwimDist) {
        super(name, age, maxRunDist, maxSwimDist);
        count++;
    }
    public  static  int getCount() {
        return  count;
    }
}

