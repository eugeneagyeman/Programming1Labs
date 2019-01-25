package Transport;
/* A jetPlane is a form of transport that has to be refueled */
public class JetPlane extends Transport implements Refuelable{
    JetPlane(String name, double mileage, int passengerSize) {
        super(name, mileage, 1);
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


}
