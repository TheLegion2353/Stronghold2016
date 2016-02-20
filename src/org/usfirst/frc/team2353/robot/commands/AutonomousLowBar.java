package org.usfirst.frc.team2353.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousLowBar extends CommandGroup {
    
    public  AutonomousLowBar() {
    	
    	addSequential(new TimedDrive(.5,6,0));
    	addSequential(new TimedDrive(.4,4,.5));
    	
    }
}
