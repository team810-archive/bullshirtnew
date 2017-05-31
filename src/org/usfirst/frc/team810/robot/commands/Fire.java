package org.usfirst.frc.team810.robot.commands;

import org.usfirst.frc.team810.robot.OI;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Fire extends CommandGroup {

	public Fire(Solenoid solenoid) {
	
			addSequential(new SolenoidOpen(solenoid));
			addSequential(new Wait(.25));
			addSequential(new SolenoidClose(solenoid));
		
	}
	
}
