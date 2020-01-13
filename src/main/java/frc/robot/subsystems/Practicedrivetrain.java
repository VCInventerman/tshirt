/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Practicedrivetrain extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */

  Spark Frontleftmotorone, Frontrightmotortwo, Backleftmotor, Backrightmotor; 
  MecanumDrive drive; 

  public void Practicedrivetrain() {
Frontleftmotorone = new Spark(4); 
Frontrightmotortwo = new Spark(5);
Backleftmotor = new Spark(7);
Backrightmotor = new Spark(6);
drive = new MecanumDrive(Frontleftmotorone, Frontrightmotortwo, Backleftmotor, Backrightmotor );
  }
 
  public void Drive(double sideVal, double rottateVal, double forwardVal){
    drive.driveCartesian(sideVal, rottateVal, forwardVal);
  }

  public void stop(){
    drive.driveCartesian(0, 0, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
