package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Servo extends Subsystem {
	
	static Servo Flip = new Servo(8);
	
	public Servo ()
	{
		super();
	}
	
	public Servo(int i) {
		// TODO Auto-generated constructor stub
	}

	protected void initDefaultCommand() 
	{
	}
	public void ServoStart(Joystick joystick) 
	{
		//Flip.set(0.5);
	}
}

