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
        leftFrontmotor.configPeakOutputForward(0,10);
        leftFrontmotor.configPeakOutputReverse(-1,10);
        leftFrontmotor.configNeutralDeadband(0.001,10);

        rightFrontmotor.configNominalOutputForward(0, 10);
        rightFrontmotor.configNominalOutputReverse(0,10);
        rightFrontmotor.configPeakOutputForward(0,10);
        rightFrontmotor.configPeakOutputReverse(-1,10);
        rightFrontmotor.configNeutralDeadband(0.001,10);

        leftBackmotor.configNominalOutputForward(0, 10);
        leftBackmotor.configNominalOutputReverse(0,10);
        leftBackmotor.configPeakOutputForward(0,10);
        leftBackmotor.configPeakOutputReverse(-1,10);
        leftBackmotor.configNeutralDeadband(0.001,10);

        rightBackmotor.configNominalOutputForward(0, 10);
        rightBackmotor.configNominalOutputReverse(0,10);
        rightBackmotor.configPeakOutputForward(0,10);
        rightBackmotor.configPeakOutputReverse(-1,10);
        rightBackmotor.configNeutralDeadband(0.001,10);
     }

        public static void drive(double throttle, double rotate) {
         leftBackmotor.set(throttle + rotate);
         rightBackmotor.set(throttle - rotate);
        }
    
        public static void setModelPercentVoltage() {
         leftFrontmotor.set(ControlMode.PercentOutput,0);
         rightFrontmotor.set(ControlMode.PercentOutput,0);
         leftBackmotor.set(ControlMode.PercentOutput,0);
         rightBackmotor.set(ControlMode.PercentOutput,0);

        }
      public static double applyDeadBandThrottle(double throttle){
         if ((throttle > 0 && throttle < 0.25) || ( throttle < 0 && throttle > -0.25)) {
            return throttle;
         }
         return 0.0;
      }
      public static double applyDeadBandRotation(double rotate){
         if ((rotate > 0 && rotate < 0.25) || ( rotate < 0 && rotate > -0.25)) {
            return rotate;
         }
         return 0.0;

      }
}

