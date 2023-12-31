// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems.Drive;

import frc.robot.lib.statemachine.StateMachine;

/** Add your docs here. */
public class DrivetrainstateMachine extends StateMachine {  

    public static TankState tankState = new TankState();
    public static AutoState autoState = new AutoState();

public DrivetrainstateMachine() { 
    tankState.build();
    autoState.build();

    setCurrentState(tankState);
}
}
