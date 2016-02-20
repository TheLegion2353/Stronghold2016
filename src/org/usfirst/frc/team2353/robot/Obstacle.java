package org.usfirst.frc.team2353.robot;

public class Obstacle {
	
	private double speed, time;
	private String name;
	
	public Obstacle(double speed, double time, String name) {
		
		this.speed = speed;
		this.time = time; 
		this.name = name;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public double getTime() {
		return time;
	}
	
	public String getObstacleName() {
		return name;
	}
	
	

}
