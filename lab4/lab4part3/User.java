
public class User {
    //declaring instance variables
    private String username;    //username of the user
    private String userType;    //type of privilages user has (admin or user)
    private String name;    //name of the user

    //Constructor taking the properties of a user as a parameter
    public User(String username, String userType, String name) {

        //sets the username of a user to the instance variable
        this.username = username;

        //sets the userType of a user to the instance variable
        this.userType = userType;

        //sets the name of a user to the instance variable
        this.name = name;
    }

    /*Overloaded constructor for a user with null properties
      -  redundant: Debugging purposes
    */
    public User() {}

    //Overloaded Constructor to only take the username and usertype
    public User(String un, String ut) {
        username = un;
        userType = ut;
        name = "";
    }

    //Overloaded constructor to only take a username
    public User(String username) {
        this.username = username;
    }

    //method to get the username belonging to a specific user
    public String getUsername() {
        return username;
    }

    //method to get the userType belonging to a specific user
    public String getUserType() {
        return userType;
    }

    //method to get the name belonging to a specific user
    public String getName() {
        return name;
    }

    //method to set a username for a specific user
    public void setUserType(String userType) {    //new usertype as a string parameter
        this.userType = userType;    //update the userType
    }
}
