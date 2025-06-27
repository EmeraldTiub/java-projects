package Jin.Jin_Pizza;

public class Pizza {
    // Set up the type of the pizza.
    private enum PizzaType {
        PEPPERONI,
        CHEESE,
        VEGGIE
    }
    static PizzaType type = PizzaType.PEPPERONI;

    // Set up the size of the pizza.
    private enum PizzaSize {
        SMALL,
        MEDIUM,
        LARGE,
        XL
    }
    static PizzaSize size = PizzaSize.LARGE;

    // Set up the crust type and special instructions.
    private static boolean thinCrust = false;
    private static String specInstruct = "";

    public Pizza() {}

    // Set the variables in the Pizza class using this()
    public Pizza(PizzaType type, PizzaSize size) {
        this(type, size, false, "");
    }

    // Can't use this() because this has the most arguments
    // (and this() uses it because it has the most arguments.)
    public Pizza(PizzaType type, PizzaSize size, boolean thinCrust, String specInstruct) {
        this.type = type;
        this.size = size;
        this.thinCrust = thinCrust;
        this.specInstruct = specInstruct;
    }

    /**
     * Change the type of the pizza.
     * @param newType   The new type of the pizza.
     */
    public static void setType(PizzaType newType) {
        type = newType;
    }

    /**
     * Change the size of the pizza.
     * @param newSize   The new size of the pizza.
     */
    public static void setSize(PizzaSize newSize) {
        size = newSize;
    }

    /**
     * Change the crust of the pizza.
     * @param hasThinCrust   The new crust of the pizza.
     */
    public static void setThinCrust(boolean hasThinCrust) {
        thinCrust = hasThinCrust;
    }

    /**
     * Change the special instructions.
     * @param instructions   The new special instructions.
     */
    public static void setSpecInstruct(String instructions) {
        specInstruct = instructions;
    }


    /**
     * Tell the user what the type of the pizza is.
     * @return the type of the pizza.
     */
    public static PizzaType getType() {
        return type;
    }

    /**
     * Tell the user what the size of the pizza is.
     * @return the size of the pizza.
     */
    public static PizzaSize getSize() {
        return size;
    }

    /**
     * Tell the user what type of crust is on the pizza.
     * @return the type of crust.
     */
    public static boolean getThinCrust() {
        return thinCrust;
    }

    /**
     * Tell the user what the area of the pizza is.
     * @return the area of the pizza.
     */
    public static Double getArea() {

        // Find out what the radius of the pizza is.
        Double radius = null;
        if (size == PizzaSize.SMALL) {
            radius = 4.5;
        }
        else if (size == PizzaSize.MEDIUM) {
            radius = 6.0;
        }
        else if (size == PizzaSize.LARGE) {
            radius = 8.0;
        }
        else {
            radius = 9.0;
        }

        // Use the pi * (radius squared) formula to find out the area.
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * Format the data into a string that the user can read.
     * @return a string.
     */
    public String toString() {
        // Turn the type into a string (for example, "cheese")
        String type = ("" + getType()).toLowerCase();

        // Turn the size into a string (for example, "large" or "XL")
        String size = ("" + getSize()).toLowerCase();
        if (size == "xl") size = "XL";

        // Format the result. Example:
        // Type: pepperoni
        // Size: medium
        // Crust: hand-tossed
        // Special instructions: none
        String res = "Type: " + type + "\n";
        res += "Size: " + size + "\n";
        res += "Crust: " + ((thinCrust) ? "thin" : "hand-tossed") + "\n";
        String crust = (!specInstruct.isEmpty()) ? specInstruct : "none";
        res += "Special instructions: " + crust;
        return res;
    }

    /**
     * Order a new pizza and change the pizza size, type, crust, and special instructions.
     * @param args
     */
    public static void main(String[] args) {
        // Order a pizza and format it into a string.
        Pizza pizza = new Pizza();
        System.out.println(pizza.toString());
        System.out.println("-------------------------------");

        // Change the size to extra-large and print out the new formatted string.
        setSize(PizzaSize.XL);
        System.out.println("Changed pizza size to Extra Large.");
        System.out.println(pizza.toString());
        System.out.println("-------------------------------");

        // Change the type to cheese and print out the new formatted string.
        setType(PizzaType.CHEESE);
        System.out.println("Changed pizza type to Cheese.");
        System.out.println(pizza.toString());
        System.out.println("-------------------------------");

        // Set the crust to thin crust and print out the new formatted string.
        setThinCrust(true);
        System.out.println("Changed crust to Thin Crust.");
        System.out.println(pizza.toString());
        System.out.println("-------------------------------");

        // Give special instructions to add mushrooms and print out the new formatted string.
        setSpecInstruct("Add mushrooms.");
        System.out.println("Added special instructions.");
        System.out.println(pizza.toString());
    }
}
