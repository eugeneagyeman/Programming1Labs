public class CardLock {

  //Declare variables
    private SmartCard lastSC;
    private boolean unlocked;
    private boolean studentAccess;

  //Constructor declaration
    public CardLock()
    {
      //Initialise variables
        lastSC = null;
        unlocked = false;
        studentAccess = false;
    }

  //Method to swipe card
    public void swipeCard(SmartCard swipe)
    {
        lastSC = swipe; //Last Smartcard to be swiped is the swipe card taken as an argument

        //should the last smartcard belong to a staff member, unlock access
        if(lastSC.isStaff()) {
            unlocked = true;
        }
    }

  //returns the last smartcard swiped
    public SmartCard getLastCardSeen() {
        return lastSC;
    }

  //returns whether access is unlocked or not based on certain conditions
    public boolean isUnlocked()
    {
      //Should the smartcard belong to a staff member or student access is allowed
        if(lastSC.isStaff() || studentAccess == true)
        {
            return true; //access is granted
        } else return false; //access is denied
    }

    //method to set student access
    public void toggleStudentAccess() {
        studentAccess = !studentAccess; //Logical operator to invert whatever the current status is
    }

}
