package org.usfirst.frc.team2353.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

//We need to use this to map the ports so we can have easier control over them 

public class RobotMap {
    
	//Ports
	public final static int joystickPort = 0;
    public final static int xboxPort=1;
	
    //Motors
    public static int rearLeftNum = 0;
    public static int rearRightNum = 1;
    public static int collectorMotor=4;
  
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
