
package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.*;//"IterativeRobot";

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team6022.robot.autonomous.Auto;
import org.usfirst.frc.team6022.robot.commands.DriveWithLogitech;
import org.usfirst.frc.team6022.robot.subsystems.DriveShaft;
import org.usfirst.frc.team6022.robot.subsystems.Flywheel;
import org.usfirst.frc.team6022.robot.subsystems.Intake;
import org.usfirst.frc.team6022.robot.subsystems.Flipper;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

public static OI oi;
public static DriveShaft DriveShaft;
public static Flywheel Flywheel;
public static Intake Intake;
public static Flipper Flipper;



//final int gyroChannel = 0;
//final int joystickChannel = 0;
//
//final int leftMotorChannel = 0;
//final int leftRearMotorChannel = 1;
//final int rightMotorChannel = 2;
//final int rightRearMotorChannel = 3;
//
//double angleSetpoint = 0.0;
//final double pGain = .006;
//
//final double voltsPerDegreePerSecond = .0128;
//
//RobotDrive myRobot;
//AnalogGyro gyro;
//Joystick joystick;



Command autonomousCommand;
SendableChooser chooser;

/**
 * This function is run when the robot is first started up and should be
 * used for any initialization code.
 */



public void robotInit()
{
	
	CameraServer.getInstance().startAutomaticCapture();
	CameraServer.getInstance().startAutomaticCapture();
		
	//Starts Camera Server
	//CameraServer camServer0 = CameraServer.getInstance();
	//camServer0.setQuality(50);
	//camServer0.startAutomaticCapture("cam0");
//	CameraServer camServer1 = CameraServer.getInstance();
//	camServer1.setQuality(50);
//	camServer1.startAutomaticCapture("cam1");
//	
//	 myRobot = new RobotDrive(new VictorSP(leftMotorChannel), new VictorSP(
//	          leftRearMotorChannel), new VictorSP(rightMotorChannel),
//	          new VictorSP(rightRearMotorChannel));
//	        gyro = new AnalogGyro(gyroChannel);
//	        joystick = new Joystick(joystickChannel);

	//Initialize subsystems
	Flipper = new Flipper();
	Intake = new Intake();
	Flywheel = new Flywheel();
	DriveShaft = new DriveShaft();
	oi = new OI();
	
	chooser = new SendableChooser();
	chooser.addDefault("Default Auto", new DriveWithLogitech());
	chooser.addObject("My Auto", new Auto());
	SmartDashboard.putData("Auto mode", chooser);
}




/**
 * This function is called once each time the robot enters Disabled mode.
 * You can use it to reset any subsystem information you want to clear when
 * the robot is disabled.
 */
public void disabledInit(){

}

public void disabledPeriodic() {
	Scheduler.getInstance().run();
}

/**
 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
 * below the Gyro
 *
 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
 * or additional comparisons to the switch structure below with additional strings & commands.
 */
public void autonomousInit() {
	autonomousCommand = (Command) chooser.getSelected();

	autonomousCommand.start();


	autonomousCommand = new Auto();


	// schedule the autonomous command (example)
	if (autonomousCommand != null) autonomousCommand.start();
}

/**
 * This function is called periodically during autonomous
 */
public void autonomousPeriodic() {
	Scheduler.getInstance().run();
}

public void teleopInit() {
	// This makes sure that the autonomous stops running when
	// teleop starts running. If you want the autonomous to
	// continue until interrupted by another command, remove
	// this line or comment it out.
	if (autonomousCommand != null) autonomousCommand.cancel();
}

/**
 * This function is called periodically during operator control
 */
public void teleopPeriodic() {
	Scheduler.getInstance().run();
}

/**
 * This function is called periodically during test mode
 */
public void testPeriodic() {
	LiveWindow.run();
}

public void operatorControl() {

      while (isOperatorControl() && isEnabled()) {

           Timer.delay(0.005);		// wait for a motor update time
        }     
//      double turningValue;
//      gyro.setSensitivity(voltsPerDegreePerSecond); //calibrates gyro values to equal degrees
//      while (isOperatorControl() && isEnabled()) {
//
//          turningValue =  (angleSetpoint - gyro.getAngle())*pGain;
//          if(joystick.getY() <= 0)
//          {
//              //forwards
//              myRobot.drive(joystick.getY(), turningValue);
//          } else {
//              //backwards
//              myRobot.drive(joystick.getY(), -turningValue);
//          }
//      }
//      
      
      
    }
}
