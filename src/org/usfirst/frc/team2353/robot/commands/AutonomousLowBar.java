package org.usfirst.frc.team2353.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousLowBar extends CommandGroup {
    
    public  AutonomousLowBar() {
    	
    	addParallel(new ArmDown(),2);
    	addSequential(new DriveForward());
    	addSequential(new TimedDrive(.4,4,0));
    	
    }
}
