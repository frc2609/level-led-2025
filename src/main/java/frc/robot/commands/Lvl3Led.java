package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class Lvl3Led extends Command {

  private final Led led;

  /**
   * Creates a new RainbowLed.
   *
   * @param RedLed The subsystem used by this command.
   */
  public Lvl3Led(Led Lvl3Led) {
    this.led = Lvl3Led;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Lvl3Led
);
  }

  @Override
  public void execute() {
    led.elevatorlvl3();
  }

  public boolean isFinished() {
    return false;
  }
}

