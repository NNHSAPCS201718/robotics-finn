import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Motor3 here.
 *
 * @author kittyk4t
 * @version 21 May 2018
 */
public class Motor5
{
    public static void main( String[] args )
    {
        System.out.println( "Program 5\n" );
        Button.waitForAnyPress();
        
        Motor.C.setSpeed(720);
        Motor.B.setSpeed(720);

        for(int i=0; i<9; i++)
        {
            Motor.C.rotate(720,true);
            Motor.B.rotate(720,true);
            Delay.msDelay(200);
            System.out.print(Motor.C.getTachoCount()+" "+Motor.B.getTachoCount()+"\n");
        }


        Button.waitForAnyPress();
    }
}
