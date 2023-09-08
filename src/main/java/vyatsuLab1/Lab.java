package vyatsuLab1;

import vyatsuLab1.Animals.Animal;
import vyatsuLab1.Animals.Home_Animals;
import vyatsuLab1.Animals.Cat;
import vyatsuLab1.Animals.Dog;
import vyatsuLab1.Animals.Tiger;
import vyatsuLab1.Animals.Goat;
import vyatsuLab1.Animals.Cow;
import vyatsuLab1.Animals.Hampter;


public class Lab {
    public static void main(String[] args)
    {
        int dist;
        Animal[] animals =
            {
                    new Cat("Барсик", 2, 200, 0),
                    new Cat("Мурзик", 5, 200, 0),
                    new Dog("Тузик", 6, 500, 10),
                    new Tiger("Лева", 12, 900, 50),
                    new Tiger("Права", 12, 900, 50),
                    new Cow("Говрюша", 6, 500, 600, "Корова мычит"),
                    new Hampter("Хомяк", 12, 60, 0, "Хомяк пищит"),
                    new Goat("Артем", 12, 400, 48, "Козел блеет"),
                    new Goat("Рогатый", 12, 400, 37, "Козел блеет")
            };
        for (Animal a:animals)
        {
            System.out.println("Бег:");
            a.run(dist = 150);
            System.out.println("Плавание:");
            a.swim(dist = 40);
            System.out.println(" ");
        };

        System.out.println("Количество котов: " + Cat.getCount() + " ");
        System.out.println("Количество собак: " + Dog.getCount1() + " ");
        System.out.println("Количество Тигров: " + Tiger.getCount2() + " ");
        System.out.println("Количество коров: " + Cow.getCount3() + " ");
        System.out.println("Количество козлов: " + Goat.getCount4() + " ");
        System.out.println("Количество хомяков: " + Hampter.getCount5() + " ");
        System.out.print("Количество животных: ");  System.out.println(Cat.getCount()+Dog.getCount1()+Tiger.getCount2()+Cow.getCount3()+Goat.getCount4()+Hampter.getCount5());
        System.out.println(animals[5].getName() +" " + (((Home_Animals) animals[5]).getVoice()));
        System.out.println(animals[6].getName() +" " + (((Home_Animals) animals[6]).getVoice()));
        System.out.println(animals[7].getName() +" " + (((Home_Animals) animals[7]).getVoice()));
        System.out.println(animals[8].getName() +" " + (((Home_Animals) animals[8]).getVoice()));
    }
}
