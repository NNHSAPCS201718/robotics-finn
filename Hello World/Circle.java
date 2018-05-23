import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
/**
 * Write a description of class Square here.
 *
 * @author kittyk4t
 * @version 23 May 2018
 */
public class Circle
{
    public static void main(String args[])
    {
        Button.waitForAnyPress();
        DifferentialPilot pilot= new DifferentialPilot( 5.3, 10, Motor.C, Motor.B);
        
        pilot.steer(20,360);
    }
}
