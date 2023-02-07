public class Burner
{
  private double diameter = 0;
  private double maxTemp = 0;
  private double minTemp = 0;
  private boolean isHot = false;
  
  public Burner(double maxTemp, double minTemp, double diameter, double isHot)
  {
    maxTemp = this.maxTemp;
    minTemp = this.minTemp;
    diameter = this.diameter;
    isHot = this.isHot;
  }
  
  public boolean turnOn()
  {
    return true;
  }
  
  public boolean turnOff()
  {
    return true;
  }
  
  public void increaseTemp()
  {
  
  }
  
  public void decreaseTemp()
  {
  
  }
  
  public double getDiameter()
  {
    return diameter;
  }
  
  public double getMaxTemp()
  {
    return maxTemp;
  }
  
  public double getMinTemp()
  {
    return minTemp;
  }
  
  public boolean isHot()
  {
    return hot;
  }
}
