package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants;


public class Led extends SubsystemBase {
  /** Creates a new ExampleSubsystem. **/
  CommandXboxController m_Controller = new CommandXboxController(0);

  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;
  private DutyCycleEncoder encoderAngle = new DutyCycleEncoder(0);
  private Trigger is_coral = m_Controller.leftBumper();

  final int not_selected = 0;//led hue
  final int in_position = 30;//led hue
  final int not_in_position = 90;//led hue
  final int algae_position = 120;//led hue - blue
  int position = not_in_position;//led hue
  int coral_in = not_in_position;//led hue
  private static final int LENGTH = 73;
  final int segment_size = (LENGTH/5);
  int lvl_4_Angle = 45;
  int lvl_3_Angle = 35;
  int lvl_2_Angle = 35;
  int lvl_1_Angle = 10;
  int lvl_0_Angle = 180;
  int threshold = 5;
  public Led() {
    // Init variables here
    SmartDashboard.putNumber("Encoder", 0);
    m_led = new AddressableLED(Constants.LedConstants.LED_STRIP_PORT);
    m_ledBuffer = new AddressableLEDBuffer(LENGTH);     

    m_led.setLength(m_ledBuffer.getLength());
    m_led.setData(m_ledBuffer);
    m_led.start();
    
    
  }

  public void elevatorlvl4() {
        // For every pixel
    if((encoderAngle.get()*360) >= lvl_4_Angle - threshold&& (encoderAngle.get()*360) <= lvl_4_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }

    // Calculate separator positions
    int sep1 = segment_size;
    int sep2 = 2 * segment_size;
    int sep3 = 3 * segment_size;
    int sep4 = 4 * segment_size;
    
    // Set the segments
    for (var j = 0; j < segment_size; j+=1) {
      m_ledBuffer.setHSV((4*segment_size)+j, position, 255, 32);
      m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    }

    // Set separator LEDs
    m_ledBuffer.setRGB(sep1, 0, 0, 0);
    m_ledBuffer.setRGB(sep2, 0, 0, 0);
    m_ledBuffer.setRGB(sep3, 0, 0, 0);
    m_ledBuffer.setRGB(sep4, 0, 0, 0);
    
    m_led.setData(m_ledBuffer);
  }
  public void elevatorlvl3() {
    if ((encoderAngle.get()*360) >= lvl_3_Angle - threshold && 
        (encoderAngle.get()*360) <= lvl_3_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }

    // Calculate separator positions
    int sep1 = segment_size;
    int sep2 = 2 * segment_size;
    int sep3 = 3 * segment_size;
    int sep4 = 4 * segment_size;
    
    // Set the segments
    for (var j = 0; j < segment_size; j++) {
      m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((3*segment_size)+j, position, 255, 32);
      m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    }

    // Set separator LEDs
    m_ledBuffer.setRGB(sep1, 0, 0, 0);
    m_ledBuffer.setRGB(sep2, 0, 0, 0);
    m_ledBuffer.setRGB(sep3, 0, 0, 0);
    m_ledBuffer.setRGB(sep4, 0, 0, 0);
    
    m_led.setData(m_ledBuffer);
  }

  public void elevatorlvl2() {
    if ((encoderAngle.get()*360) >= lvl_2_Angle - threshold && 
        (encoderAngle.get()*360) <= lvl_2_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }

    // Calculate separator positions
    int sep1 = segment_size;
    int sep2 = 2 * segment_size;
    int sep3 = 3 * segment_size;
    int sep4 = 4 * segment_size;
    
    // Set the segments
    for (var j = 0; j < segment_size; j++) {
      m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((2*segment_size)+j, position, 255, 32);
      m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    }

    // Set separator LEDs
    m_ledBuffer.setRGB(sep1, 0, 0, 0);
    m_ledBuffer.setRGB(sep2, 0, 0, 0);
    m_ledBuffer.setRGB(sep3, 0, 0, 0);
    m_ledBuffer.setRGB(sep4, 0, 0, 0);
    
    m_led.setData(m_ledBuffer);
  }

  public void elevatorlvl1() {
    if ((encoderAngle.get()*360) >= lvl_1_Angle - threshold && 
        (encoderAngle.get()*360) <= lvl_1_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }

    // Calculate separator positions
    int sep1 = segment_size;
    int sep2 = 2 * segment_size;
    int sep3 = 3 * segment_size;
    int sep4 = 4 * segment_size;
    
    // Set the segments
    for (var j = 0; j < segment_size; j++) {
      m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((segment_size)+j, position, 255, 32);
    }

    // Set separator LEDs
    m_ledBuffer.setRGB(sep1, 0, 0, 0);
    m_ledBuffer.setRGB(sep2, 0, 0, 0);
    m_ledBuffer.setRGB(sep3, 0, 0, 0);
    m_ledBuffer.setRGB(sep4, 0, 0, 0);
    
    m_led.setData(m_ledBuffer);
  }

  public void Coral() {
    if (is_coral.getAsBoolean()) {
      coral_in = in_position;
    } else {
      coral_in = not_in_position;
    } 

    for (var j = 0; j < segment_size; j++) {
      m_ledBuffer.setHSV(j, coral_in, 255, 32);
    }

    m_led.setData(m_ledBuffer);
    SmartDashboard.putNumber("Encoder", encoderAngle.get() * 360);
  }

  public void l3algae() {
    if ((encoderAngle.get()*360) >= lvl_3_Angle - threshold && 
        (encoderAngle.get()*360) <= lvl_3_Angle + threshold) {
      position = algae_position;
    } else {
      position = not_in_position;
    }

    // Calculate separator positions
    int sep1 = segment_size;
    int sep2 = 2 * segment_size;
    int sep3 = 3 * segment_size;
    int sep4 = 4 * segment_size;
    
    // Set the segments
    for (var j = 0; j < segment_size; j++) {
      m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((3*segment_size)+j, 120, 255, 32);
      m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    }

    // Set separator LEDs
    m_ledBuffer.setRGB(sep1, 0, 0, 0);
    m_ledBuffer.setRGB(sep2, 0, 0, 0);
    m_ledBuffer.setRGB(sep3, 0, 0, 0);
    m_ledBuffer.setRGB(sep4, 0, 0, 0);
    
    m_led.setData(m_ledBuffer);
  }

  public void l2algae() {
    if ((encoderAngle.get()*360) >= lvl_2_Angle - threshold && 
        (encoderAngle.get()*360) <= lvl_2_Angle + threshold) {
      position = algae_position;
    } else {
      position = not_in_position;
    }

    // Calculate separator positions
    int sep1 = segment_size;
    int sep2 = 2 * segment_size;
    int sep3 = 3 * segment_size;
    int sep4 = 4 * segment_size;
    
    // Set the segments
    for (var j = 0; j < segment_size; j++) {
      m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
      m_ledBuffer.setHSV((2*segment_size)+j, 120, 255, 32);
      m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    }

    // Set separator LEDs
    m_ledBuffer.setRGB(sep1, 0, 0, 0);
    m_ledBuffer.setRGB(sep2, 0, 0, 0);
    m_ledBuffer.setRGB(sep3, 0, 0, 0);
    m_ledBuffer.setRGB(sep4, 0, 0, 0);
    
    m_led.setData(m_ledBuffer);
  }
}
