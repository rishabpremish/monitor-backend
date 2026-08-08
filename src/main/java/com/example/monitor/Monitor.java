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
   private Double brightness;
   private Double responseTime;
   private Integer contrastRatio;
   private String hdrSupport;
   private String connectivity;
   private Boolean vesaMount;
   private String vesaPattern;
   private Double width;
   private Double height;
   private Double depth;
   private Double weight;
   private Integer modelYear;
   private String features;

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
         String aspectRatio,
         Double brightness,
         Double responseTime,
         Integer contrastRatio,
         String hdrSupport,
         String connectivity,
         Boolean vesaMount,
         String vesaPattern,
         Double width,
         Double height,
         Double depth,
         Double weight,
         Integer modelYear,
         String features) {

      this.brand = brand;
      this.modelNumber = modelNumber;
      this.screenSize = screenSize;
      this.resolutionWidth = resolutionWidth;
      this.resolutionHeight = resolutionHeight;
      this.refreshRate = refreshRate;
      this.panelType = panelType;
      this.aspectRatio = aspectRatio;
      this.brightness = brightness;
      this.responseTime = responseTime;
      this.contrastRatio = contrastRatio;
      this.hdrSupport = hdrSupport;
      this.connectivity = connectivity;
      this.vesaMount = vesaMount;
      this.vesaPattern = vesaPattern;
      this.width = width;
      this.height = height;
      this.depth = depth;
      this.weight = weight;
      this.modelYear = modelYear;
      this.features = features;

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
         String aspectRatio,
         Double brightness,
         Double responseTime,
         Integer contrastRatio,
         String hdrSupport,
         String connectivity,
         Boolean vesaMount,
         String vesaPattern,
         Double width,
         Double height,
         Double depth,
         Double weight,
         Integer modelYear,
         String features) {

      this.monitorId = monitorId;
      this.brand = brand;
      this.modelNumber = modelNumber;
      this.screenSize = screenSize;
      this.resolutionWidth = resolutionWidth;
      this.resolutionHeight = resolutionHeight;
      this.refreshRate = refreshRate;
      this.panelType = panelType;
      this.aspectRatio = aspectRatio;
      this.brightness = brightness;
      this.responseTime = responseTime;
      this.contrastRatio = contrastRatio;
      this.hdrSupport = hdrSupport;
      this.connectivity = connectivity;
      this.vesaMount = vesaMount;
      this.vesaPattern = vesaPattern;
      this.width = width;
      this.height = height;
      this.depth = depth;
      this.weight = weight;
      this.modelYear = modelYear;
      this.features = features;

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

   public Double getBrightness() {
      return brightness;
   }

   public Double getResponseTime() {
      return responseTime;
   }

   public Integer getContrastRatio() {
      return contrastRatio;
   }

   public String getHdrSupport() {
      return hdrSupport;
   }

   public String getConnectivity() {
      return connectivity;
   }

   public Boolean getVesaMount() {
      return vesaMount;
   }

   public String getVesaPattern() {
      return vesaPattern;
   }

   public Double getWidth() {
      return width;
   }

   public Double getHeight() {
      return height;
   }

   public Double getDepth() {
      return depth;
   }

   public Double getWeight() {
      return weight;
   }

   public Integer getModelYear() {
      return modelYear;
   }

   public String getFeatures() {
      return features;
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

   public void setBrightness(Double brightness) {
      this.brightness = brightness;
   }

   public void setResponseTime(Double responseTime) {
      this.responseTime = responseTime;
   }

   public void setContrastRatio(Integer contrastRatio) {
      this.contrastRatio = contrastRatio;
   }

   public void setHdrSupport(String hdrSupport) {
      this.hdrSupport = hdrSupport;
   }

   public void setConnectivity(String connectivity) {
      this.connectivity = connectivity;
   }

   public void setVesaMount(Boolean vesaMount) {
      this.vesaMount = vesaMount;
   }

   public void setVesaPattern(String vesaPattern) {
      this.vesaPattern = vesaPattern;
   }

   public void setWidth(Double width) {
      this.width = width;
   }

   public void setHeight(Double height) {
      this.height = height;
   }

   public void setDepth(Double depth) {
      this.depth = depth;
   }

   public void setWeight(Double weight) {
      this.weight = weight;
   }

   public void setModelYear(Integer modelYear) {
      this.modelYear = modelYear;
   }

   public void setFeatures(String features) {
      this.features = features;
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
            + "Aspect Ratio: " + aspectRatio + "\n"
            + "Brightness: " + brightness + "\n"
            + "Response Time: " + responseTime + "\n"
            + "Contrast Ratio: " + contrastRatio + "\n"
            + "HDR Support: " + hdrSupport + "\n"
            + "Connectivity: " + connectivity + "\n"
            + "VESA Mount: " + vesaMount + "\n"
            + "VESA Pattern: " + vesaPattern + "\n"
            + "Width: " + width + "\n"
            + "Height: " + height + "\n"
            + "Depth: " + depth + "\n"
            + "Weight: " + weight + "\n"
            + "Model Year: " + modelYear + "\n"
            + "Features:" + features;
   }
}
