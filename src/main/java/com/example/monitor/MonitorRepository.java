package com.example.monitor;

import java.sql.*;
import java.util.ArrayList;

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
         System.out.println("Monitor successfully added!");
      }
   }

   public ArrayList<Monitor> getAllMonitors() throws SQLException {
      String sql = """
            SELECT * FROM monitor_catalog
            """;
      ArrayList<Monitor> monitors = new ArrayList<>();
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();) {

         while (rs.next()) {
            Monitor monitor = new Monitor(
                  rs.getInt("monitor_id"),
                  rs.getString("brand"),
                  rs.getString("model_number"),
                  rs.getDouble("screen_size"),
                  rs.getInt("resolution_width"),
                  rs.getInt("resolution_height"),
                  rs.getInt("refresh_rate"),
                  rs.getString("panel_type"));
            monitors.add(monitor);
         }
      }
      return monitors;
   }

   public ArrayList<Monitor> getMonitorById(int id) throws SQLException {
      String sql = """
            SELECT * FROM monitor_catalog mc
            WHERE mc.monitor_id = ?
            """;
      ArrayList<Monitor> monitors = new ArrayList<>();
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);) {
         ps.setInt(1, id);
         try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
               Monitor monitor = new Monitor(
                     rs.getInt("monitor_id"),
                     rs.getString("brand"),
                     rs.getString("model_number"),
                     rs.getDouble("screen_size"),
                     rs.getInt("resolution_width"),
                     rs.getInt("resolution_height"),
                     rs.getInt("refresh_rate"),
                     rs.getString("panel_type"));
               monitors.add(monitor);
            }
         }
         return monitors;
      }
   }

   public void deleteMonitorById(int id) throws SQLException {
      String sql = """
            DELETE
            FROM monitor_catalog
            WHERE monitor_id = ?
            """;
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);) {
         ps.setInt(1, id);
         ps.executeUpdate();
         System.out.println("Monitor successfully deleted!");
      }
   }
}
