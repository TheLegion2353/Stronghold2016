package org.usfirst.frc.team2353.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2353.robot.commands.MoveWithJoystick;

import edu.wpi.first.wpilibj.GenericHID;

/**
 *
 */
public class Chassis extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	//Move variables to RobotMap
	private Victor frontLeftMotor;
	private Victor frontRightMotor;
	private Victor backLeftMotor;
	private Victor backRightMotor;
	private RobotDrive drive;
	
	public void Chassis() {
		frontLeftMotor=new Victor(0);
    	frontRightMotor=new Victor(1);
    	backLeftMotor=new Victor(2);
    	backRightMotor=new Victor(3);
    	drive=new RobotDrive(frontLeftMotor,backLeftMotor, frontRightMotor,backRightMotor);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new MoveWithJoystick());
    	
    }
    
//  public void moveWithJoystick(GenericHID leftStick, GenericHID rightStick) {
//  	drive.tankDrive(leftStick, rightStick);
//  }
    
    public void tankDrive(double left, double right) {
    	drive.tankDrive(left,right);
    }
    
}


