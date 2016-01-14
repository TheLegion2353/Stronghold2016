package org.usfirst.frc.team2353.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveChassis extends Subsystem {
	
	private Victor frontLeftMotor;
	private Victor frontRightMotor;
	private Victor backLeftMotor;
	private Victor backRightMotor;
	
	
	public void initDefaultCommand() {
		frontLeftMotor=new Victor(0);
		frontRightMotor=new Victor(1);
		backLeftMotor=new Victor(2);
		backRightMotor=new Victor(3);
	}
	
	
	
}