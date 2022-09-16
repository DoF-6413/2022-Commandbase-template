// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import  edu.wpi.first.math.util.Units;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //need to update values
    public static final class ModuleConstants {
        public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
        public static final double kDriveMotorGearRatio = 6.75;
        public static final double kTurningMotorGearRatio = 6.75;
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
        //PID TUNING 
        public static final double kPTurning = 0;
    }

    // TODO: update contants
    public static final class DriveConstants {

        public static final double kTrackWidth = Units.inchesToMeters(27);
        // Distance between right and left wheels
        public static final double kWheelBase = Units.inchesToMeters(25.5);
        // Distance between front and back wheels
        public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2));

        //Motor Ports
        public static final int kFrontLeftDriveMotorPort = 4;
        public static final int kBackLeftDriveMotorPort = 2;
        public static final int kFrontRightDriveMotorPort = 6;
        public static final int kBackRightDriveMotorPort = 8;

        public static final int kFrontLeftTurningMotorPort = 3;
        public static final int kBackLeftTurningMotorPort = 1;
        public static final int kFrontRightTurningMotorPort = 5;
        public static final int kBackRightTurningMotorPort = 7;
        

        //CHECK THESE
        public static final boolean kFrontLeftTurningEncoderReversed = true;
        public static final boolean kBackLeftTurningEncoderReversed = true;
        public static final boolean kFrontRightTurningEncoderReversed = true;
        public static final boolean kBackRightTurningEncoderReversed = true;

        public static final boolean kFrontLeftDriveEncoderReversed = true;
        public static final boolean kBackLeftDriveEncoderReversed = true;
        public static final boolean kFrontRightDriveEncoderReversed = false;
        public static final boolean kBackRightDriveEncoderReversed = false;

        //CHECK ABOVE

        //ABSOLUTE ENCODER INFO
        public static final int kFrontLeftDriveAbsoluteEncoderPort = 9;
        public static final int kBackLeftDriveAbsoluteEncoderPort = 10;
        public static final int kFrontRightDriveAbsoluteEncoderPort = 11;
        public static final int kBackRightDriveAbsoluteEncoderPort = 12;

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false;
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = false;

        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = 2;
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = 0;
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = 0;
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = 0;

        //MAX SPEEDS7
        public static final double kPhysicalMaxSpeedMetersPerSecond = 5;
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;

        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = //
                kPhysicalMaxAngularSpeedRadiansPerSecond / 4;
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3;
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3;
    }
    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;

        public static final int kDriverYAxis = 1;
        public static final int kDriverXAxis = 0;
        public static final int kDriverRotAxis = 4;
        public static final int kDriverFieldOrientedButtonIdx = 1;

        public static final double kDeadband = 0.05;
    }
}
