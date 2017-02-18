package org.usfirst.frc.team6022.robot;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6022.robot.commands.OpenGateway;
import org.usfirst.frc.team6022.robot.commands.ShooterStart;
import org.usfirst.frc.team6022.robot.commands.ShooterStop;
import org.usfirst.frc.team6022.robot.commands.StartTheSuck;
import org.usfirst.frc.team6022.robot.commands.StopTheSuck;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	 final Joystick joystick = new Joystick(0);
	    
	 Button StartShooter = new JoystickButton(joystick, 1 );
	 Button StopShooter = new JoystickButton(joystick, 2 );
	 Button Benjamin = new JoystickButton(joystick,11);
	 Button Upshirt = new JoystickButton (joystick,12);
	 Button Open = new JoystickButton (joystick, 3);
	 
	 public OI() {
	   StartShooter.whenPressed(new ShooterStart());
	   StopShooter.whenPressed(new ShooterStop());
	   Benjamin.whenPressed(new StartTheSuck());
	   Upshirt.whenPressed(new StopTheSuck());
	   Open.whenPressed(new OpenGateway());
	   
	    }
	    
	    public Joystick getJoystick()
		{
			return joystick;
		}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

