 package org.usfirst.frc.team6022.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6022.robot.Robot;


public class StopTheSuck extends Command {

    public StopTheSuck() {
     
        requires(Robot.Intake);
    }

    protected void initialize() {
    }

    protected void execute() {
    	 (Robot.Intake).StopIntake (Robot.oi.getJoystick());
    }

    protected boolean isFinished() {
        return false;
    }

   
    protected void end() {
    }
    
    protected void interrupted() {
    }
}
