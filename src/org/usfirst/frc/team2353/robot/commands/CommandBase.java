package org.usfirst.frc.team2353.robot.commands;

import org.usfirst.frc.team2353.robot.OI;
import org.usfirst.frc.team2353.robot.subsystems.Chassis;

import edu.wpi.first.wpilibj.command.Command;

/**
 * All Commands should extend this class
 * We should create subsystem objects here whenever so we can import 
 * them to any command without having to import the subsystem class each time
 */
public abstract class CommandBase extends Command {

	public static OI oi;
	public static Chassis drive;
	
	public static void init() {
		
		oi = new OI();
		
	}
	
	public CommandBase(String name) {
		super(name);
	}
	
	public CommandBase() {
		super();
	}
}
