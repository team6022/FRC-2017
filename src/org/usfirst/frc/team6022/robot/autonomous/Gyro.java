package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Timer;

public class Gyro extends SampleRobot 
{
	
	private RobotDrive Robot;
	
		private ADXRS450_Gyro gyro;
		double Kp = 0.03;
		
		public Gyro() {
			gyro = new ADXRS450_Gyro();
			
			Robot = new RobotDrive(0,1,2,3);
			Robot.setExpiration(0.1);
		}
		public void AutonomousCommand() {
			
gyro.reset();
while (isAutonomous())
	{
	double angle = gyro.getAngle();
				
	Robot.drive(-1.0, -angle*Kp);
				
	Timer.delay(0.004);
					}
	Robot.drive(0.0, 0);
			
			}
			
		}