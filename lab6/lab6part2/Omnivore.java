/*
ominvores is a type of animal so extends the Animal class however different
omnivores exists so this too is an abstract class
*/
abstract class Omnivore extends Animal {
    //sends the name and age of a carnivor to the animal class
    Omnivore(String name, int dob) {
        super(name, dob);
    }

    //omnivores can eat any type of food so no error checking required
    public void eat(Food foodobj) {
        System.out.println("The animal is eating: " + foodobj.getNameOfFood());
    }
}
