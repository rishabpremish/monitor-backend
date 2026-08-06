import java.sql.*;
import java.util.*;

public class App {
        public static void main(String[] args) throws Exception {

                // Monitor monitor2 = new Monitor("Apple", "Studio Display", 27.0, 5120, 2880,
                // 60, "IPS");
                MonitorRepository mr = new MonitorRepository();
                // mr.createMonitor(monitor2);

                ArrayList<Monitor> monitors = mr.getAllMonitors();
                for (Monitor monitor : monitors) {
                        System.out.println(monitor);
                        System.out.println();
                }
                ArrayList<Monitor> monitorById = mr.getMonitorById(1);
                for (Monitor monitor : monitorById) {
                        System.out.println(monitor);
                }

                // mr.deleteMonitorById(2);

                // Retailer createdRetailer = new Retailer("Best Buy", "bestbuy.com");
                RetailerRepository rr = new RetailerRepository();
                // rr.createRetailer(createdRetailer);
                System.out.println("---ALL RETAILERS---");
                ArrayList<Retailer> retailers = rr.getAllRetailers();
                for (Retailer retailer : retailers) {
                        System.out.println(retailer);
                }
                System.out.println("---RETAILERS BY ID---");
                ArrayList<Retailer> retailerById = rr.getRetailerById(1);
                for (Retailer retailer : retailerById) {
                        System.out.println(retailer);
                }

                MonitorOfferRepository mor = new MonitorOfferRepository();
                // MonitorOffer createdOffer = new MonitorOffer(3,
                // 2,
                // 1599,
                // "https://www.bestbuy.com/product/apple-studio-display-standard-glass-tilt-adjustable-stand-silver/JJGCQLL4HF/sku/6595378?utm_source=feed&extStoreId=&ref=212&loc=23297235074&gclsrc=aw.ds&gad_source=1&gad_campaignid=23297238914&gbraid=0AAAAAD-ORIjmQz-l9taBm5XFVxjZcrTiI&gclid=CjwKCAjw4dDTBhAqEiwAkHYmSh6zF7gIEyvgfOQYDDIauHbuPuQjuTI0JBhv7-4nzU6IrIoT2Lj57hoCzWwQAvD_BwE",
                // true);
                // mor.createMonitorOffer(createdOffer);
                System.out.println("---ALL MONITOR OFFERS---");
                ArrayList<MonitorOffer> monitorOffers = mor.getAllMonitorOffers();
                for (MonitorOffer offer : monitorOffers) {
                        System.out.println(offer);
                }
                System.out.println("---MONITOR OFFERS BY ID---");
                ArrayList<MonitorOffer> monitorOfferById = mor.getMonitorOfferById(1);
                for (MonitorOffer offer : monitorOfferById) {
                        System.out.println(offer);
                }
        }
}