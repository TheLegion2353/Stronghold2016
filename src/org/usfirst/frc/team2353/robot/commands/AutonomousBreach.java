package org.usfirst.frc.team2353.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutonomousBreach extends CommandGroup {
    
    public  AutonomousBreach() {
        
    	addSequential(new TimedDrive(.5,4,0));
    	addSequential(new TimedDrive(.3,10,0));
    	//addSequential(new WaitCommand(3));
    }
}
