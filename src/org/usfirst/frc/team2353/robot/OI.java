package org.usfirst.frc.team2353.robot;

import org.usfirst.frc.team2353.robot.commands.Collect;
import org.usfirst.frc.team2353.robot.commands.Release;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private Joystick xboxController;
	
	private Button AButton;
	private Button YButton;
	
	private JoystickButton rightBumper;
	private JoystickButton leftBumper;
	
	private double leftSpeed, rightSpeed;

	public OI() {
		xboxController = new Joystick(1);
		
		leftBumper = new JoystickButton(xboxController, RobotMap.left_Bumper);
		rightBumper = new JoystickButton(xboxController, RobotMap.right_Bumper);
		leftBumper.whileActive(new Collect());
		rightBumper.whileActive(new Release());
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

