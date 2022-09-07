// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
// import frc.robot.commands.auto;
// import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Axis;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants.*;
import frc.robot.commands.*;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */


public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final SwerveDriveSubsystem swerveSubsystem = new SwerveDriveSubsystem();

  // private final Joystick driverJoytick = new Joystick(OIConstants.kDriverControllerPort);
  public final Joystick driverJoytick = new Joystick(OIConstants.kDriverControllerPort);

  public RobotContainer() {
    //todo: multiply each joystick value by max speed
    swerveSubsystem.setDefaultCommand(new SwerveJoystickCmd(
            swerveSubsystem,
            () -> -driverJoytick.getRawAxis(OIConstants.kDriverYAxis),
            () -> driverJoytick.getRawAxis(OIConstants.kDriverXAxis),
            () -> driverJoytick.getRawAxis(OIConstants.kDriverRotAxis),
            () -> !driverJoytick.getRawButton(OIConstants.kDriverFieldOrientedButtonIdx)));

    configureButtonBindings();
}

private void configureButtonBindings() {
  new JoystickButton(driverJoytick, 2).whenPressed(() -> swerveSubsystem.zeroHeading());
}


  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
 
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 // public Command getAutonomousCommand() {}
   }
