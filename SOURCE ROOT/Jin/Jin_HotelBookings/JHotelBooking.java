package Jin.Jin_HotelBookings;

import java.util.Scanner;

public class JHotelBooking {

    public static RoomStatus[][][] rooms;

    // Make the statuses for the suite.
    private enum RoomStatus {
        BOOKED,
        OPEN,
        NA
    }

    /**
     * Changes the status of a room at a certain day.
     * @param roomNumber The number of the room which status is changed.
     * @param day The day when the room was booked.
     * @param month The month when the room was booked.
     * @param status The new status of the room.
     */
    public static void setStatus(int roomNumber, int day, int month, RoomStatus status) {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid day/month.");
        }
        rooms[month - 1][day - 1][roomNumber - 1] = status;
    }

    /**
     * Sets the room statuses for the entire year based on the given year.
     * Sets days outside the range for each month to RoomStatus.NA
     * and the rest to RoomStatus.OPEN.
     *
     * @param year
     */
    public static void setNA(int year) {
        // Set the count of days in each month (handles the case with leap years)
        int[] dayCounts = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0) {
            dayCounts[1] += 1;
        }

        // Set the statuses.
        for (int m = 0; m < 12; m++) {
            for (int d = 0; d < 31; d++) {
                for (int r = 0; r < rooms[m][d].length; r++) {
                    if (d + 1 > dayCounts[m]) {
                        rooms[m][d][r] = RoomStatus.NA;
                    }
                    else {
                        rooms[m][d][r] = RoomStatus.OPEN;
                    }
                }
            }
        }
    }

    public static RoomStatus getStatus(int roomNumber, int day, int month) {
        return rooms[month - 1][day - 1][roomNumber - 1];
    }
    /**
     * Ask the user for the amount of rooms in Happy Holiday Hotel.
     * Then create the rooms array.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the room count of Happy Holiday Hotel: ");

        // Ask the user for the amount of rooms in Happy Holiday Hotel.
        Integer roomCount = null;
        while (true) {
            if (!scanner.hasNextInt()) {
                // Handle the case where the user inputs an invalid data type.
                System.out.println("Invalid data type. Please enter an integer.");
                System.out.println("Enter the room count of Happy Holiday Hotel: ");
                scanner.nextLine();
            }
            else {
                roomCount = Integer.parseInt(scanner.nextLine());
                break;
            }
        }

        // Test the function that sets the invalid days to NA
        rooms = new RoomStatus[12][31][roomCount];
        setNA(4);
        System.out.println(getStatus(1, 30, 2));

    }
}
