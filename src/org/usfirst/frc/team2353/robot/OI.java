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
		return joystick.getRawAxis(RobotMap.joystickYAxis);
	}
	
	public double getJoystickX() {
		return joystick.getRawAxis(RobotMap.joystickXAxis);
	}
	
	
	
	
	
	
	
}

