package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.commands.TurnRight;
import org.usfirst.frc.team6022.robot.commands.TurnLeft;
//import org.usfirst.frc.team6022.robot.commands.PleaseWork;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {

	public Auto() {
		
		addSequential (new GoForward(-0.35,2));
		//addSequential (new GoForward(-0.50,2));
			//addParallel (new AutoShoot(0.43,7));
			//addSequential (new PleaseWork());
		addSequential (new GoNoWhere(0.5));
		addSequential (new TurnRight(0.33,1));
		//addSequential (new GoNoWhere(0.5));
		//addSequential (new TurnLeft(-0.33,1.3));
		addSequential (new GoNoWhere(0.5));
		addSequential (new GoForward(-0.30,2));
	}
}
