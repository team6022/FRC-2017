package org.usfirst.frc.team6022.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6022.robot.Robot;



 
public class OpenGateway extends Command {

    public OpenGateway() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.Servo);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

     //Called repeatedly when this Command is scheduled to run
 protected void execute() {
    	 Robot.Servo.ServoStart (Robot.oi.getJoystick());
    }

    // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
       return false;
}

    // Called once after isFinished returns true
    protected void end() {
}

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
protected void interrupted() {
}
}