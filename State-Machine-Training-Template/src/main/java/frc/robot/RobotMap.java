// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.XboxController;

/** Add your docs here. */
public class robotmap {
    public static final int leftBackdrivePort = 1;
        public static WPI_TalonFX leftBackdrivemotor =  new WPI_TalonFX(leftBackdrivePort);
    public static final int rightBackdrivePort = 2;
        public static WPI_TalonFX rightBackdrivemotor = new WPI_TalonFX(rightBackdrivePort);
    public static final int leftFrontdrivePort = 3; 
        public static WPI_TalonFX leftFrontdrivemotor = new WPI_TalonFX(leftFrontdrivePort);
    public static final int  rightFrontdrivePort = 4;
        public static WPI_TalonFX rightFrontdrivemotor = new WPI_TalonFX(rightFrontdrivePort);

        public static XboxController driverController;

        public static void init() {
            driverController = new XboxController(0);
        }
    }
    

