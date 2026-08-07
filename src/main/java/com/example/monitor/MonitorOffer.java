package com.example.monitor;

public class MonitorOffer {
   private int offerId;
   private int monitorId;
   private int retailerId;
   private double price;
   private String productUrl;
   private boolean inStock;

   public MonitorOffer(
         int monitorId,
         int retailerId,
         double price,
         String productUrl,
         boolean inStock) {
      this.monitorId = monitorId;
      this.retailerId = retailerId;
      this.price = price;
      this.productUrl = productUrl;
      this.inStock = inStock;
   }

   // Constructor for retrieving offer
   public MonitorOffer(
         int offerId,
         int monitorId,
         int retailerId,
         double price,
         String productUrl,
         boolean inStock) {
      this.offerId = offerId;
      this.monitorId = monitorId;
      this.retailerId = retailerId;
      this.price = price;
      this.productUrl = productUrl;
      this.inStock = inStock;
   }

   // Get Methods
   public int getOfferId() {
      return offerId;
   }

   public int getMonitorId() {
      return monitorId;
   }

   public int getRetailerId() {
      return retailerId;
   }

   public double getPrice() {
      return price;
   }

   public String getProductUrl() {
      return productUrl;
   }

   public boolean getInStock() {
      return inStock;
   }

   @Override
   public String toString() {
      return "Offer ID: " + offerId
            + "\nMonitor ID: " + monitorId
            + "\nRetailer ID: " + retailerId
            + "\nPrice: $" + price
            + "\nProduct URL: " + productUrl
            + "\nStock: " + (inStock ? "In stock" : "Out of stock");
   }
}
