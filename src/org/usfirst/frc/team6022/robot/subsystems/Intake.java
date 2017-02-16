 package org.usfirst.frc.team6022.robot.subsystems;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Intake extends Subsystem {
	
	static VictorSP ActiveIntake = new VictorSP(5);
	static VictorSP BeltSystem1 = new VictorSP(6);
	static VictorSP BeltSystem2 = new VictorSP(7);
	
	public Intake ()
	{
		super();
	}
	
	protected void initDefaultCommand() 
	{	
	}
	public void StartIntake(Joystick joystick)
	{
		ActiveIntake.set(1);
		BeltSystem1.set(0.5);
		BeltSystem2.set(0.5);
	}
	public void StopIntake(Joystick joystick)
	{
		ActiveIntake.set(0);
		BeltSystem1.set(0);
		BeltSystem2.set(0);
	}
	
}

