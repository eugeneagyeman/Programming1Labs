/*
a wolf is an animal so extends the animal class inheriting its Methods
*/
public class Wolf extends Carnivore {
    //constructor that sends the name and age of a wolf to the animal class
    public Wolf(String name, int dob){
        super(name,dob);
    }

    public void makeNoise() {
        System.out.println("This wolf is making a noise");
    }
}
