package org.usfirst.frc.team2353.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveForward extends CommandGroup {
    
    public  DriveForward() {
        addSequential(new TimedDrive(.5,4,0));
    }
}
