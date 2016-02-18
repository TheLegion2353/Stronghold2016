package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private Joystick joystick;
	private Joystick xboxController;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public final static int joystickXAxis=0;
    public final static int joystickYAxis=1;
    public final static int joystickZAxis=2;

	private JoystickButton AButton, BButton, YButton, XButton;
	public OI() {
		
		joystick = new Joystick(RobotMap.joyStickPort);
		xboxController = new Joystick(RobotMap.xboxPort);
		
		
		
		
		
		
		
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
	
	
	
	
	
	
	
}

