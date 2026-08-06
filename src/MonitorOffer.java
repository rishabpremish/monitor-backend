public class MonitorOffer {
   private int monitorId;
   private String retailer;
   private double price;
   private String productUrl;
   private boolean inStock;

   public MonitorOffer(
         int monitorId,
         String retailer,
         double price,
         String productUrl,
         boolean inStock) {
      this.monitorId = monitorId;
      this.retailer = retailer;
      this.price = price;
      this.productUrl = productUrl;
      this.inStock = inStock;
   }

   // Get Methods
   public int getMonitorId() {
      return monitorId;
   }

   public String getRetailer() {
      return retailer;
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
      String stockStatus;

      if (inStock) {
         stockStatus = "In stock";
      } else {
         stockStatus = "Out of stock";
      }

      return retailer + " | $" + price + " | " + stockStatus;
   }
}
