package Transport;

/*
Transport is an abstract class as every vehicle can transport i.e move from
one area to another and is fairly standard across all vehicle with each vehicle
having its own implementation of how it travels
*/
public abstract class Transport {
    //Each vehicle will have a passenger size, name and how many miles it has done
    private final int passengerSize;
    private final String name;
    private final String mileage;


    Transport(String name, double mileage, int passengerSize) {
        String name1 = name;
        double mileage1 = mileage;
        this.passengerSize = passengerSize;
    }

    //Each vehicle will travel x distance and need to be serviced.
    public abstract void travelDistance();
    public abstract void service();
}
