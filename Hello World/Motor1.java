import lejos.nxt.*;
import lejos.util.*;

/**
 * Write a description of class Motors here.
 *
 * @author kittyk4t
 * @version 17 May 2018
 */
public class Motor1
{
    public static void main( String[] args )
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

   
    
}
