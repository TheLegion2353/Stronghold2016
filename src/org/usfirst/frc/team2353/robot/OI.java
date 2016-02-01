package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private Joystick xboxController;
	
	private Button AButton;
	private Button YButton;
	
	private Button triggerButtonLeft;
	private Button triggerButtonRight;
	
	//Directions
	private double leftSpeed;
	private double rightSpeed;
	
	public OI() {
		xboxController = new Joystick(1);
		
	
	}
	
	
	public double getLeftValue() {
		leftSpeed = xboxController.getRawAxis(1); //left analog stick Y Axis
		if(leftSpeed > -.2 && leftSpeed < .2)
			leftSpeed = 0;
		
		return leftSpeed;
	}
	
	public double getRightValue() {
		rightSpeed = xboxController.getRawAxis(5); //right analog stick Y Axis
		if(rightSpeed > -.2 && rightSpeed < .2)
			rightSpeed = 0;
		
		return rightSpeed;
	}
}

