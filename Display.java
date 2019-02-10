
/**
 * This is the calculator display and its methods
 *
 * @author Joe Fen
 * @version (a version number or a date)
 */
public class Display
{
    public static void print(String s) {
        System.out.println(s);
    }
    
    public static void displayHelp() {
        String helpMsg = "Format "
        + "\ninput double, operator, and another double(if needed)"
        +"\nThe following require two doubles to be entered:"
        + "\n+ => addition"
        + "\n- => subtraction"
        + "\n* => multiplication"
        + "\n/ => division"
        + "\npow => power"
        + "\nThe following only require one double to be entered:"
        + "\nsq => square"
        + "\nsqrt => square root"
        + "\ninv => inverse"
        + "\n+/- => change sign";
        
        print(helpMsg);
    }
}
