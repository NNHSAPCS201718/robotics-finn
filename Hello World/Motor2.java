import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Motor2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motor2
{
    public static void main( String[] args )
    {
        System.out.println( "Program 2" );

        Motor.C.setSpeed(720);

        Button.waitForAnyPress();
        Motor.C.forward();

        Delay.msDelay(2000);
        System.out.println(Motor.C.getTachoCount());
        Motor.C.stop();

        System.out.println(Motor.C.getTachoCount());

        while(Motor.C.getTachoCount() >0)
        {
            Motor.C.backward();

        }
        System.out.println(Motor.C.getTachoCount());
        Motor.C.stop();

        System.out.println(Motor.C.getTachoCount());

        Button.waitForAnyPress();
    }
}
