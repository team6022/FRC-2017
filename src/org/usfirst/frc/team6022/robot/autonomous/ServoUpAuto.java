package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ServoUpAuto extends Command {

	private double Speed;
	private double Time;

	public ServoUpAuto(double inputSpeed, double inputTime) {
		requires(Robot.Flipper);
		Speed = inputSpeed;	
		Time = inputTime;
	}

	protected void initialize() {
		Robot.Flipper.ServoUp(Speed);
		setTimeout(Time);
	}

	protected void execute() {
		Robot.Flipper.ServoUp(Speed);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
	}

	protected void interrupted() {
	}

}