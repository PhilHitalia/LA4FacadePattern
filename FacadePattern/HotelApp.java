public class HotelApp {
    public static void main(String[] args) {
        System.out.println("==== Hotel Management System ====");

        FrontDesk frontDesk = new FrontDesk();
        frontDesk.pickUpVehicle("NEU-2026");
        frontDesk.cleanRoom(607);
        frontDesk.requestCart(7);
    }
}