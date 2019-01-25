package Transport;
/*
A bicycle extends cycle as it is a type of transport and it is also a type of cycle
*/
public class Bicycle extends Cycle {

    Bicycle(String name, double mileage, int passengerSize) {
        super(name, mileage, 1);
    }
    Bicycle(String name, double mileage, String bikeType, int passengerSize) {
        super(name,mileage, 1);
        String bikeType1 = bikeType;
    }

    @Override
    public void travelDistance() {
        super.travelDistance();
    }

    @Override
    public void calculateDistance() {
        super.calculateDistance();
    }

}
