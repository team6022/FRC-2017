package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {

	public Auto()
	{
		addSequential (new GoForward(0.5, 8));
		//addSequential (new GoNoWhere(5));
		//addSequential (new GoForward(-1, 1));
		
	}
}