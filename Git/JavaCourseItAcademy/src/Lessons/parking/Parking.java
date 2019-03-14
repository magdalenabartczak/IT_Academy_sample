package Lessons.parking;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Parking {
    private Vehicle[][] slots;

    public Parking(int rows, int slotsInRow) {
        this.slots = new Vehicle[rows][slotsInRow];
    }

    public Ticket parkVehicle(Vehicle vehicle) throws NoParkingSlotException {
        for (int i = 0; i < this.slots.length; i++) {
            for (int j = 0; j < this.slots[i].length; j++) {
                if (this.slots[i][j] == null) {
                    // park vehicle
                    this.slots[i][j] = vehicle;
                    return new Ticket(vehicle.getRegistrationNumber(), i, j);
                }
            }
        }

        throw new NoParkingSlotException();
    }

    public Vehicle getVehicle(Ticket ticket) {
        int row = ticket.getRow();
        int slot = ticket.getSlotInRow();

        Vehicle vehicle = this.slots[row][slot];
        this.slots[row][slot] = null;
        return vehicle; //???????????????????????????????????? cos tu namieszalam i z tym registration nr
    }

    public int getAvailableSlots() {
        int count = 0;
        for (int i = 0; i < this.slots.length; i++) {
            for (int j = 0; j < this.slots[i].length; j++) {
                if (this.slots[i][j] == null) {
                    count++;
                }
            }
        }
        return count;
    }
}
