package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {

	public Auto()
	{
		addSequential (new GoForward(0.50,2));
		addSequential (new GoNoWhere(2));
//		addSequential (new GoForward(-0.50,3));
//		addSequential (new GoForward(0.50,3));
//		addSequential (new GoForward(-0.25,3));
	}
}