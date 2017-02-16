package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class AutoShoot extends Command{
	
	private double Speed;
	private double Time;
	
	public AutoShoot(double inputSpeed, double inputTime)
	{
		requires(Robot.Flywheel);
		Speed = inputSpeed;
		Time = inputTime;
	}
	
	protected void initialize()
	{
		Robot.Flywheel.AutoShoot(Speed);
		setTimeout(Time);
	}


protected void execute()
{
	Robot.Flywheel.AutoShoot(Speed);
}

protected boolean isFinished()
{
	return isTimedOut();
}

protected void end()
{
	Robot.DriveShaft.GoNoWhere();
}

protected void interrupted()
{
}	
	
}