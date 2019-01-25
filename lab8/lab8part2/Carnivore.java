/*
Carnivores is a type of animal so extends the Animal class however different
carnivores exists so this too is an abstract class
*/
abstract class Carnivore extends Animal {
    //sends the name and age of a carnivor to the animal class
    Carnivore(String name, int dob) {
        super(name, dob);
    }

    public Carnivore() {

    }

    public void eat(Food foodobj) throws Exception
    {
        //checking to see correct type of food is taken as an argument
        if(foodobj instanceof Plant)
        {
            throw new Exception("This is a plant based meal");
        } else {
            System.out.println("The animal is eating: "+foodobj.getNameOfFood());
        }
    }
}
