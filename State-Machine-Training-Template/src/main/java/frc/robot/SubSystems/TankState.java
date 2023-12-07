// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.SubSystems;

import frc.robot.RobotMap;

import frc.robot.lib.Interfaces.TankDrive;
import frc.robot.lib.statemachine.State;

/** Add your docs here. */
public class TankState extends State{

    @Override
    public void build () {}

    @Override
    public void init(State prevState){}

    @Override
    public void execute(){

        double trottle = RobotMap.tankDrive.setDeadBand(RobotMap.driverController.getLeftY());
        double rotate = RobotMap.tankDrive.setDeadBand(RobotMap.drivercontroller.getRightX());

        RobotMap.tankDrive.Drive(trottle, rotate);
    }


    }

