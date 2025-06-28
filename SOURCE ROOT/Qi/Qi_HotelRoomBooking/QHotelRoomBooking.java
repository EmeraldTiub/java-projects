package Qi.Qi_HotelRoomBooking;

public class QHotelRoomBooking {
    // Create a private enum for room statuses (booked, open, or not applicable)
    private static enum roomStatus {
        BOOKED,
        OPEN,
        NA
    }

    // Make the year variable global so no copies need to be made
    public static roomStatus[][] year;

    /*
     * Set a given day in a month for the room to be booked
     *
     * @param   month   A number representing a month
     * @param   day     A number representing a day
     */
    public static void setBooked(int month, int day) {
        // Make a precondition where the user puts in an invalid month or day
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new ArrayIndexOutOfBoundsException("Please enter a valid month and day");
        }

        // Set the month and day to be booked using the enum
        year[month-1][day-1] = roomStatus.BOOKED;
    }

    /*
     * Print each day in the year
     *
     * @return Nothing.
     */
    public static void printItems() {
        // Loop through every item
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                System.out.println("Day " + (j+1) + ": " + year[i][j]); // Print the status and the day
            }
            System.out.println("End of month " + (i+1) + ". \n"); // Print an end-of-month message
        }
    }

    /*
     * Print results from each createArray() function
     *
     * @param Command-line arguments, not used here.
     */
    public static void main(String[] args) {
        year = new roomStatus[12][31]; // Assign the global year variable to be a two-dimensional array of the year
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Set the room status to be open every day as default
        for (int i = 0; i < year.length; i++) {
            for (int j = 0; j < year[i].length; j++) {
                if (j > monthDays[i]) {
                    year[i][j] = roomStatus.NA; // If there aren't 31 days in the current month, make that day not applicable (NA)
                }
                else {
                    year[i][j] = roomStatus.OPEN;
                }
            }
        }

        printItems(); // Print every item to see the status of the room on every day
        System.out.println("\n");

        setBooked(1, 1); // Set the room to be booked on January 1

        printItems(); // Check every item again
    }
}
