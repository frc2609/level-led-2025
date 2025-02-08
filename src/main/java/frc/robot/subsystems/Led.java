package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import java.lang.Math;

public class Led extends SubsystemBase {
  /** Creates a new ExampleSubsystem. **/

  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;
  private double index;

  private static final int LENGTH = 100;

  public Led() {
    // Init variables here
    m_led = new AddressableLED(9);
    m_ledBuffer = new AddressableLEDBuffer(LENGTH); //265    m_led.setLength(m_ledBuffer.getLength());
    index = 0;
    
    m_led.setLength(m_ledBuffer.getLength());
    m_led.setData(m_ledBuffer);
    m_led.start();
  }

  public void elevatorlvl4() {
    // For every pixel
    int segment_size = (LENGTH/5);
    for (var j = 0; j < segment_size-1; j+=1) {
    System.out.println("j:" + j); 
    m_ledBuffer.setHSV((4*segment_size)+j, 60, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV(j, 0, 255, 32);
    }

    m_ledBuffer.setHSV((segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), 30, 255, 32);
    
    m_led.setData(m_ledBuffer);
     
  }
  public void elevatorlvl3() {
    // For every pixel
    int segment_size = (LENGTH/5);
    for (var j = 0; j < segment_size-1; j+=1) {
    System.out.println("j:" + j); 
    
    m_ledBuffer.setHSV((4*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, 60, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV(j, 0, 255, 32);
    }
    m_ledBuffer.setHSV((segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), 30, 255, 32);
    
    m_led.setData(m_ledBuffer);
     
  }
  public void elevatorlvl2() {
    // For every pixel
    int segment_size = (LENGTH/5);
    for (var j = 0; j < segment_size-1; j+=1) {
    System.out.println("j:" + j); 
    
    m_ledBuffer.setHSV((4*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, 60, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV(j, 0, 255, 32);
    }
    m_ledBuffer.setHSV((segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), 30, 255, 32);
    
    m_led.setData(m_ledBuffer);
     
  }
  public void elevatorlvl1() {
    // For every pixel
    int segment_size = (LENGTH/5);
    for (var j = 0; j < segment_size-1; j+=1) {
    System.out.println("j:" + j); 
    
    m_ledBuffer.setHSV((4*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, 60, 255, 32);
    m_ledBuffer.setHSV(j, 0, 255, 32);
    }
    m_ledBuffer.setHSV((segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), 30, 255, 32);
    
    m_led.setData(m_ledBuffer);
     
  }
  public void NoCoral() {
    // For every pixel
    int segment_size = (LENGTH/5);
    for (var j = 0; j < segment_size-1; j+=1) {
      System.out.println("j:" + j); 
    m_ledBuffer.setHSV((4*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((3*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((2*segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV((segment_size)+j, 0, 255, 32);
    m_ledBuffer.setHSV(j, 60, 255, 32);
}
    m_ledBuffer.setHSV((segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((2*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((3*segment_size), 30, 255, 32);
    m_ledBuffer.setHSV((4*segment_size), 30, 255, 32);

m_led.setData(m_ledBuffer);
  }
}
