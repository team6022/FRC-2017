

 package org.usfirst.frc.team6022.robot.autonomous;
 

import org.usfirst.frc.team6022.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class GoLeft extends Command{
	
	private double Speed;
	private double Time;
	
	public GoLeft(double inputSpeed, double inputTime)
	{
		requires(Robot.AutoLeftShaft);
		Speed = inputSpeed;
		Time = inputTime;
		
	}
	
	protected void initialize()
	{
		Robot.AutoLeftShaft.GoLeft(Speed);
		setTimeout(Time);
	}


protected void execute()
{
	Robot.AutoLeftShaft.GoLeft(Speed);
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
