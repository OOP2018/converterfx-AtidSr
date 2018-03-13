package converter;
/**
 * Length class is  a class with a fixed set of static instances
 * @author Atid Srisukhantapuek
 */
public enum Length {

    Mile(1609.344),
    Kilometer(1000.0),
    Meter(1.0),
    Centimeter(0.01),
    Foot(0.30480),
    Wa(2.0000),
    AU(149597870700L);

    /* Attributes of the enum members */
    private final double value;
    /**
     * Constructor of Length.
     * @param value's unit of Length;
     *
     */
    private Length(double value) {
        this.value = value;
    }

    /**
     * Get value of Length
     * @return value's unit
     */
    public double getValue(){
        return this.value;
    }
}
