package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private Joystick joystick;
	private Joystick xboxController;
	
	//Xbox Button mappings
    private final static int AButtonNum = 0;
    private final static int BButtonNum = 1;
    private final static int YButtonNum = 3;
    private final static int XButtonNum = 2;
    private final static int left_Bumper = 4;
    private final static int right_Bumper = 5;
    private final static int select_Button = 6;
    private final static int start_Button = 7;
   
    //Xbox axis numbers
    private final static int leftYAxis = 1;
    private final static int leftXAxis = 0;
    private final static int rightYAxis = 3;
    private final static int rightXAxis = 2;
    
    private final static int left_Trigger = 2;
    private final static int right_Trigger = 3;
    
    //Extreme 3d Pro Mappings
    private final static int joystickXAxis=0;
    private final static int joystickYAxis=1;
    private final static int joystickZAxis=2;
	

	private JoystickButton AButton, BButton, YButton, XButton;
	
	public OI() {
		
		joystick = new Joystick(RobotMap.joyStickPort);
		xboxController = new Joystick(RobotMap.xboxPort);
		
		AButton = new JoystickButton(joystick, AButtonNum);
		BButton = new JoystickButton(joystick, BButtonNum);
		YButton = new JoystickButton(joystick, YButtonNum);
		XButton = new JoystickButton(joystick, XButtonNum);
		
	}
	
	public double getJoystickY() {
		double y_axis = joystick.getRawAxis(joystickYAxis);
		if (y_axis>-.2 && y_axis<.2)
			y_axis = 0;
		
		return y_axis;	
		
	}
	
	public double getJoystickZ() {
		double z_axis = joystick.getRawAxis(joystickZAxis);
		if (z_axis>-.2 && z_axis < .2)
			z_axis = 0;
		
		return z_axis;	
		
	}

	public double getXboxLeftYAxis() {
		double y_axis = xboxController.getRawAxis(leftYAxis);
		
		if (y_axis>-.2 && y_axis < .2)
			y_axis = 0;
		
		return y_axis;
	}
	
	public double getTriggerValue() {
		
		double leftTriggerSpeed = xboxController.getRawAxis(2);
		if(leftTriggerSpeed < .1)
			leftTriggerSpeed = 0;
	
		double rightTriggerSpeed = xboxController.getRawAxis(3);
		if(rightTriggerSpeed < .1)
			rightTriggerSpeed = 0;
		
		double triggerSpeed = rightTriggerSpeed - leftTriggerSpeed;
		
		return triggerSpeed;
	}
	
}

