package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.commands.PleaseWork;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {

	public Auto() {
		addSequential (new GoForward(0.75,5));
		
		//addSequential (new GoForward(-0.50,2));
		//addParallel (new AutoServo());
		//addParallel (new AutoShoot(0.43,7));
		addSequential (new PleaseWork());

	}
}
