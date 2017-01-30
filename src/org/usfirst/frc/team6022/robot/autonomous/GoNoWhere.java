package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GoNoWhere extends Command {
	
	private double Time;
	public GoNoWhere(double inputTime)
    {
        requires(Robot.DriveShaft);
        Time = inputTime;
    }

    protected void initialize()
    {
    	Robot.DriveShaft.GoNoWhere();
    	setTimeout(Time);
    }

    protected void execute()
    {
    	Robot.DriveShaft.GoNoWhere();
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