package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Flywheel extends Subsystem {
	
	static VictorSP ActiveFly = new VictorSP(4);
	//static VictorSP ActiveFly2 = new VictorSP(5);
	
	public Flywheel ()
	{
		super();
	}
	
	protected void initDefaultCommand() 
	{
	}
	public void ActiveFly(Joystick joystick) 
	{
		ActiveFly.set(1);
	}
	public void KillFly(Joystick joystick) 
	{
		ActiveFly.set(0);
	}

}

