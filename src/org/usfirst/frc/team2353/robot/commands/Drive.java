
package org.usfirst.frc.team2353.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2353.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID;


/**
 *
 */
public class Drive extends Command {

	GenericHID leftStick, rightStick;
    public Drive (GenericHID leftStick, GenericHID rightStick) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.chassis);
        this.leftStick=leftStick;
        this.rightStick=rightStick;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.moveWithJoystick(leftStick, rightStick);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}