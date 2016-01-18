package org.usfirst.frc.team2353.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PickUp extends Subsystem {
    
    private Victor leftMotor, rightMotor;
    
    public PickUp() {
    	leftMotor = new Victor(5);
    	rightMotor = new Victor(6);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

