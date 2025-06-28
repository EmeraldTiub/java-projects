package Jin.Jin_HotelBookings;

import java.util.Scanner;

public class JHotelBooking {

    // Make the statuses for the suite.
    private enum RoomStatus {
        BOOKED,
        OPEN,
        NA
    }

    /**
     *
     * @param calendar The calendar of the hotel (what status is each room every day)
     * @param room The room which status is changed.
     * @param day The day when the room was booked.
     * @param month The month when the room was booked.
     * @param status The new status of the room.
     */
    public static RoomStatus[][][] setStatus(RoomStatus[][][] calendar, int room, int day, int month, RoomStatus status) {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid day/month.");
        }
        calendar[month - 1][day - 1][room - 1] = status;
        return calendar;
    }

    /**
     * Ask the user for the amount of rooms in Happy Holiday Hotel.
     * Then create a 12 by 31 by roomCount array to track all the
     * room statuses on each day of the year.
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
        RoomStatus[][][] rooms = new RoomStatus[12][31][roomCount];
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
