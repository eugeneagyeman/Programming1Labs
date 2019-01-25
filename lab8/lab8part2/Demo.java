import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        for(int i = 0; i < 500; i++) {

            int random = ThreadLocalRandom.current().nextInt(1,50);
            animalArrayList.add(new Wolf(String.format("wolf%s", random),random));
            random = ThreadLocalRandom.current().nextInt(1,50);
            animalArrayList.add(new Parrot(random));
            random = ThreadLocalRandom.current().nextInt(1,50);
            animalArrayList.add(new Goat(String.format("Goat%s",random),random));
            random = ThreadLocalRandom.current().nextInt(1,50);
            i++;
        }

        for (Animal inArray: animalArrayList) {
            System.out.println(inArray.getName()+","+inArray.getAge());
        }

        /*
        An interface is similar to an abstract class in that it only has abstract methods and no properties.
        it is effectively a contract that all classes that implement it also implements all its methods.
        They are not classes and cannot be instantiated. and only implemented by classes.
        */

        Collections.sort(animalArrayList,Animal::compareTo);

        for(Animal secondArray: animalArrayList) {
            System.out.println(secondArray.getName()+","+secondArray.getAge());
        }
        System.out.println();

        Collections.sort(animalArrayList, Collections.reverseOrder());

        System.out.println("ArrayList in descending Order");
        for(Animal secondArray: animalArrayList) {
            System.out.println(secondArray.getName()+","+secondArray.getAge());
        }





    }
}
