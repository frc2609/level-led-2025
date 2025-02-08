package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class Lvl2Led extends Command {

  private final Led led;

  /**
   * Creates a new RainbowLed.
   *
   * @param RedLed The subsystem used by this command.
   */
  public Lvl2Led(Led Lvl2Led) {
    this.led = Lvl2Led;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Lvl2Led);
  }

  @Override
  public void execute() {
    led.elevatorlvl2();
  }

  public boolean isFinished() {
    return false;
  }
}

