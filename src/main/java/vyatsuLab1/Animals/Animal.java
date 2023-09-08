package vyatsuLab1.Animals;
import vyatsuLab1.Animals.Cow;
import vyatsuLab1.Animals.Goat;
import vyatsuLab1.Animals.Hampter;
public abstract class Animal{
    public String getName(){
        return name;
    }
    private String name;
    private int maxRunDist, maxSwimDist, age;


    public Animal(String name,int age, int maxRunDist, int maxSwimDist) {
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        this.age = age;
        this.name = name;
    }
    public void run(int dist){
        if (dist<=this.maxRunDist){
            System.out.println(this.name + " справился");}
        else System.out.println((this.name + " не справился"));
        }
    public void swim(int dist){
        if (getClass().getName() == "animals.Cat"){
            System.out.println(name + " не умеет плавать, потому что является котом");
        }
        if (getClass().getName() == "animals.Hampter"){
            System.out.println(name + " не умеет плавать, потому что является хомяком");
        }
        if (dist<=this.maxSwimDist){
            System.out.println((this.name + " проплыл" ));}
        else System.out.println((this.name + " не доплыл"));
    }
}
