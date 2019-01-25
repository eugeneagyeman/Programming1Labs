/*
Animal is an abstract class, it has the common features of wolf and parrot such
as name and age and the associated methods to get them
*/
public abstract class Animal {
    private String name;  //name of animal
    private int dateOfBirth; //age of animal in years

    //constructor to set the name and age of an animal
    Animal(String name, int dob) {
        this.name = name;
        this.dateOfBirth = dob;
    }

    //methods to return name and age of a specific animal
    String getName() {
        return name;
    }

    int getAge() {
        return dateOfBirth;
    }

    /*
    abstract methods of animals. These allow sub classes to use their own individualised methods
    */
    public abstract void makeNoise();

    //throws exception if the incorrect type of food is taken as an argument
    public abstract void eat(Food foodobj) throws Exception;

}
