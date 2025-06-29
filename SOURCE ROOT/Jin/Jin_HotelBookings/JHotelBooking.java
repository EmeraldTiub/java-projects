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
     * Ask the user for the amount of rooms in Happy Holiday Hotel.
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


        // Set the out-of-range days to NA and everything else to OPEN
        int[] dayCounts = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int m = 0; m < 12; m++) {
            for (int d = 0; d < 31; d++) {
                for (int r = 0; r < roomCount; r++) {
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
}
