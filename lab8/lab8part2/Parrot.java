/*
a parrot is an animal so extends the animal class inheriting its methods
*/
public class Parrot extends Omnivore{

    //constructor that sends the name and age of a parrot to the animal class
    Parrot(String name, int dob) {
        super(name,dob);
    }

    Parrot(int dob) {
        this("Polly",dob);
    }

    public void makeNoise() {
        System.out.println("This parrot is making a noise");
    }
}
