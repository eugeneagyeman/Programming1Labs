
import java.util.ArrayList;
import java.util.Iterator;

class UserGroup {
    //declaring instance variables;
    ArrayList<User> users;    //ArrayList to store users of the User Object


    public UserGroup() {
        users = new ArrayList<>();    //initialise ArrayList
    }

    //method to return the ArrayList containing all the users
    public ArrayList<User> getUsers() {
        return users;
    }

    //method to return a specific user from ArrayList
    public User getUser(Integer x) {
        return users.get(x);
    }

    //method to add User to the ArrayList
    public void addUser(User newUser) {    //takes a new User as a parameter
        users.add(newUser);
    }

    /* method adding simulated users to the ArrayList.
     varying properties taken from different users
    */
    public void addSampleData() {
        users.add(new User("ea4u16", "admin", "Eugene"));
        users.add(new User("eb4t16", "user", "Daniel"));
        users.add(new User("bb4g16", "user"));
        users.add(new User("ia4h16", "user"));
        users.add(new User("jg6d15"));
        users.add(new User("te5t17"));
        users.add(new User("ca7e16"));
        users.add(new User("eb4i18", "admin", "Charles"));
        users.add(new User("bb6u14"));
        users.add(new User("bm3e16"));

    }

    //method to print Usernames for all users in the ArrayList
    public void printUsernames() {
        for (User table : users) {    //iterates through ArrayList
            System.out.print(table.getUsername());    //outputs username
            System.out.print(" ");
            System.out.println(table.getUserType());    //outputs userType
            //System.out.println(table.getName());
        }
    }
/* Part 3 Code
        //method to remove first user from the ArrayList
        public void removeFirstUser() {
            users.remove(0);
        }

        //method to remove the last user stored in the ArrayList
        public void removeLastUser() {
            users.remove(users.size());
        }

        //method to remove specific users from ArrayList
        public void removeUser(String userToRemove) {

            Iterator userIterator = users.iterator();    //iterator for ArrayList containing Users
            while (userIterator.hasNext()) {    //while users are in the ArrayList
                int index = 0;
                index++;  //increments through index values of ArrayList
                if (it.equals(userToRemove)) {   //if user is in the ArrayList
                    users.remove(index);  //remove the user from the ArrayList
                }

            }
        }

        //method to encapsulate an iterator for
        public Iterator getUserIterator() {
            return users.iterator();
        }
*/
}
