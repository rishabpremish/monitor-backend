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
        }
}