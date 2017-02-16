package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class GoForward extends Command {

	private double Speed;
	private double Time;
	//private double Rotate; // Maybe pass in rotation

	public GoForward(double inputSpeed, double inputTime) {
		requires(Robot.DriveShaft);
		Speed = inputSpeed;
		//Rotate = inputRotate;
		Time = inputTime;
	}

	protected void initialize() {
		Robot.DriveShaft.GoForward(Speed);
		setTimeout(Time);
	}

	protected void execute() {
		Robot.DriveShaft.GoForward(Speed);
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