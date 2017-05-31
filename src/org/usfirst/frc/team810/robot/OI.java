package org.usfirst.frc.team810.robot;

import org.usfirst.frc.team810.robot.commands.Fire;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick joystick;
	
	public static JoystickButton fire1, fire2, fire3, fire4, safety;
	
	public OI() {
		joystick = new Joystick(PortNumber.JOYSTICK);
		
		fire1 = new JoystickButton(joystick, 1);
			fire1.whenPressed(new Fire(RobotMap.cannon1));
		fire2 = new JoystickButton(joystick, 2);
			fire2.whenPressed(new Fire(RobotMap.cannon2));
		fire3 = new JoystickButton(joystick, 3);
			fire3.whenPressed(new Fire(RobotMap.cannon3));
		fire4 = new JoystickButton(joystick, 4);
			fire4.whenPressed(new Fire(RobotMap.cannon4));
		safety = new JoystickButton(joystick, 7);
	}
}
