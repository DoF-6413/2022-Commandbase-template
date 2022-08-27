// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive; 
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DriveTrain extends SubsystemBase {
  // Declare types for motors (does not need values)
  private WPI_VictorSPX leftLead;
  private WPI_VictorSPX rightLead;
  private WPI_VictorSPX rightFollow;
  private WPI_VictorSPX leftFollow;

  // private RelativeEncoder encoderLeftLead;
  // private RelativeEncoder encoderRightLead;

  private DifferentialDrive differentialDrive;


  /** Creates a new DriveTrain. */
  public DriveTrain() {
    leftLead = new WPI_VictorSPX(04);
    leftFollow = new WPI_VictorSPX(03);

    rightLead = new WPI_VictorSPX(02);
    rightFollow = new WPI_VictorSPX(05);

    // encoderRightLead = rightLead.getEncoder;
    // encoderLeftLead = leftLead.getEncoder;

    rightFollow.follow(rightLead);
    leftFollow.follow(leftLead);

    differentialDrive = new DifferentialDrive(rightLead,leftLead);
  }

  public void setRaw(double rightStick, double leftStick){
    differentialDrive.arcadeDrive(-(leftStick), rightStick);
  };

  @Override
  public void periodic() {

    // This method will be called once per scheduler run
  }
}
