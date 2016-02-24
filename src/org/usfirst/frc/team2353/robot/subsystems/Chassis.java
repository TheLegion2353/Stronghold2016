package org.usfirst.frc.team2353.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2353.robot.RobotMap;
import org.usfirst.frc.team2353.robot.commands.DriveArcade;

public class Chassis extends Subsystem {
	private Victor backLeftMotor;
	private Victor backRightMotor;
	private RobotDrive drive;
	
	public Chassis() {
    	backLeftMotor=new Victor(RobotMap.rearLeftNum);
    	backRightMotor=new Victor(RobotMap.rearRightNum);
    	drive=new RobotDrive(backLeftMotor, backRightMotor);
	}
	
    public void initDefaultCommand() {
        
    	setDefaultCommand(new DriveArcade());
    }
    
    public void arcadeDrive(double moveValue, double rotateValue) {
    	drive.arcadeDrive(-moveValue, -rotateValue);
    	
    }
}


