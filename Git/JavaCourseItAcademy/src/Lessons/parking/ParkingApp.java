package Lessons.parking;

public class ParkingApp {
    public static void main(String[] args) {

        Parking parking = new Parking(10, 10);

        System.out.println(parking.getAvailableSlots());

        Vehicle mazda3 = new Vehicle("DW12234");


        try {
            Ticket ticket = parking.parkVehicle(mazda3);
            System.out.println("Ticket: " +ticket);
            Vehicle vehicle = parking.getVehicle(ticket);

        } catch (NoParkingSlotException e) {
            System.out.println("Sorry, the parking is busy...");
        }

        System.out.println(parking.getAvailableSlots());
    }
}
