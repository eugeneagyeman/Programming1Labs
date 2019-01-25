/*
Goats are Herbivores so extends the herbivore class which also extends the animal
class since a goat is also an animal
*/
 class Goat extends Herbivore {
    //constructor to create a goat object with name and age
    Goat(String name, int dob) {
        super(name, dob);
    }

    //method to make a goat noise
     public void makeNoise() {

     }

     //method to simulate a goat eating
     public void eat(Food foodobj) {
        System.out.println("The animal is eating: " + foodobj.getNameOfFood());
    }


}
