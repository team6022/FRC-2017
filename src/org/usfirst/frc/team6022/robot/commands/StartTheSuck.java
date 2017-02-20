package org.usfirst.frc.team6022.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6022.robot.Robot;


public class StartTheSuck extends Command {

	public StartTheSuck () {
		requires(Robot.Intake);
	}

	protected void initialize() {
	}

	protected void execute() {
		(Robot.Intake).StartIntake (Robot.oi.getJoystick());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}

}
