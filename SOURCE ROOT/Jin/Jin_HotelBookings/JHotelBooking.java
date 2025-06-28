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
     * Ask the user for the amount of rooms in Happy Holiday Hotel.
     * Then create a 12 by 31 by roomCount array to track all the
     * room statuses on each day of the year.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the room count of happy Holiday Hotel: ");

        // Ask the user for the amount of rooms in Happy Holiday Hotel.
        Integer roomCount = null;
        while (true) {
            if (!scanner.hasNextInt()) {
                // Handle the case where the user inputs an invalid data type.
                System.out.println("Invalid data type. Please enter an integer.");
                System.out.println("Enter the room count of happy Holiday Hotel: ");
                scanner.nextLine();
            }
            else {
                roomCount = Integer.parseInt(scanner.nextLine());
                break;
            }
        }

        RoomStatus[][][] rooms = new RoomStatus[12][31][roomCount];

    }
}
