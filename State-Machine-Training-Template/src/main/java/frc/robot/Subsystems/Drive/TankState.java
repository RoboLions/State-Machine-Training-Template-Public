// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems.Drive;

import frc.robot.lib.interfaces.TankDrive;
import frc.robot.lib.statemachine.State;
import frc.robot.robotmap;

/** Add your docs here. */
public class TankState extends State{
TankDrive tankdrive = new TankDrive();

@Override
public void build() {}

@Override
public void init(State prevState) {
    TankDrive.setModelPercentVoltage();
}
@Override
public void execute() {
    double throttle = TankDrive.applyDeadBandThrottle(-robotmap.driverController.getLeftY());
    double rotate = TankDrive.applyDeadBandRotation(robotmap..driverController.getRightX());

}
}
