
package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.commands.DriveWithLogitech;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveShaft extends Subsystem {

//	static VictorSP drive00 = new VictorSP(0);
//	static VictorSP drive01 = new VictorSP(1);
//	static VictorSP drive02 = new VictorSP(2);
//	static VictorSP drive03 = new VictorSP(3);
	static VictorSP drive = new VictorSP(0);
	static VictorSP drive1 = new VictorSP(1);
	static VictorSP drive2 = new VictorSP(2);
	static VictorSP drive3 = new VictorSP(3);// 4 motor drive

	public DriveShaft() {
		super();
	}

	public void initDefaultCommand () {
		setDefaultCommand (new DriveWithLogitech());
	}

	public void DriveWithLogitech(Joystick joystick) {
		
//		drive.set(joystick.getTwist()*0.75);
//		drive1.set(joystick.getTwist()*0.75);
//		drive2.set(joystick.getTwist()*0.75);
//		drive3.set(joystick.getTwist()*0.75);
//	
//		
//		drive.set(joystick.getY()*0.85);
//		drive1.set(joystick.getY()*0.85);
//		drive2.set(-joystick.getY()*0.85);
//		drive3.set(-joystick.getY()*0.85);
//		
		if (joystick.getY() >= .15 || joystick.getY() <= -.15)
		{
			
			drive.set(joystick.getY()*0.85);
			drive1.set(joystick.getY()*0.85);
			drive2.set(-joystick.getY()*0.85);
			drive3.set(-joystick.getY()*0.85);
		}
		
		else
		{
			drive.set(joystick.getX()*0.75);
			drive1.set(joystick.getX()*0.75);
			drive2.set(joystick.getX()*0.75);
			drive3.set(joystick.getX()*0.75);

		}
	}
	
	public void TurnLeft1 (double inputSpeed)
	{
		drive.set(inputSpeed);
		drive1.set(inputSpeed);
	}
	public void TurnRight1 (double inputSpeed)
	{
		drive2.set(inputSpeed);
		drive3.set(inputSpeed);
	}
	public void GoForward(double inputSpeed) {
		drive.set(-inputSpeed);
		drive1.set(-inputSpeed);
		drive2.set(inputSpeed);
		drive3.set(inputSpeed);
	}

	public void GoNoWhere() {
		drive.set(0);
		drive1.set(0);
		drive2.set(0);
		drive3.set(0);
	}

}
