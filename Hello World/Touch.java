import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
/**
 * Write a description of class Square here.
 *
 * @author kittyk4t
 * @version 23 May 2018
 */

public class Touch
{
    public static void main(String args[])
    {
        Button.waitForAnyPress();
        TouchSensor sensor= new TouchSensor (SensorPort.S2);
        while(true)
        {
            if(sensor.isPressed())
            {
                Sound.beep();
                System.out.println("beep");
            }

            if(Button.ENTER.isPressed())
            {
                break;
            }
        }
    }
}
