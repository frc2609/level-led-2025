package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class Lvl4Led extends Command {

  private final Led led;
  /**
   * Creates a new RainbowLed.
   *
   * @param Lvl4Led The subsystem used by this command.
   * @param coral
   */
  public Lvl4Led(Led Lvl4Led) {
    this.led = Lvl4Led;
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Lvl4Led);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  @Override
  public void execute() {
    led.elevatorlvl4();
    led.Coral();
  }

  public boolean isFinished() {
    return false;
  }
}

