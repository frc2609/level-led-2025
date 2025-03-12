package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class NoCoralLed extends Command {

  private final Led led;

  /**
   * Creates a new RainbowLed.
   *
   * @param NoCoralLed The subsystem used by this command.
   */
  public NoCoralLed(Led NoCoralLed) {
    this.led = NoCoralLed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(NoCoralLed);
  }

  @Override
  public void execute() {
    led.Coral();
  }

  public boolean isFinished() {
    return true;
  }
}

