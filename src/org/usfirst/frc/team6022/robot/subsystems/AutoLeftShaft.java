
 package org.usfirst.frc.team6022.robot.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;


public class AutoLeftShaft extends Subsystem {

	static VictorSP driveLeft = new VictorSP(0);
	static VictorSP driveLeft1 = new VictorSP(1);
	
	public AutoLeftShaft()
	{
		super();
	}


	public void initDefaultCommand () 
	{
	}
	
	public void GoLeft(double inputSpeed)
	{
		driveLeft.set(inputSpeed);
		driveLeft1.set(inputSpeed);
		
	}
}

