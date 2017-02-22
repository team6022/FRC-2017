package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {

	public Auto() {
		addSequential (new GoForward(0.50,4));
		//addSequential (new GoForward(-0.50,2));
		//addSequential (new AutoShoot(0.43,7));
		//addParallel (new AutoServo());

	}
}
