package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.OI;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;

public class SolenoidOpen extends Command {

	public SolenoidOpen(Solenoid solenoid) {
		if (OI.safety.get()) {
		solenoid.set(true);
		}
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

}
