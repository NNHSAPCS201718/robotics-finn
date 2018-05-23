import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
/**
 * Write a description of class Square here.
 *
 * @author kittyk4t
 * @version 23 May 2018
 */
public class UltraSonic
{
    public static void main(String args[])
    {
        Button.waitForAnyPress();
        UltrasonicSensor sensor= new UltrasonicSensor(SensorPort.S3);

        System.out.println(sensor.getDistance());
        Button.waitForAnyPress();
    }
}
