public class MonitorOffer {
   private Monitor monitor;
   private String retailer;
   private double price;
   private String productUrl;
   private boolean inStock;

   public MonitorOffer(
         Monitor monitor,
         String retailer,
         double price,
         String productUrl,
         boolean inStock) {
      this.monitor = monitor;
      this.retailer = retailer;
      this.price = price;
      this.productUrl = productUrl;
      this.inStock = inStock;
   }

   // Get Methods
   public Monitor getMonitor() {
      return monitor;
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
