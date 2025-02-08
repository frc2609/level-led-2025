// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import frc.robot.commands.EStop;


public class TankDrive extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  final SparkMax m_leftMotor = new SparkMax(15, MotorType.kBrushless);
    final SparkMax m_rightMotor = new SparkMax(2, MotorType.kBrushless);
    final XboxController m_driverController = new XboxController(0);
    final DifferentialDrive m_robotDrive =
    new DifferentialDrive(m_leftMotor::set, m_rightMotor::set);
    SparkMaxConfig config = new SparkMaxConfig();

  public TankDrive() {
    config
    .inverted(true);

    SendableRegistry.addChild(m_robotDrive, m_leftMotor);
    SendableRegistry.addChild(m_robotDrive, m_rightMotor);
    m_rightMotor.configure(config, null, null);
  }
  public void e_stop() {
    m_robotDrive.tankDrive(0, 0);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  
  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
    m_robotDrive.tankDrive(.5*(m_driverController.getLeftY()), .5*(m_driverController.getRightY()));
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

}
