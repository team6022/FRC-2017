package org.usfirst.frc.team6022.robot.subsystems;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;
//import java.util.concurrent.TimeUnit;

//import org.usfirst.frc.team6022.robot.commands.CloseGateway;
//import org.usfirst.frc.team6022.robot.commands.OpenGateway;

public class Flipper extends Subsystem {
	
	Servo Flip = new Servo(7);
	
	
	public Flipper ()
	{
		super();
	}
	
	protected void initDefaultCommand()
	{
		
	}
	
	public void ServoDown(double speed) 
	{
			Flip.set(0.5);
			Flip.setAngle(45);
	}
	
	public void ServoUp(double speed) 
	{
		Flip.set(0.5);
		Flip.setAngle(0);
	}

}

