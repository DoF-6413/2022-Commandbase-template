// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Encoder;

/**
 * This is a demo program showing the use of the DifferentialDrive class. Runs the motors with
 * arcade steering.
 */
public class Robot extends TimedRobot {
  //Motor & Control
private final WPI_VictorSPX m_leftMotor = new WPI_VictorSPX(5);
private final WPI_VictorSPX m_rightMotor = new WPI_VictorSPX(3);
private final WPI_VictorSPX m_leftfollow = new WPI_VictorSPX(2);
private final WPI_VictorSPX m_rightfollow = new WPI_VictorSPX(4);

/*private final WPI_TalonSRX m_TopIntakeMotor1 = new WPI_TalonSRX(6); // gray
private final WPI_TalonSRX m_BottomIntakeMotor2 = new WPI_TalonSRX(8); // pink :)
private final WPI_TalonSRX m_ShooterLeft = new WPI_TalonSRX(7); // green 
private final WPI_TalonSRX m_ShooterRight = new WPI_TalonSRX(9);
*/

private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
private final Joystick m_Extreme0 = new Joystick(0); //Left : shooter
private final Joystick  m_Extreme1 = new Joystick(1); //Right : intake


private Encoder m_encoder1 = new Encoder(0, 1);
private Encoder m_encoder2 = new Encoder(2, 3);


  @Override
  public void robotInit() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
   // m_rightMotor.setInverted(true);
    m_leftfollow.follow(m_leftMotor);
    m_rightfollow.follow(m_rightMotor);

    // Use SetDistancePerPulse to set the multiplier for GetDistance
    // This is set up assuming a 6 inch wheel with a 360 CPR encoder.

    m_encoder1.setDistancePerPulse((Math.PI * 6) / 360.0);
    m_encoder2.setDistancePerPulse((Math.PI * 6) / 360.0); 
  }

  @Override
  public void teleopPeriodic() {
    // Drive with arcade drive.
    double forward = ( m_Extreme1.getX() );
    double rotation =( m_Extreme0.getY() );
    m_robotDrive.arcadeDrive(forward, rotation);
    // That means that the Y axis drives forward
    // and backward, and the X turns left and right.
  }
}
