package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** Command for level 2 algae LED pattern */
public class L2AlgaeLed extends Command {

  private final Led led;

  /**
   * Creates a new L2AlgaeLed command.
   *
   * @param L2AlgaeLed The LED subsystem used by this command.
   */
  public L2AlgaeLed(Led L2AlgaeLed) {
    this.led = L2AlgaeLed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(L2AlgaeLed);
  }

  @Override
  public void execute() {
    led.l2algae();
    led.Coral();
  }

  public boolean isFinished() {
    return false;
  }
} 