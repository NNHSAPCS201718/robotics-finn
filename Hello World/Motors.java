import lejos.nxt.*;
import lejos.util.*;

/**
 * Write a description of class Motors here.
 *
 * @author kittyk4t
 * @version 17 May 2018
 */
public class Motors
{
    public static void program1()
    {
        System.out.println( "Program 1" );
        Button.waitForAnyPress();

        Motor.C.forward();
        System.out.println( "FORWARD" );

        Button.waitForAnyPress();

        Motor.C.backward();

        Button.waitForAnyPress();

        Motor.C.stop();

    }

    public static void program2()
    {
        System.out.println( "Program 2" );

        Motor.C.setSpeed(2);
        Motor.C.forward();

        Delay.msDelay(2000);

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
