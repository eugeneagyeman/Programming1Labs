public class SmartCard {

  //Declare variables
    private String owner;
    private boolean staff;

  //Constructor declaration
    public SmartCard() {
        owner = "";
        staff = false;
    }
  //Another constructor declaration should a string containing the user is sent as an argument
    public SmartCard(String x) {
        owner = x;
        staff = false;
    }

  //Returns owner's name
    public String getOwner() {
        return owner;
    }

  //method to set staff status if required
    public void setStaff(boolean staffinput) {
        staff = staffinput;
    }

    //returns whether user is a staff member of not
    public boolean isStaff() {
        return staff;
    }


}
