public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("The valet Picked up a vehicle with it's plate number [" + plateNumber + "].");
    }
}