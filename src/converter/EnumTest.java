package converter;
/**
 * An EnumTest is class for test enum(Length class)
 *
 */
public class EnumTest {
    public static void main(String[]args){
        Length[] lengths = Length.values();
        for (Length x : lengths){
            System.out.print(x.toString() + " = " + x.getValue());
        }
    }
}
