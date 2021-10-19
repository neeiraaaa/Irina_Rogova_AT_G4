package project.water;

import project.interfaces.Transformable;

public abstract class Water implements Transformable {

   private String waterColor = "no";
   private String waterTransparency = "transparent";
   private String waterSmell = "no";
   private int waterTemperature = 0;


   public String getWaterColor() {
      return waterColor;
   }

   public void setWaterColor(String waterColor) {
      this.waterColor = waterColor;
   }

   public String getWaterTransparency() {
      return waterTransparency;
   }

   public void setWaterTransparency(String waterTransparency) {
      this.waterTransparency = waterTransparency;
   }

   public String getWaterSmell() {
      return waterSmell;
   }

   public void setWaterSmell(String waterSmell) {
      this.waterSmell = waterSmell;
   }

   public int getWaterTemperature() {
      return waterTemperature;
   }

   public void setWaterTemperature(int waterTemperature) {
      this.waterTemperature = waterTemperature;
   }
}
