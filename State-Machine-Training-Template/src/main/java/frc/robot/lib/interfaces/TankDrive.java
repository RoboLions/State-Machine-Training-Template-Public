// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.lib.interfaces;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import frc.robot.robotmap;

/** Add your docs here. */
public class TankDrive {
    private static final WPI_TalonFX leftBackmotor = robotmap.leftBackdrivemotor;
    private static final WPI_TalonFX rightBackmotor = robotmap.rightBackdrivemotor; 
    private static final WPI_TalonFX rightFrontmotor = robotmap.rightFrontdrivemotor;
    private static final WPI_TalonFX leftFrontmotor = robotmap.leftFrontdrivemotor;

     public TankDrive (){
        leftFrontmotor.set(ControlMode.Follower, leftBackmotor.getDeviceID());
        rightFrontmotor.set(ControlMode.Follower, rightBackmotor.getDeviceID());

        leftBackmotor.setNeutralMode(NeutralMode.Coast);
        rightBackmotor.setNeutralMode(NeutralMode.Coast);

        rightBackmotor.setInverted(true);
        rightFrontmotor.setInverted(true);
        leftFrontmotor.setInverted(false);
        leftBackmotor.setInverted(false);
        
        leftBackmotor.setSensorPhase(true);


        leftFrontmotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 10);
        rightFrontmotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 10);
        leftBackmotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 10);
        rightBackmotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 10);

        leftFrontmotor.configNominalOutputForward(0, 10);
        leftFrontmotor.configNominalOutputReverse(0,10);

     }

        
    
}

