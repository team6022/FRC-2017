package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {

	public Auto()
	{
		addSequential (new GoForward(0.50, 1));
		addSequential (new GoNoWhere(2));
		//addSequential (new GoForward(-1, 1));
		//addSequential (new AutoShoot(-0.45, 1));
		//addSequential (new GoNoWhere(2));
	}
}