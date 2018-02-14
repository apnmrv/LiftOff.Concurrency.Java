/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liftoff;

// Demonstration of the Runnable interface. 
public class LiftOff implements Runnable { 
  protected int countDown = 10; // Default 
  private static int taskCount = 0; 
  private final int id = taskCount++; 
  public LiftOff() {} 
  public LiftOff(int countDown) { 
    this.countDown = countDown; 
  } 
  public String status() { 
    return "#" + id + "(" + 
      (countDown > 0 ? countDown : "Liftoff!") + "), "; 
  } 
  @Override
  public void run() { 
    while(countDown-- > 0) { 
      System.out.println(status()); 
      Thread.yield(); 
    } 
  } 
} ///:~ 
