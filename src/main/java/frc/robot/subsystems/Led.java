package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Led extends SubsystemBase {
  /** Creates a new ExampleSubsystem. **/

  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;
  DutyCycleEncoder encoderAngle = new DutyCycleEncoder(0);
  final int seperation = 30;//led hue
  final int not_selected = 0;//led hue
  final int in_position = 60;//led hue
  final int not_in_position = 90;//led hue
  int position = not_in_position;//led hue
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
    m_led = new AddressableLED(9);
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
    for (var j = 0; j < segment_size; j+=1) {
    //System.out.println("j:" + j);
    m_ledBuffer.setHSV((4*segment_size)+j, position, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV(j, not_selected, 255, 32);
    }

    m_ledBuffer.setHSV((segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), seperation, 255, 32);
    
    m_led.setData(m_ledBuffer);

    
     
  }
  public void elevatorlvl3() {
    // For every pixel
    if((encoderAngle.get()*360) >= lvl_3_Angle - threshold&& (encoderAngle.get()*360) <= lvl_3_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }
    for (var j = 0; j < segment_size; j+=1) {
    //System.out.println("j:" + j); 
    
    m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, position, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV(j, not_selected, 255, 32);
    }
    m_ledBuffer.setHSV((segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), seperation, 255, 32);
    
    m_led.setData(m_ledBuffer);
     
  }
  public void elevatorlvl2() {
    // For every pixel
    if((encoderAngle.get()*360) >= lvl_2_Angle - threshold&& (encoderAngle.get()*360) <= lvl_2_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }
    for (var j = 0; j < segment_size; j+=1) {
    //System.out.println("j:" + j); 
    
    m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, position, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV(j, not_selected, 255, 32);
    }
    m_ledBuffer.setHSV((segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), seperation, 255, 32);
    
    m_led.setData(m_ledBuffer);
     
  }
  public void elevatorlvl1() {
    // For every pixel
    if((encoderAngle.get()*360) >= lvl_1_Angle - threshold&& (encoderAngle.get()*360) <= lvl_1_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }
    for (var j = 0; j < segment_size; j+=1) {
    //System.out.println("j:" + j); 
    
    m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, position, 255, 32);
    m_ledBuffer.setHSV(j, not_selected, 255, 32);
    }
    m_ledBuffer.setHSV((segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), seperation, 255, 32);
    
    m_led.setData(m_ledBuffer);
     
  }
  public void NoCoral() {
    // For every pixel
    if((encoderAngle.get()*360) >= lvl_0_Angle - threshold&& (encoderAngle.get()*360) <= lvl_0_Angle + threshold) {
      position = in_position;
    } else {
      position = not_in_position;
    }
    for (var j = 0; j < segment_size; j+=1) {
      //System.out.println("j:" + j); 
    m_ledBuffer.setHSV((4*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, not_selected, 255, 32);
    m_ledBuffer.setHSV(j, position, 255, 32);
}
    m_ledBuffer.setHSV((segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), seperation, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), seperation, 255, 32);

m_led.setData(m_ledBuffer);
  }
}
