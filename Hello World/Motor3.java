import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Motor3 here.
 *
 * @author kittyk4t
 * @version 21 May 2018
 */
public class Motor3
{
    public static void main( String[] args )
    {
        System.out.println( "Program 3" );
        Button.waitForAnyPress();

        Motor.C.rotate(1440);
        System.out.println(Motor.C.getTachoCount());

        Motor.C.rotateTo(0);

        System.out.println(Motor.C.getTachoCount());

        Button.waitForAnyPress();
    }
}
