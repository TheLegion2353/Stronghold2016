
package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team2353.robot.commands.AutonomousBreach;
import org.usfirst.frc.team2353.robot.commands.AutonomousLowBar;
import org.usfirst.frc.team2353.robot.commands.AutonomousLowGoal;
import org.usfirst.frc.team2353.robot.commands.DoNothing;
import org.usfirst.frc.team2353.robot.commands.DriveForward;
import org.usfirst.frc.team2353.robot.commands.TimedDrive;
import org.usfirst.frc.team2353.robot.subsystems.Arm;
import org.usfirst.frc.team2353.robot.subsystems.Chassis;
import org.usfirst.frc.team2353.robot.subsystems.Collector;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class Robot extends IterativeRobot {
	public static Chassis chassis;

	public static OI oi;
	public static Arm arm;
	public static Collector collector;
	

	
    Command autonomousCommand;
    SendableChooser obstacleChooser, positionChooser, modeChooser;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		chassis = new Chassis();
		arm = new Arm();
		collector = new Collector();
    	oi = new OI();
		
    	CameraServer.getInstance().startAutomaticCapture("cam0");
    	
        obstacleChooser = new SendableChooser();
        positionChooser = new SendableChooser();
        modeChooser = new SendableChooser();
        
        obstacleChooser.addDefault("Rough Terrain", "Rough Terrain");
        obstacleChooser.addObject("Moat","Moat");
        obstacleChooser.addObject("Rock Wall","Rock Wall");
        obstacleChooser.addObject("Port-I-cullis","Porculllis");
        SmartDashboard.putData("Obstacle: ", obstacleChooser);
        
        modeChooser.addDefault("Breach", "Breach");
        modeChooser.addObject("Do Nothing", "DoNothing");
        modeChooser.addObject("Drive to Obstacle", "Drive forward");
        modeChooser.addObject("Low Bar", "lowBar");
        modeChooser.addObject("Score Low Goal","score");
        SmartDashboard.putData("Action: ", modeChooser);
        
        positionChooser.addDefault("Left", "Left");
        positionChooser.addObject("Left Center","Left Center");
        positionChooser.addObject("Right Center","Right Center");
        positionChooser.addObject("Right","Right");
        SmartDashboard.putData("Position: ",positionChooser);
       
        SmartDashboard.putNumber("First Timed Drive Speed",0);
        SmartDashboard.putNumber("First Timed Drive Time",1);
        SmartDashboard.putNumber("First Timed Drive Curve", 2);
       
        /*SmartDashboard.putNumber("Second Timed Drive Speed",3);
        SmartDashboard.putNumber("Second Timed Drive Time",4);
        SmartDashboard.putNumber("Second Timed Drive Curve", 5);
        SmartDashboard.putNumber("Third Timed Drive Speed",6);
        SmartDashboard.putNumber("Third Timed Drive Time",7);
        SmartDashboard.putNumber("Third  Timed Drive Curve",8);
        SmartDashboard.putNumber("Fourth Timed Drive Speed",9);
        SmartDashboard.putNumber("Foruth Timed Drive Time",10);
        SmartDashboard.putNumber("Fourth Timed Drive Curve", 11);
        */
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){
    	
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
        
    	String position = (String) positionChooser.getSelected();
        String mode = (String) modeChooser.getSelected();
        String obstacle = (String) obstacleChooser.getSelected();
       
        Command autonomousCommand;
        if (mode == "DoNothing")
        	autonomousCommand = new DoNothing();
        else if (mode == "Drive forward") 
        	autonomousCommand = new DriveForward();
        else if (mode == "lowBar")	
        	autonomousCommand = new AutonomousLowBar();
        else if (mode == "Breach")
        	autonomousCommand = new AutonomousBreach(obstacle);
        else  
        	autonomousCommand = new AutonomousLowGoal(obstacle, position);
    	
    	autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    	
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
        double speed = SmartDashboard.getNumber("First Timed Drive Speed");
        double curve = SmartDashboard.getNumber("First Timed Drive Curve");
        double time = SmartDashboard.getNumber("First Timed Drive Time");
        
        Command testCommand = new TimedDrive(speed, time, curve);
        testCommand.start();
        
    }
}
