// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.NoCoralLed;
import frc.robot.commands.Lvl1Led;
import frc.robot.commands.Lvl2Led;
import frc.robot.commands.Lvl3Led;
import frc.robot.commands.Lvl4Led;
import frc.robot.commands.L2AlgaeLed;
import frc.robot.commands.L3AlgaeLed;
import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final Led led = new Led();
  
  //private final BigRedButton vex_button = new BigRedButton();
  //private final Time m_time = new Time();
  
  //private final restart timer = new restart(m_time);
  private final Lvl4Led lvl4command = new Lvl4Led(led);
  private final Lvl3Led lvl3command = new Lvl3Led(led);
  private final Lvl2Led lvl2command = new Lvl2Led(led);
  private final Lvl1Led lvl1command = new Lvl1Led(led);
  private final L3AlgaeLed l3algaecommand = new L3AlgaeLed(led);
  private final L2AlgaeLed l2algaecommand = new L2AlgaeLed(led);
  private final NoCoralLed nocoralcommand = new NoCoralLed(led);
  
  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    configureDefaultCommands();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    m_driverController.y().onTrue(lvl4command);
    m_driverController.x().onTrue(lvl3command);
    m_driverController.b().onTrue(lvl2command);
    m_driverController.a().onTrue(lvl1command);
    
    // Algae commands on right stick buttons
    m_driverController.povUp().onTrue(l3algaecommand);
    m_driverController.povDown().onTrue(l2algaecommand);
  }

  private void configureDefaultCommands() {
    led.setDefaultCommand(nocoralcommand);
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return nocoralcommand;
  }
}
