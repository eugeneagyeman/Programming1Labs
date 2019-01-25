public class SmartCard {

  //declare variables
    private String owner;
    private boolean staff;

  //Constructor declaration
    public SmartCard() {
      //initialise variables
        owner = "";
        staff = false;
    }

  //Another constructor declaration based on a String parameter
    public SmartCard(String x) {
        owner = x;
        staff = false;
    }

  //Return owner of SmartCard
    public String getOwner() {
        return owner;
    }

  //Set the staff status of SmartCard owner
    public void setStaff(boolean staffinput) {
        staff = staffinput;
    }

 //returns the staff status
    public boolean isStaff() {
        return staff;
    }


}
