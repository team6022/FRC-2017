package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ServoDownAuto extends Command {

	private double Speed;
	private double Time;

	public ServoDownAuto(double inputSpeed, double inputTime) {
		requires(Robot.Flipper);
		Speed = inputSpeed;	
		Time = inputTime;
	}

	protected void initialize() {
		Robot.Flipper.ServoDown(Speed);
		setTimeout(Time);
	}

	protected void execute() {
		Robot.Flipper.ServoDown(Speed);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
	}

	protected void interrupted() {
	}

}