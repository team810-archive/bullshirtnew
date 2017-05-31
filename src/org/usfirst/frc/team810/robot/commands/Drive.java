package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.OI;
import org.usfirst.frc.team810.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	
	private double rotateMult;
	
	public Drive(double rotateMultiplier) {
		requires(RobotMap.driveTrain);
		rotateMult = rotateMultiplier;
	}

	@Override
	protected void execute() {
		double moveValue = OI.joystick.getRawAxis(1);
		double rotateValue = OI.joystick.getRawAxis(2);
		
		if (Math.abs(moveValue) < .25)
			moveValue = 0;
		if (Math.abs(rotateValue) < .25)
			rotateValue = 0;
		
		rotateValue *= rotateMult;
		
		RobotMap.driveTrain.arcadeDrive(moveValue, rotateValue);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
