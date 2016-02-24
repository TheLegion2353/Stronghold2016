package org.usfirst.frc.team2353.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousLowGoal extends CommandGroup {

    public AutonomousLowGoal(String obstacle, String position) {
        addSequential(new AutonomousBreach(obstacle));
        addSequential(new GoToLowGoal(position));
        addSequential(new Shoot());
    }
}
