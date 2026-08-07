package com.example.monitor;

public class Monitor {
   private int monitorId;
   private String brand;
   private String modelNumber;
   private double screenSize;
   private int resolutionWidth;
   private int resolutionHeight;
   private int refreshRate;
   private String panelType;

   public Monitor(
         String brand,
         String modelNumber,
         double screenSize,
         int resolutionWidth,
         int resolutionHeight,
         int refreshRate,
         String panelType) {

      this.brand = brand;
      this.modelNumber = modelNumber;
      this.screenSize = screenSize;
      this.resolutionWidth = resolutionWidth;
      this.resolutionHeight = resolutionHeight;
      this.refreshRate = refreshRate;
      this.panelType = panelType;

   }

   // Constructor for retrieving monitor
   public Monitor(
         int monitorId,
         String brand,
         String modelNumber,
         double screenSize,
         int resolutionWidth,
         int resolutionHeight,
         int refreshRate,
         String panelType) {

      this.monitorId = monitorId;
      this.brand = brand;
      this.modelNumber = modelNumber;
      this.screenSize = screenSize;
      this.resolutionWidth = resolutionWidth;
      this.resolutionHeight = resolutionHeight;
      this.refreshRate = refreshRate;
      this.panelType = panelType;

   }

   // Get Methods
   public int getMonitorId() {
      return monitorId;
   }

   public String getBrand() {
      return brand;
   }

   public String getModelNumber() {
      return modelNumber;
   }

   public double getScreenSize() {
      return screenSize;
   }

   public int getResolutionWidth() {
      return resolutionWidth;
   }

   public int getResolutionHeight() {
      return resolutionHeight;
   }

   public int getRefreshRate() {
      return refreshRate;
   }

   public String getPanelType() {
      return panelType;
   }

   @Override
   public String toString() {
      return "Monitor ID: " + monitorId + "\n"
            + "Brand: " + brand + "\n"
            + "Model Number: " + modelNumber + "\n"
            + "Screen size: " + screenSize + "\n"
            + "Resolution: " + resolutionWidth + " x " + resolutionHeight + "\n"
            + "Refresh Rate: " + refreshRate + "\n"
            + "Panel Type: " + panelType;
   }
}
