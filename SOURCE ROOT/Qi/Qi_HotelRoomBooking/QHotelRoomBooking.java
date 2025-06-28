package Qi.Qi_HotelRoomBooking;

public class QHotelRoomBooking {
    // Create a private enum for room statuses (booked, open, or not applicable)
    private static enum roomStatus {
        BOOKED,
        OPEN,
        NA
    }

    /*
     * Make an array with 12 rows for the months and 31 columns for the days
     *
     * @return The empty array with dimensions: 12 by 31
     */
    public static roomStatus[][] createArray() {
        roomStatus[][] rooms = new roomStatus[12][31];
        return rooms;
    }

    /*
     * Make an array of the month with another dimension for each room in the hotel
     *
     * @return The empty array with dimensions: 12 by 31 by roomCount
     */
    public static roomStatus[][][] createArray(int roomCount) {
        roomStatus[][][] rooms = new roomStatus[12][31][roomCount];
        return rooms;
    }

    /*
     * Print results from each createArray() function
     *
     * @param Command-line arguments, not used here.
     */
    public static void main(String[] args) {
        System.out.println(createArray());
        System.out.println(createArray(20));
    }
}
