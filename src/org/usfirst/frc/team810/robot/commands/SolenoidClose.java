package org.usfirst.frc.team810.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;

public class SolenoidClose extends Command {

	public SolenoidClose(Solenoid solenoid) {
		solenoid.set(false);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

}
