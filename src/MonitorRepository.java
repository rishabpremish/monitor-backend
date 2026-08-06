import java.sql.*;

public class MonitorRepository {
   private String url = System.getenv("MYSQL_URL");
   private String username = System.getenv("MYSQL_USER");
   private String password = System.getenv("MYSQL_PASSWORD");

   public void createMonitor(Monitor monitor) throws SQLException {
      String sql = """
                  INSERT INTO monitor_catalog (
                  brand, model_number, screen_size, resolution_width, resolution_height, refresh_rate, panel_type)
                  VALUES(?, ?, ?, ?, ?, ?, ?)
            """;

      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setString(1, monitor.getBrand());
         ps.setString(2, monitor.getModelNumber());
         ps.setDouble(3, monitor.getScreenSize());
         ps.setInt(4, monitor.getResolutionWidth());
         ps.setInt(5, monitor.getResolutionHeight());
         ps.setInt(6, monitor.getRefreshRate());
         ps.setString(7, monitor.getPanelType());
         ps.executeUpdate();
         System.out.println("Monitor sucessfully added!");
      }
   }
}
