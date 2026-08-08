package com.example.monitor;

public class Monitor {
   private Integer monitorId;
   private String brand;
   private String modelNumber;
   private Double screenSize;
   private Integer resolutionWidth;
   private Integer resolutionHeight;
   private Integer refreshRate;
   private String panelType;
   private String aspectRatio;

   public Monitor() {
   }

   public Monitor(
         String brand,
         String modelNumber,
         Double screenSize,
         Integer resolutionWidth,
         Integer resolutionHeight,
         Integer refreshRate,
         String panelType,
         String aspectRatio) {

      this.brand = brand;
      this.modelNumber = modelNumber;
      this.screenSize = screenSize;
      this.resolutionWidth = resolutionWidth;
      this.resolutionHeight = resolutionHeight;
      this.refreshRate = refreshRate;
      this.panelType = panelType;
      this.aspectRatio = aspectRatio;

   }

   // Constructor for retrieving monitor
   public Monitor(
         Integer monitorId,
         String brand,
         String modelNumber,
         Double screenSize,
         Integer resolutionWidth,
         Integer resolutionHeight,
         Integer refreshRate,
         String panelType,
         String aspectRatio) {

      this.monitorId = monitorId;
      this.brand = brand;
      this.modelNumber = modelNumber;
      this.screenSize = screenSize;
      this.resolutionWidth = resolutionWidth;
      this.resolutionHeight = resolutionHeight;
      this.refreshRate = refreshRate;
      this.panelType = panelType;
      this.aspectRatio = aspectRatio;

   }

   // Get Methods
   public Integer getMonitorId() {
      return monitorId;
   }

   public String getBrand() {
      return brand;
   }

   public String getModelNumber() {
      return modelNumber;
   }

   public Double getScreenSize() {
      return screenSize;
   }

   public Integer getResolutionWidth() {
      return resolutionWidth;
   }

   public Integer getResolutionHeight() {
      return resolutionHeight;
   }

   public Integer getRefreshRate() {
      return refreshRate;
   }

   public String getPanelType() {
      return panelType;
   }

   public String getAspectRatio() {
      return aspectRatio;
   }

   // Set Methods
   public void setBrand(String brand) {
      this.brand = brand;
   }

   public void setModelNumber(String modelNumber) {
      this.modelNumber = modelNumber;
   }

   public void setScreenSize(Double screenSize) {
      this.screenSize = screenSize;
   }

   public void setResolutionWidth(Integer resolutionWidth) {
      this.resolutionWidth = resolutionWidth;
   }

   public void setResolutionHeight(Integer resolutionHeight) {
      this.resolutionHeight = resolutionHeight;
   }

   public void setRefreshRate(Integer refreshRate) {
      this.refreshRate = refreshRate;
   }

   public void setPanelType(String panelType) {
      this.panelType = panelType;
   }

   public void setAspectRatio(String aspectRatio) {
      this.aspectRatio = aspectRatio;
   }

   @Override
   public String toString() {
      return "Monitor ID: " + monitorId + "\n"
            + "Brand: " + brand + "\n"
            + "Model Number: " + modelNumber + "\n"
            + "Screen size: " + screenSize + "\n"
            + "Resolution: " + resolutionWidth + " x " + resolutionHeight + "\n"
            + "Refresh Rate: " + refreshRate + "\n"
            + "Panel Type: " + panelType + "\n"
            + "Aspect Ratio: " + aspectRatio;
   }
}
