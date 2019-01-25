/**
 * Test harness for COMP1202 Lab 3.
 * @author systjeh
 */
public class Tester {

    //runs the test methods
    public static void main(String[] args) {
        testPart1a(); //works
        testPart1b(); //works
        testPart1c(); //works
        testPart2a();  //works
        testPart2b();  //works
        testPart2c(); //works
        testPart3();  //works
    }

  //Tests the creation of a smartcard and the getOwner method
    public static void testPart1a() {
        System.out.println("Part 1 - Accessor methods");
        System.out.println("======");

        System.out.println("--- Part 1a ---");
        System.out.println();

        System.out.println("* Creating a new SmartCard for student Anna Undergrad...");
        SmartCard card = new SmartCard("Anna Undergrad");
        System.out.println("Owner is: " + card.getOwner());
        System.out.println();
    }

//Tests the method to return staff status and the getOwner method
	public static void testPart1b() {
		System.out.println("--- Part 1b ---");
		System.out.println();

		SmartCard card = new SmartCard("Anna Undergrad");

		System.out.println("Is " + card.getOwner() + " staff? " + card.isStaff());
		System.out.println();
	}


//Tests whether a staff member is designated a staff member on their SmartCard
	public static void testPart1c() {
		System.out.println("--- Part 1c ---");
		System.out.println();

		System.out.println("* Creating a new SmartCard for staff member Dr. Bob Lecturer...");
		SmartCard card = new SmartCard("Dr. Bob Lecturer");
		card.setStaff(true);
		System.out.println("Is " + card.getOwner() + " staff? " + card.isStaff());
		System.out.println();
	}


//Tests to see whether the last smartcard seen corresponds to the last SmartCard swiped
	public static void testPart2a() {
		System.out.println("Part 2 - Object interactions");
		System.out.println("======");

		System.out.println("--- Part 2a ---");
		System.out.println();

		System.out.println("* Creating a new CardLock...");
		CardLock lock = new CardLock();
		System.out.println();

		SmartCard cardA = new SmartCard("Anna Undergrad");
		SmartCard cardB = new SmartCard("Dr. Bob Lecturer");
		cardB.setStaff(true);

		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA);
		System.out.println("Last card seen: " + lock.getLastCardSeen().getOwner() + "'s card");
		System.out.println();

		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB);
		System.out.println("Last card seen: " + lock.getLastCardSeen().getOwner() + "'s card");
		System.out.println();
	}


  //Tests the access provision based on status of owner
	public static void testPart2b() {
		System.out.println("--- Part 2b ---");
		System.out.println();

		CardLock lock = new CardLock();
		SmartCard cardA = new SmartCard("Anna Undergrad");
		SmartCard cardB = new SmartCard("Dr. Bob Lecturer");
		cardB.setStaff(true);

		System.out.println("* Swiping some cards on the lock...");
		System.out.println("(This lock should only let staff in)");
		System.out.println();

		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();

		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();
	}


//Tests whether the studentAccess method works as intended
	public static void testPart2c() {
		System.out.println("--- Part 2c ---");
		System.out.println();

		CardLock lock = new CardLock();
		SmartCard cardA = new SmartCard("Anna Undergrad");
		SmartCard cardB = new SmartCard("Dr. Bob Lecturer");
		cardB.setStaff(true);

		System.out.println("* Toggling the lock to allow both students and staff...");
		lock.toggleStudentAccess(); //inverts false to true to allow student access
		System.out.println();

		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA); //swiping student card
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked()); //returns true
		System.out.println();

		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB); //swipes staff card
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked()); //returns true
		System.out.println();

		System.out.println("* Toggling the lock to allow only staff...");
		lock.toggleStudentAccess(); //inverts true to false to deny student access
		System.out.println();

		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA); //student card
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked()); //returns false
		System.out.println();

		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB); //staff card
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked()); //returns true
		System.out.println();
	}


//Tests the Door methods and interaction with other classes
	public static void testPart3() {
		System.out.println("Part 3 - Writing tests");
		System.out.println("======");

		SmartCard cardOne = new SmartCard("Eugene Agyeman");
		SmartCard cardTwo = new SmartCard("Dr Mark Edwards");
		cardTwo.setStaff(true);
		Door narnia = new Door();

		System.out.println("Creating Student SmartCard");
		System.out.println(cardOne.getOwner());
		System.out.println();

		System.out.println("Setting the door name...");
		narnia.setRoomName("Research Labs");
		System.out.println("The room is: "+narnia.getRoomName());
		System.out.println();

		System.out.println("Creating a CardLock...");
		CardLock test = new CardLock();
		System.out.println();

  //Door can only be opened based on the unlocked status of door
		System.out.println("Attaching CardLock to the Door");
		narnia.attachLock(test);
		System.out.println();

  //Swiping the student card
		System.out.println("Swiping Eugene's SmartCard to Cardlock");
		test.swipeCard(cardOne);
		System.out.println();


		System.out.println("Trying to open the door...");
		narnia.openDoor(); //fails to open door if student access has not been granted
		System.out.println();

    //swiping the staff card
		System.out.println("Creating Staff SmartCard");
		System.out.println(cardTwo.getOwner());
		System.out.println();


		System.out.println("Attaching CardLock to the Door");
		narnia.attachLock(test);
		System.out.println();

		System.out.println("Swiping Dr Mark's SmartCard to Cardlock");
		test.swipeCard(cardTwo); //swipes staff card to unlock door
		System.out.println();


		System.out.println("Simulating the opening of the door");
		narnia.openDoor(); //returns true as staff member has opened door.
		System.out.println();

	}

}
