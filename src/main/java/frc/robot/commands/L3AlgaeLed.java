package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** Command for level 3 algae LED pattern */
public class L3AlgaeLed extends Command {

  private final Led led;

  /**
   * Creates a new L3AlgaeLed command.
   *
   * @param L3AlgaeLed The LED subsystem used by this command.
   */
  public L3AlgaeLed(Led L3AlgaeLed) {
    this.led = L3AlgaeLed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(L3AlgaeLed);
  }

  @Override
  public void execute() {
    led.l3algae();
    led.Coral();
  }

  public boolean isFinished() {
    return false;
  }
} 