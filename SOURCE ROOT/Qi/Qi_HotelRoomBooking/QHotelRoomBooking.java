package Qi.Qi_HotelRoomBooking;

public class QHotelRoomBooking {
    // Create a private enum for room statuses (booked, open, or not applicable)
    private static enum roomStatus {
        BOOKED,
        OPEN,
        NA
    }

    // Make the year variable global so no copies need to be made
    public static roomStatus[][] room;

    /**
     * Set a given day in a month for the room to be booked
     *
     * @param   month   A number representing a month
     * @param   day     A number representing a day
     * @throws  ArrayIndexOutOfBoundsException
     */
    public static void setStatus(int month, int day, roomStatus status) throws ArrayIndexOutOfBoundsException {
        // Make a precondition where the user puts in an invalid month or day
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new ArrayIndexOutOfBoundsException("Please enter a valid month and day");
        }

        // Set the month and day to be booked using the enum
        room[month-1][day-1] = status;
    }

    /**
     * Print the room status for each day in the year
     *
     * @return Nothing.
     */
    public static void printItems() {
        // Loop through every item
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                System.out.println("Day " + (j+1) + ": " + room[i][j]); // Print the status and the day
            }
            System.out.println("End of month " + (i+1) + ". \n"); // Print an end-of-month message
        }
    }

    public static void setNA(int year) {
        setStatus(2, 31, roomStatus.NA);
        setStatus(2, 30, roomStatus.NA);
        setStatus(4, 31, roomStatus.NA);
        setStatus(6, 31, roomStatus.NA);
        setStatus(9, 31, roomStatus.NA);
        setStatus(11, 31, roomStatus.NA);
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            setStatus(2, 29, roomStatus.NA);
        }
    }

    /**
     * Print results from each createArray() function
     *
     * @param args Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        room = new roomStatus[12][31]; // Assign the global year variable to be a two-dimensional array of the year
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Set the room status to be open every day as default
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = roomStatus.OPEN;
            }
        } setNA(2025); // Set days that are not on the year calendar to "not applicable" (NA)

        printItems(); // Print every item to see the status of the room on every day
        System.out.println("\n");

        setStatus(1, 1, roomStatus.BOOKED); // Set the room to be booked on January 1

        printItems(); // Check every item again
    }
}
