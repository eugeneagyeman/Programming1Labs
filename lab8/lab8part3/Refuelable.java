package Transport;
/*
Refuelable is an interface as some vehicles need to be Refuelable and the
process for doing so is standard across all vehicles
*/
public interface Refuelable {

    void addFuel();

    void removeFuel();

    void getFuelLevel();

    void getFuelType();
}
