package org.usfirst.frc.team2353.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

//We need to use this to map the ports so we can have easier control over them 

public class RobotMap {
	//USB Ports
	public final static int joyStickPort = 0, xboxPort = 1; 
	
	//Motors
    public final static int rearLeftNum = 0, rearRightNum = 1;
    
    //Xbox Button mappings
    public final static int AButton = 0;
    public final static int BButton = 1;
    public final static int YButton = 3;
    public final static int XButton = 2;
    public final static int left_Bumper=4;
    public final static int right_Bumper=5;
    public final static int select_Button=6;
    public final static int start_Button=7;
    public final static int left_Trigger=2;
    public final static int right_Trigger=3;
   
    //Extreme 3d Pro Mappings
    public final static int joystickXAxis=0;
    public final static int joystickYAxis=1;
    public final static int joystickZAxis=2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
