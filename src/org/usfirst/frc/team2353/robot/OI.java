package org.usfirst.frc.team2353.robot;

//Libraries
import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//Packages
import org.usfirst.frc.team2353.robot.commands.ExampleCommand;

public class OI {
	
	private Joystick xboxController;
	
	private Button AButton;
	private Button YButton;
	
	private Button triggerButtonLeft;
	private Button triggerButtonRight;
	
	//Directions
	private double leftTred;
	private double rightTred;
	
	public void init()
	{
		xboxController = new Joystick(0);
		
		AButton = new JoystickButton(xboxController, 0);
		YButton = new JoystickButton(xboxController, 3);
		
		triggerButtonLeft = new JoystickButton(xboxController, 6);
		triggerButtonRight = new JoystickButton(xboxController, 5);
	}
	
	public void main()
	{
		//AButton.whileHeld(new elvDown());
		//YButton.whileHeld(new elvUp());
		
		leftTred = xboxController.getRawAxis(1); //left analog stick Y Axis
		rightTred = xboxController.getRawAxis(4); //right analog stick Y Axis
		
		if(leftTred > -.2 && leftTred < .2)
			leftTred = 0;
		if(rightTred > -.2 && rightTred < .2)
			rightTred = 0;

		new ExampleCommand();
	}
}

