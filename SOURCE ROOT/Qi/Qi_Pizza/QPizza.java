package Qi.Qi_Pizza;

public class QPizza {

    private enum PizzaType { // enum for all the pizza types (private)
        Cheese,
        Pepperoni,
        Veggie
    } private enum PizzaSize { // enum for all the pizza sizes (private)
        Small,
        Medium,
        Large,
        XL
    }
    // make the private variable
    static PizzaType type = PizzaType.Pepperoni;
    static PizzaSize size = PizzaSize.Large;
    private static boolean thinCrust = false;
    private static String specInstruct = "";

    /*
     * Runs the other functions
     *
     * @param None
     * @return Results from functions called
     */
    public static void main(String[] args) {
        QPizza p = new QPizza();

        // Run the Pizza functions
        new QPizza(PizzaType.Cheese, PizzaSize.Small, true, "add pineapple");
        new QPizza(PizzaType.Cheese, PizzaSize.Small);
        new QPizza();

        // See pizza stats
        System.out.println(p.toString() + "\n");

        // Get type, size, thin crust truth value, special instructions, and area of pizza
        System.out.println(getType());
        System.out.println(getSize());
        System.out.println(getThinCrust());
        System.out.println(getSpecInstruct());
        System.out.println(getArea(PizzaSize.Medium) + "\n");

        System.out.println(setType(PizzaType.Cheese)); // Set the type of the pizza to cheese
        System.out.println(setSize(PizzaSize.Small)); // Set the size of the pizza to small
        System.out.println(setThinCrust(true)); // Make thin crust true
        System.out.println(setSpecInstruct("add pineapple") + "\n"); // Add a special instruction to "add pineapple"

        System.out.println(p.toString()); // See the updated pizza stats
    }

    /*
     * Get a pizza with specified type, size, thinCrust, and specInstruct
     *
     * @return "Pizza(type, size, thinCrust, specInstruct) was ran."
     */
    public QPizza(PizzaType type, PizzaSize size, boolean thinCrust, String specInstruct) {
        this.type = type;
        this.size = size;
        this.thinCrust = thinCrust;
        this.specInstruct = specInstruct;
    }

    /*
     * Get a pizza with specified type and size
     *
     * @return "Pizza(type, size) was ran."
     */
    public QPizza(PizzaType type, PizzaSize size) {
        this(type, size, false, "");
    }

    /*
     * Get a pizza with the default stats
     *
     * @return "Pizza() was ran."
     */
    public QPizza() {
        this(PizzaType.Pepperoni, PizzaSize.Large, false, "");
    }

    /*
     * Set the type of the pizza to a given type
     *
     * @return A string stating which type the pizza was changed to
     */
    public static String setType(PizzaType setType) {
        type = setType;
        return "type was changed to " + setType;
    }

    /*
     * Set the size of the pizza to a given size
     *
     * @return A string stating which size the pizza was changed to
     */
    public static String setSize(PizzaSize setSize) {
        size = setSize;
        return "size was changed to " + setSize;
    }

    /*
     * Change whether the pizza will have a thin crust
     *
     * @return A string stating which option (of having thinCrust or not) the pizza was changed to
     */
    public static String setThinCrust(boolean setThinCrust) {
        thinCrust = setThinCrust;
        return "thinCrust was changed to " + thinCrust;
    }

    /*
     * Set the special instructions to a given instruction
     *
     * @return A string stating which special instruction it was set to
     */
    public static String setSpecInstruct(String setSpecInstruct) {
        specInstruct = setSpecInstruct;
        return "specInstruct was changed to " + specInstruct;
    }

    /*
     * Get the type of the pizza
     *
     * @return A string stating the pizza type
     */
    public static String getType() {
        return "The type of the pizza is " + type;
    }

    /*
     * Get the size of the pizza
     *
     * @return A string stating the pizza size
     */
    public static String getSize() {
        return "The size of the pizza is " + size;
    }

    /*
     * Get the thin crust truth value of the pizza
     *
     * @return A string stating whether or not thin-crust was chosen for the pizza
     */
    public static String getThinCrust() {
        return "You chose " + thinCrust + " for the thin-crust option.";
    }

    /*
     * Get the special instructions for the pizza
     *
     * @return A string stating the special instructions for the pizza
     */
    public static String getSpecInstruct() {
        return "Your special instruction was " + specInstruct;
    }

    /*
     * Get the area of the pizza
     *
     * @return A string stating the pizza area
     */
    public static String getArea(PizzaSize size) {
        double area;
        if       (size == PizzaSize.Small) area = Math.PI * Math.pow(4.5, 2);
        else if (size == PizzaSize.Medium) area = Math.PI * Math.pow(6, 2);
        else if (size == PizzaSize.Large)  area = Math.PI * Math.pow(8, 2);
        else                               area = Math.PI * Math.pow(9, 2);

        return "The area of the pizza is " + area;
    }

    /*
     * State the class and class details in a string format
     *
     * @return The details in a string format for clarity
     */
    public String toString() {
        String representation = "";
        representation += "Type: " + type + "\n";
        representation += "Size: " + size + "\n";
        representation += "Thin Crust: " + ((thinCrust) ? "Yes" : "No") + "\n";
        representation += "Special Instructions: " + ((specInstruct.length() > 0) ? specInstruct : "No special instructions") + "\n";
        return "---------------------------\n" + "[ Pizza Details ] \n" + representation + "---------------------------";
    }
}
