package org.usfirst.frc.team2353.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousBreach extends CommandGroup {
    
    public  AutonomousBreach(String obstacle) {
    	
    	if (obstacle == "Portcullis") {
    		addParallel(new ArmDown());
    		addSequential(new DriveForward());
    		
    		addParallel(new ArmUp());
    		addSequential(new TimedDrive(.7,2.5,0));
    	} 
    	
    	else {
    		addSequential(new DriveForward());
    		
    		switch(obstacle) {
    	
    		case "Rough Terrain" :
    			addSequential(new TimedDrive(1,2,0));
    			break;
    		case "Rock Wall" :
    			addSequential(new TimedDrive(1,4,0));
    			break;
    		case "Moat":
    			addSequential(new TimedDrive(1,6,0));
    			break;
    		}
    	
    	}
    }
    
}

