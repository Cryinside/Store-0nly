package ss07_AbstractClass_Interface.thuchanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
//                Edible edibler = (Chicken) animal;
                System.out.println( ((Chicken) animal).howToEat());
            }
        }

    }
}
