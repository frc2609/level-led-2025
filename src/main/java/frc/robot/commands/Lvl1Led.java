package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class Lvl1Led extends Command {

  private final Led led;

  /**
   * Creates a new RainbowLed.
   *
   * @param RedLed The subsystem used by this command.
   */
  public Lvl1Led(Led Lvl1Led) {
    this.led = Lvl1Led;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Lvl1Led);
  }

  @Override
  public void execute() {
    led.elevatorlvl1();
    led.Coral();
  }

  public boolean isFinished() {
    return false;
  }
}

