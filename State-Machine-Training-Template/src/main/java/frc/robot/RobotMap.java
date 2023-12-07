package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.XboxController;

public class RobotMap {
    
    public static DrivetrainStateMachine drivetrainStateMachine;

    public static TankDrive tankDrive;

    public static final int LEFT_BACK_DRIVE_PORT = 1;
    public static final int RIGHT_BACK_DRIVE_PORT = 2;
    public static final int LEFT_FRONT_DRIVE_PORT = 3;
    public static final int RIGHT_FRONT_DRIVE_PORT = 4;

    public static WPI_TalonFX leftBackDriveMotor = new WPI_TalonFX(LEFT_BACK_DRIVE_PORT);
    public static WPI_TalonFX rightBackDriveMotor = new WPI_TalonFX(RIGHT_BACK_DRIVE_PORT);
    public static WPI_TalonFX leftFrontDriveMotor = new WPI_TalonFX(LEFT_FRONT_DRIVE_PORT);
    public static WPI_TalonFX rightFrontDriveMotor = new WPI_TalonFX(RIGHT_FRONT_DRIVE_PORT);

    
    public static XboxController driverController;

    public static void init() {
    driverController = new XboxController(0);

    tankDrive.periodic();
    }
}
