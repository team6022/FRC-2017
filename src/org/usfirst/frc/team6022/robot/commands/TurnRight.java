package org.usfirst.frc.team6022.robot.commands;

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class TurnRight extends Command {

	private double Speed;
	private double Time;

	public TurnRight(double inputSpeed, double inputTime) {
		requires(Robot.DriveShaft);
		Speed = inputSpeed;	
		Time = inputTime;
	}

	protected void initialize() {
		Robot.DriveShaft.TurnRight1(Speed);
		setTimeout(Time);
	}

	protected void execute() {
		Robot.DriveShaft.TurnRight1(Speed);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.DriveShaft.GoNoWhere();
	}

	protected void interrupted() {
	}

}