// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.auto;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */


public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drivetrain m_driveTrainSubsytem = new Drivetrain();
  public Joystick m_lefJoystick = new Joystick(0);
  public Joystick m_righJoystick = new Joystick(1);

  public Joystick lefJoystick;
  public Joystick righJoystick;




  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    m_driveTrainSubsytem.setDefaultCommand(
      new RunCommand(()-> m_driveTrainSubsytem.setRaw(m_righJoystick.getRawAxis(1), m_lefJoystick.getRawAxis(0)), m_driveTrainSubsytem)
      

    );  

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 // public Command getAutonomousCommand() {
  // return new RunCommand(()-> m_driveTrainSubsytem.setRaw(-.4,0), m_driveTrainSubsytem)
  // .andThen(new WaitCommand(1)).
  // andThen(new RunCommand(()-> m_driveTrainSubsytem.setRaw(0,0), m_driveTrainSubsytem));
   }
// }
