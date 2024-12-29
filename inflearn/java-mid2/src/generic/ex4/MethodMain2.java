package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;


public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);
        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        Animal bigger1 = AnimalMethod.getBigger(cat, targetDog);
        System.out.println("bigger = " + bigger);

        System.out.println("bigger1 = " + bigger1);
    }
}
