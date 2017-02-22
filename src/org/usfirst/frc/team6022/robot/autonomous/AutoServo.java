package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoServo extends CommandGroup {

	public AutoServo() {
		addSequential (new ServoUpAuto(0.75,0.5));
		addSequential (new ServoDownAuto(0.75, 0.5));
	}
}
