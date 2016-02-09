package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private Joystick joystick;
	private Joystick xboxController;
	

	private JoystickButton AButton, BButton, YButton, XButton;
	public OI() {
		
		joystick = new Joystick(0);
		xboxController = new Joystick(1);
		
		AButton = new JoystickButton(joystick, RobotMap.AButton);
		BButton = new JoystickButton(joystick, RobotMap.BButton);
		YButton = new JoystickButton(joystick, RobotMap.YButton);
		XButton = new JoystickButton(joystick, RobotMap.XButton);
		
		
		
		
		
		
	}
	
	public double getJoystickY() {
		double y_axis=joystick.getRawAxis(RobotMap.joystickYAxis);
		if (y_axis<.2 && y_axis>.2)
			y_axis=0;
		System.out.print(y_axis);
		return y_axis;	
		
	}
	
	public double getJoystickX() {
		double x_axis=joystick.getRawAxis(RobotMap.joystickXAxis);
		if (x_axis<.4 && x_axis>.4)
			x_axis=0;
		System.out.print(x_axis);
		return x_axis;	
		
	}
	
	
	
	
	
	
	
}

