package org.usfirst.frc.team2353.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.GenericHID;

/**
 *
 */
public class Chassis extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Victor frontLeftMotor;
	private Victor frontRightMotor;
	private Victor backLeftMotor;
	private Victor backRightMotor;
	RobotDrive drive;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	frontLeftMotor=new Victor(0);
    	frontRightMotor=new Victor(1);
    	backLeftMotor=new Victor(2);
    	backRightMotor=new Victor(3);
    	drive=new RobotDrive(frontLeftMotor,backLeftMotor, frontRightMotor,backRightMotor);
    	
    }
    
    public void moveWithJoystick(GenericHID leftStick, GenericHID rightStick) {
    	drive.tankDrive(leftStick, rightStick);
    }
    
    
}


