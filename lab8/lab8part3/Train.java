package Transport;
/* A Train extends transport as it is a form of transport and also has to be refueled*/
public class Train extends Transport implements Refuelable{
    Train(String name, double mileage, int passengerSize) {
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
