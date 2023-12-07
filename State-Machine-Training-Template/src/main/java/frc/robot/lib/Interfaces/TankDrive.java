// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.lib.Interfaces;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import frc.robot.RobotMap;

/** Add your docs here. */
public class TankDrive {
    private static final WPI_TalonFX leftBackMotor = RobotMap.leftBackDriveMotor;
    private static final WPI_TalonFX rightBackMotor = RobotMap.rightBackDriveMotor;
    private static final WPI_TalonFX leftFrontMotor = RobotMap. leftFrontDriveMotor;
    private static final WPI_TalonFX rightFrontMotor = RobotMap. rightFrontDriveMotor;


public TankDrive(){
    leftFrontMotor.set(ControlMode.Follower, leftBackMotor.getDeviceID());
    rightFrontMotor.set(ControlMode.Follower, rightBackMotor.getDeviceID());

    leftBackMotor.setNeutralMode(NeutralMode.Coast);
    rightBackMotor.setNeutralMode(NeutralMode.Coast);

    rightBackMotor.setInverted(true);
    rightFrontMotor.setInverted(true);
    leftBackMotor.setInverted(false);
    leftFrontMotor.setInverted(false);

    leftBackMotor.setSensorPhase(true);

    leftFrontMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor,0,10);
    rightFrontMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor,0,10);
    leftBackMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor,0,10);
    rightBackMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor,0,10);

    leftFrontMotor.configNominalOutputForward(0,10);
    leftFrontMotor.configNominalOutputReverse(0,10);
    leftFrontMotor.configPeakOutputForward(1,10);
    leftFrontMotor.configPeakOutputReverse(-1,10);
    leftFrontMotor.configNeutralDeadband(0.001,10);

    rightFrontMotor.configNominalOutputForward(0,10);
    rightFrontMotor.configNominalOutputReverse(0,10);
    rightFrontMotor.configPeakOutputForward(1,10);
    rightFrontMotor.configPeakOutputReverse(-1,10);
    rightFrontMotor.configNeutralDeadband(0.001,10);

    leftBackMotor.configNominalOutputForward(0,10);
    leftBackMotor.configNominalOutputReverse(0,10);
    leftBackMotor.configPeakOutputForward(1,10);
    leftBackMotor.configPeakOutputReverse(-1,10);
    leftBackMotor.configNeutralDeadband(0.001,10);

    rightBackMotor.configNominalOutputForward(0,10);
    rightBackMotor.configNominalOutputReverse(0,10);
    rightBackMotor.configPeakOutputForward(1,10);
    rightBackMotor.configPeakOutputReverse(-1,10);
    rightBackMotor.configNeutralDeadband(0.001,10);
}

public void Drive(double trottle, double rotate) {
leftBackMotor.set(trottle + rotate);
rightBackMotor.set(trottle + rotate);
}

    public double setDeadBand(double input) {
        if(input>0.25||input<-0.25){
            return input;
        }
        return 0.0;
    }
}