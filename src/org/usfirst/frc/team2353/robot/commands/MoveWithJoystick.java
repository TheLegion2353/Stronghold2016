package org.usfirst.frc.team2353.robot.commands;

import org.usfirst.frc.team2353.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveWithJoystick extends Command {

	//Here we should have it require drive because this class extends commandBase where we initialized the chassis subsystem right?
	
    public MoveWithJoystick() {
        requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.tankDrive(Robot.oi.getLeftValue(), Robot.oi.getRightValue());
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