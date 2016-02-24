package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.robot.RobotMap;
import org.usfirst.frc.team2353.robot.commands.RunCollectorManual;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Collector extends Subsystem {
	private Victor collectorMotor;
	
	public Collector() {
		collectorMotor=new Victor(RobotMap.collectorMotor);
	}
    public void initDefaultCommand() {
        setDefaultCommand(new RunCollectorManual());
    }
    
    public void setCollector(double speed) {
    	collectorMotor.set(speed);
    		
    }
}

