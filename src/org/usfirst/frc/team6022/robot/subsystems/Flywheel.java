package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Flywheel extends Subsystem {
	
	static VictorSP ActiveFly = new VictorSP(4);
	
	public Flywheel ()
	{
		super();
	}
	
	protected void initDefaultCommand() 
	{
	}
	public void ActiveFly(Joystick joystick) 
	{
		ActiveFly.set(0.50);
	}
	public void KillFly(Joystick joystick) 
	{
		ActiveFly.set(0);
	}
	public void AutoShoot(double speed)
	{
		ActiveFly.set(0.45);
		
	}
	public void GoNoWhere (){
		
		ActiveFly.set(0);
	}
	
}

