// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.Timer;

public class minnieAuto extends CommandBase {
  protected Timer m_timer = new Timer();
  private double m_duration;
  private Drivetrain m_drivetrain;
  /** Creates a new auto. */
  public minnieAuto() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivetrain);
  }
  // Juan and Irae were here

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_timer.reset();
    m_duration = 5;
    m_timer.start();
  }

    


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // m_drivetrain.setRaw(0, 0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_timer.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_timer.hasElapsed(m_duration);
    
  }
}
