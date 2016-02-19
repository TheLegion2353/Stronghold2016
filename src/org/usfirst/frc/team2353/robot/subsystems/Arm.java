package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.robot.Robot;
import org.usfirst.frc.team2353.robot.RobotMap;
import org.usfirst.frc.team2353.robot.commands.RunArmManual;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private Victor ArmMotorLeft;
	private Victor ArmMotorRight;
	
	public Arm() {
		ArmMotorLeft = new Victor(RobotMap.armMotorLeft);
		ArmMotorRight = new Victor(RobotMap.armMotorRight);
		
		ArmMotorRight.setInverted(true);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RunArmManual());
        
    }
    
    public void moveArm(double speed) {
    	ArmMotorLeft.set(speed);
    	ArmMotorRight.set(speed);
    }
}

