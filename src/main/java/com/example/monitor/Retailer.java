package com.example.monitor;

public class Retailer {
   private int retailerId;
   private String name;
   private String website;

   public Retailer(String name, String website) {
      this.name = name;
      this.website = website;
   }

   // Constructor for retrieving retailer
   public Retailer(int retailerId, String name, String website) {
      this.retailerId = retailerId;
      this.name = name;
      this.website = website;
   }

   // Get methods
   public int getRetailerId() {
      return retailerId;
   }

   public String getName() {
      return name;
   }

   public String getWebsite() {
      return website;
   }

   @Override
   public String toString() {
      return "Retailer ID: " + retailerId + "\n"
            + "Name: " + name + "\n"
            + "Website: " + website;
   }
}
