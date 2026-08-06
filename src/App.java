import java.sql.*;
import java.util.*;

public class App {
        public static void main(String[] args) throws Exception {
                String sql = """
                                CREATE TABLE IF NOT EXISTS monitor_catalog (
                                monitor_id INT AUTO_INCREMENT PRIMARY KEY,
                                brand VARCHAR(255),
                                model_number VARCHAR(255),
                                screen_size DOUBLE,
                                resolution_width INT,
                                resolution_height INT,
                                refresh_rate INT,
                                panel_type VARCHAR(255)
                                );
                                """;
                String url = System.getenv("MYSQL_URL");
                String username = System.getenv("MYSQL_USER");
                String password = System.getenv("MYSQL_PASSWORD");
                try (Connection con = DriverManager.getConnection(url, username, password);
                                Statement st = con.createStatement()) {
                        st.executeUpdate(sql);
                }

                Monitor monitor2 = new Monitor("Apple", "Studio Display", 27.0, 5120, 2880,
                                60, "IPS");
                MonitorRepository mr = new MonitorRepository();
                mr.createMonitor(monitor2);

                ArrayList<Monitor> monitors = mr.getAllMonitors();
                for (Monitor monitor : monitors) {
                        System.out.println(monitor);
                        System.out.println();
                }
        }
}