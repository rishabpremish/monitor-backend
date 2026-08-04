public class App {
        public static void main(String[] args) throws Exception {
                Monitor monitor1 = new Monitor(
                                "Dell",
                                "S2725QC",
                                27.0,
                                3840,
                                2160,
                                120,
                                "IPS");
                // System.out.println(monitor1.toString());
                databaseManager.insertMonitor(monitor1);

                MonitorOffer dellOffer = new MonitorOffer(
                                monitor1,
                                "Dell",
                                299.99,
                                "https://www.dell.com/en-us/shop/dell-27-plus-4k-usb-c-monitor-s2725qc/apd/210-brnc/monitors-monitor-accessories",
                                true);
                // System.out.println(dellOffer.toString());

                MonitorOffer amazonOffer = new MonitorOffer(
                                monitor1,
                                "Amazon",
                                299.99,
                                "https://www.amazon.com/...",
                                true);
                // System.out.println(amazonOffer.toString());
                databaseManager.printAllMonitors();
        }
}
