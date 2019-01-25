package Transport;

/*
A Cycle extends RoadVehicle as it is a form of a road vehicle but cannot be refueled
(unless it is a motorcycle in which that will implement refueleable)
*/
public abstract class Cycle extends RoadVehicle {

    Cycle(String name, double mileage, int passengerSize) {
        super(name, mileage, 1);
    }

    @Override
    public void service() {

    }

    @Override
    public void travelDistance() {

    }

    @Override
    public void calculateDistance() {

    }
}
