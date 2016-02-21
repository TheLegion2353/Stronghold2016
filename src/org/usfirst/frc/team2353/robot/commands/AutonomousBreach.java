package org.usfirst.frc.team2353.robot.commands;

import org.usfirst.frc.team2353.robot.Obstacle;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutonomousBreach extends CommandGroup {
    
    public  AutonomousBreach(String obstacle) {
        
    	if (obstacle == "Rocky Terrain") {
    		addParallel(new RunArmAuto("UP"));
    		addSequential(new TimedDrive());
    	} 
    	
    	else if (obstacle == "Rock Wall") {
    		addParallel(new RunArmAuto("UP"));
    		addSequential(new TimedDrive());
    	}
    	
    	else if (obstacle == "Moat") {
    		addParallel(new RunArmAuto("UP"));
    		addSequential(new TimedDrive());
    	}
    	
    	else if (obstacle == "Portcullis") {
    		
    	}
    	
    	//addSequential(new WaitCommand(3));
    }
}
