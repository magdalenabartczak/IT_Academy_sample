package Lessons.parking;

public class Ticket {

    private final String registrationNumber;
    private int row;
    private int slotInRow;


    public Ticket(String registrationNumber, int row, int slotInRow) {
        this.registrationNumber = registrationNumber;
        this.row = row;
        this.slotInRow = slotInRow;
    }

//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }

    public int getRow() {
        return row;
    }

    public int getSlotInRow() {
        return slotInRow;
    }

           public Ticket(String registrationNumber) {
            this.registrationNumber = registrationNumber;


        }

        public String getRegistrationNumber (String registrationNumber){

        return registrationNumber;
        }


        @Override
        public String toString() {
            return " Ticket: Registration number: ";
        }
    }



