import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Motor3 here.
 *
 * @author kittyk4t
 * @version 21 May 2018
 */
public class Motor4
{
    public static void main( String[] args )
    {
        System.out.println( "Program 4" );
        Button.waitForAnyPress();

        Motor.C.rotate(-1440, Button.waitForAnyPress()!=0);
        System.out.println(Motor.C.getTachoCount());

        Button.waitForAnyPress();
        Motor.C.stop();
        
        System.out.println(Motor.C.getTachoCount());
        Button.waitForAnyPress();
    }
}
