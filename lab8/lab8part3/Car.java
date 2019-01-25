package Transport;
/*
Car extends RoadVehicle and implements Refuelable as a car is a type of road vehicle
and can be refueled.
*/
public class Car extends RoadVehicle implements Refuelable {

    Car(String name, double mileage, int passengerSize) {
        super(name, mileage, 1);
    }

    @Override
    public void addFuel() {

    }

    @Override
    public void removeFuel() {

    }

    @Override
    public void getFuelLevel() {

    }

    @Override
    public void getFuelType() {

    }

    @Override
    public void travelDistance() {

    }

    @Override
    public void calculateDistance() {

    }

    @Override
    public void service() {

    }
}
