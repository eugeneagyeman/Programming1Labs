/*
Herbivore is a type of animal so extends the Animal class however different
herbivores exists so this too is an abstract class
*/
public abstract class Herbivore extends Animal {
  //sends the name and age of a herbivore to the animal class
    Herbivore(String name, int dob) {
        super(name, dob);
    }
    //method to check to see correct type of food is taken as an argument
    public void eat(Food foodobj) throws Exception
    {
        if(foodobj instanceof Meat) {
            throw new Exception("This is a meat based food");
        } else {
            System.out.println("The animal is eating: "+foodobj.getNameOfFood());
        }

    }


}
