package Transport;

/* RoadVehicle extends Transport as a road vehicle is a form of transport.*/
public abstract class RoadVehicle extends Transport {

    RoadVehicle(String name, double mileage, int passengerSize) {
        super(name, mileage, 1);
    }



}
