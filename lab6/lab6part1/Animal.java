/*
Animal is an abstract class, it has the common features of wolf and parrot such
as name and age and the associated methods to get them
*/
public abstract class Animal {

    private String name;    //name of the animal
    private int dateOfBirth;    //age of birth of animal (Years)

    //constructor to set the name and date of birth for an animal
    Animal(String name, int dob) {
        this.name = name;
        this.dateOfBirth = dob;
    }

    //Methods to return name and age
    String getName() {
        return name;
    }

    int getAge() {
        return dateOfBirth;
    }


}
