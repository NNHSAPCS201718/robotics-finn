import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
/**
 * Write a description of class Square here.
 *
 * @author kittyk4t
 * @version 22 May 2018
 */
public class Square
{
    public static void main(String args[])
    {
        DifferentialPilot pilot= new DifferentialPilot( 5.3, 10.5, Motor.C, Motor.B);

        for(int i=0; i<4; i++)
        {
            pilot.travel(20);
            pilot.rotate(90);
        }
    }
}
