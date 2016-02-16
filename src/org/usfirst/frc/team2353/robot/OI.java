package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private Joystick joystick;
	private Joystick xboxController;
	

	private JoystickButton AButton, BButton, YButton, XButton;
	public OI() {
		
		joystick = new Joystick(RobotMap.joyStickPort);
		xboxController = new Joystick(RobotMap.xboxPort);
		
		AButton = new JoystickButton(joystick, RobotMap.AButton);
		BButton = new JoystickButton(joystick, RobotMap.BButton);
		YButton = new JoystickButton(joystick, RobotMap.YButton);
		XButton = new JoystickButton(joystick, RobotMap.XButton);
		
		
		
		
		
		
	}
	
	public double getJoystickY() {
		double y_axis=joystick.getRawAxis(RobotMap.joystickYAxis);
		if (y_axis<.2 && y_axis>.2)
			y_axis=0;
		//System.out.print(y_axis);
		return y_axis;	
		
	}
	
	public double getJoystickZ() {
		double z_axis=joystick.getRawAxis(RobotMap.joystickZAxis);
		if (z_axis<.4 && z_axis>.4)
			z_axis=0;
		//System.out.print(z_axis);
		return z_axis;	
		
	}
	
	
	
	
	
	
	
}

