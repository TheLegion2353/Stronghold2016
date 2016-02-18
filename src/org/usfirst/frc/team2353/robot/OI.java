package org.usfirst.frc.team2353.robot;

import org.usfirst.frc.team2353.robot.commands.RunCollectorManual;
import org.usfirst.frc.team2353.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private Joystick joystick;
	private Joystick xboxController;
	
	private Button AButton;
	private Button YButton;
	
	private JoystickButton rightBumper;
	private JoystickButton leftBumper;
	  //Xbox Button mappings
    private final static int AButtonNum = 0;
    private final static int BButtonNum = 1;
    private final static int YButtonNum = 3;
    private final static int XButtonNum = 2;
    private final static int left_BumperNum=4;
    private final static int right_BumperNum=5;
    private final static int select_ButtonNum=6;
    private final static int start_ButtonNum=7;
    private final static int left_TriggerNum=2;
    private final static int right_TriggerNum=3;
   
    //Extreme 3d Pro Mappings
    private final static int joystickXAxis=0;
    private final static int joystickYAxis=1;
    private final static int joystickZAxis=2;		
    
	
	private double leftSpeed, rightSpeed, triggerSpeed, leftTriggerSpeed, rightTriggerSpeed;

	public OI() {
		joystick = new Joystick(RobotMap.joystickPort);
		xboxController = new Joystick(RobotMap.xboxPort);
		
		AButton = new JoystickButton(joystick, AButtonNum);
		
		YButton = new JoystickButton(joystick, YButtonNum);
		
		
		
	}
	
	public double getJoystickY() {
		double y_axis = joystick.getRawAxis(joystickYAxis);
		if (y_axis>-.2 && y_axis<.2)
			y_axis = 0;
		//System.out.print(y_axis);
		return y_axis;	
		
	}
	
	public double getJoystickZ() {
		double z_axis = joystick.getRawAxis(joystickZAxis);
		if (z_axis>-.2 && z_axis < .2)
			z_axis = 0;
		//System.out.print(z_axis);
		return z_axis;	
	}	
	
	
	
	
	
	public double getTriggerValue() {
		
		leftTriggerSpeed = xboxController.getRawAxis(2);
		if(leftTriggerSpeed > -.2 && leftTriggerSpeed < .2) {
			leftTriggerSpeed = 0;
		}
	
		rightTriggerSpeed = xboxController.getRawAxis(3);
		if(rightTriggerSpeed > -.2 && rightTriggerSpeed < .2) {
			rightTriggerSpeed = 0;
		}
		
		 triggerSpeed = rightTriggerSpeed + leftTriggerSpeed;
		
		return triggerSpeed;
	}
}

