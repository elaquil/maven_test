package co.elaquil;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest 
{
  @Test
  public void doesAdd(){
    JenkinsCalculator calc = new JenkinsCalculator();
    assertEquals(10, calc.add(5, 5));
  }

  @Test
  public void doesSubtract(){
    JenkinsCalculator calc = new JenkinsCalculator();
    assertEquals(10, calc.subtract(15, 5));
  }
}
