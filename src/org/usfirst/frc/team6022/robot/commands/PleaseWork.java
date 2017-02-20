package org.usfirst.frc.team6022.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PleaseWork extends CommandGroup {

	public PleaseWork() {
		addSequential (new AlternationUp(0.75,0.5));
		addSequential (new AlternationDown(0.75, 0.5));
	}
}
