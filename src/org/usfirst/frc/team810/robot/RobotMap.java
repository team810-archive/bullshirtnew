package org.usfirst.frc.team810.robot;

import org.usfirst.frc.team810.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static DriveTrain driveTrain;
	
	public static Spark frontRight;
	public static Spark rearRight;
	public static Spark frontLeft;
	public static Spark rearLeft;
	public static RobotDrive robotDrive;
	
	public static Solenoid cannon1;
	public static Solenoid cannon2;
	public static Solenoid cannon3;
	public static Solenoid cannon4;
	
	public RobotMap() {
		driveTrain = new DriveTrain();
		
		frontRight = new Spark(PortNumber.FRONT_RIGHT_MOTOR);
		rearRight = new Spark(PortNumber.REAR_RIGHT_MOTOR);
		frontLeft = new Spark(PortNumber.FRONT_LEFT_MOTOR);
		rearLeft = new Spark(PortNumber.REAR_LEFT_MOTOR);
		robotDrive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
		
		cannon1 = new Solenoid(PortNumber.PCM, PortNumber.CANNON_1);
		cannon2 = new Solenoid(PortNumber.PCM, PortNumber.CANNON_2);
		cannon3 = new Solenoid(PortNumber.PCM, PortNumber.CANNON_3);
		cannon4 = new Solenoid(PortNumber.PCM, PortNumber.CANNON_4);
	}
}
