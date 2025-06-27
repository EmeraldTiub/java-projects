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
        System.out.println(p.toString() + "\n");
        new QPizza(PizzaType.Cheese, PizzaSize.Small);
        System.out.println(p.toString() + "\n");
        new QPizza();
        System.out.println(p.toString() + "\n");

        // See pizza stats
        System.out.println(p.toString() + "\n");

        // Get type, size, thin crust truth value, special instructions, and area of pizza
        System.out.println("The type of the pizza is " + getType() + ".");
        System.out.println("The size of the pizza is " + getSize() + ".");
        System.out.println("The thin crust option of the pizza is " + getThinCrust() + ".");
        System.out.println("The special instructions for the pizza is " + getSpecInstruct() + ".");
        System.out.println("The area of the pizza is " + getArea(PizzaSize.Medium) + ".\n");

        System.out.println("The type was set to" + setType(PizzaType.Cheese)); // Set the type of the pizza to cheese
        System.out.println("The size was set to" + setSize(PizzaSize.Small)); // Set the size of the pizza to small
        System.out.println("The thin crust option was set to" + setThinCrust(true)); // Make thin crust true
        System.out.println("The special instructions were set to" + setSpecInstruct("add pineapple") + "\n"); // Add a special instruction to "add pineapple"

        System.out.println(p.toString()); // See the updated pizza stats

        test();
    }

    /*
     * Test the functions
     *
     * @return A string stating functions that didn't work
     */
    public static void test() {
        System.out.println("[ Testing... ] Failures will be shown below: ");
        new QPizza();

        // test the accessors
        if (type != getType()) System.out.println("getType() got " + getType() + " but the correct type was " + type + ".");
        if (size != getSize()) System.out.println("getSize() got " + getSize() + " but the correct size was " + size + ".");
        if (getThinCrust()) System.out.println("getThinCrust() got " + getThinCrust() + " but the correct result was false.");
        if (getSpecInstruct().length() > 0) System.out.println("getSpecInstruct() got " + getSpecInstruct() + "but the correct result was an empty string.");
        if (getArea(PizzaSize.Large) != 201.06193) System.out.println("getArea(PizzaSize.large) got " + getArea(PizzaSize.Large) + " but the correct result was 201.06193.");

        // test the modifiers
        setType(PizzaType.Cheese);
        if (getType() != PizzaType.Cheese) System.out.println("setType(PizzaType.Cheese) did not set the type of the pizza to cheese.");
        setSize(PizzaSize.Small);
        if (getSize() != PizzaSize.Small) System.out.println("setSize(PizzaSize.Small) did not set the size of the pizza to small.");
        setThinCrust(true);
        if (!getThinCrust()) System.out.println("setThinCrust(true) did not set the thin crust option to true.");
        setSpecInstruct("make the cheese crispy");
        if (!getSpecInstruct().equals("make the cheese crispy")) System.out.println("setSpecInstruct('make the cheese crispy') did not set the special instruction to 'make the cheese crispy'.");

        System.out.println("Testing completed.");
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
    public static PizzaType setType(PizzaType setType) {
        type = setType;
        return setType;
    }

    /*
     * Set the size of the pizza to a given size
     *
     * @return A string stating which size the pizza was changed to
     */
    public static PizzaSize setSize(PizzaSize setSize) {
        size = setSize;
        return setSize;
    }

    /*
     * Change whether the pizza will have a thin crust
     *
     * @return A string stating which option (of having thinCrust or not) the pizza was changed to
     */
    public static boolean setThinCrust(boolean setThinCrust) {
        thinCrust = setThinCrust;
        return thinCrust;
    }

    /*
     * Set the special instructions to a given instruction
     *
     * @return A string stating which special instruction it was set to
     */
    public static String setSpecInstruct(String setSpecInstruct) {
        specInstruct = setSpecInstruct;
        return specInstruct;
    }

    /*
     * Get the type of the pizza
     *
     * @return A string stating the pizza type
     */
    public static PizzaType getType() {
        return type;
    }

    /*
     * Get the size of the pizza
     *
     * @return A string stating the pizza size
     */
    public static PizzaSize getSize() {
        return size;
    }

    /*
     * Get the thin crust truth value of the pizza
     *
     * @return A string stating whether or not thin-crust was chosen for the pizza
     */
    public static boolean getThinCrust() {
        return thinCrust;
    }

    /*
     * Get the special instructions for the pizza
     *
     * @return A string stating the special instructions for the pizza
     */
    public static String getSpecInstruct() {
        return specInstruct;
    }

    /*
     * Get the area of the pizza
     *
     * @return A string stating the pizza area
     */
    public static double getArea(PizzaSize size) {
        double area;
        if       (size == PizzaSize.Small) area = Math.PI * Math.pow(4.5, 2);
        else if (size == PizzaSize.Medium) area = Math.PI * Math.pow(6, 2);
        else if (size == PizzaSize.Large)  area = Math.PI * Math.pow(8, 2);
        else                               area = Math.PI * Math.pow(9, 2);

        return area;
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
