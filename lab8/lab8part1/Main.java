public class Main {

    public static void main(String[] args) {

        //Wolf and Parrot objects
        Wolf wolf1 = new Wolf("Eugene", 20);
        Parrot parrot1 = new Parrot("Ben", 21);

        //returns the name and age for the above animals
        wolf1.getName();
        wolf1.getAge();

        parrot1.getName();
        parrot1.getAge();

        //demonstrating the abstract makeNoise method which is unique to the Wolf and Parrot objects
        wolf1.makeNoise();
        parrot1.makeNoise();

        //Meat and plant objects which is an extension of the food object
        Meat beef = new Meat("Beef");
        Plant lettuce = new Plant("Iceberg Lettuce");

        //method for wolf and parrots to eat food and encapsulated incase they eat the wrong type of food
        try {
            wolf1.eat(beef);
            parrot1.eat(lettuce);
        } catch (Exception error) {
            System.err.println(error);
        }

        //declaring and initialising a new goat and giving it some food
        Goat goat1 = new Goat("Connor", 22);
        goat1.eat(new Meat("Pork"));

        //Demonstrating working instance of overloaded method eat()
        try {
            wolf1.eat(beef,10);

        } catch (Exception error) {
            System.out.println("error");
        }

        //demonstrating instances of overloaded constructors with no arguments
        Wolf wolf2 = new Wolf();


    }
}
