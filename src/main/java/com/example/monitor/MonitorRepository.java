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
                  brand, model_number, screen_size, resolution_width, resolution_height, refresh_rate, panel_type, aspect_ratio,
                  brightness, response_time, contrast_ratio, hdr_support, connectivity, vesa_mount, vesa_pattern,
                  width, height, depth, weight, model_year, features)
                  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            """;

      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setString(1, monitor.getBrand());
         ps.setString(2, monitor.getModelNumber());
         ps.setObject(3, monitor.getScreenSize(), Types.DOUBLE);
         ps.setObject(4, monitor.getResolutionWidth(), Types.INTEGER);
         ps.setObject(5, monitor.getResolutionHeight(), Types.INTEGER);
         ps.setObject(6, monitor.getRefreshRate(), Types.INTEGER);
         ps.setString(7, monitor.getPanelType());
         ps.setString(8, monitor.getAspectRatio());
         ps.setObject(9, monitor.getBrightness(), Types.DOUBLE);
         ps.setObject(10, monitor.getResponseTime(), Types.DOUBLE);
         ps.setObject(11, monitor.getContrastRatio(), Types.INTEGER);
         ps.setString(12, monitor.getHdrSupport());
         ps.setString(13, monitor.getConnectivity());
         ps.setObject(14, monitor.getVesaMount(), Types.BOOLEAN);
         ps.setString(15, monitor.getVesaPattern());
         ps.setObject(16, monitor.getWidth(), Types.DOUBLE);
         ps.setObject(17, monitor.getHeight(), Types.DOUBLE);
         ps.setObject(18, monitor.getDepth(), Types.DOUBLE);
         ps.setObject(19, monitor.getWeight(), Types.DOUBLE);
         ps.setObject(20, monitor.getModelYear(), Types.INTEGER);
         ps.setString(21, monitor.getFeatures());
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
                  rs.getObject("screen_size", Double.class),
                  rs.getObject("resolution_width", Integer.class),
                  rs.getObject("resolution_height", Integer.class),
                  rs.getObject("refresh_rate", Integer.class),
                  rs.getString("panel_type"),
                  rs.getString("aspect_ratio"),
                  rs.getObject("brightness", Double.class),
                  rs.getObject("response_time", Double.class),
                  rs.getObject("contrast_ratio", Integer.class),
                  rs.getString("hdr_support"),
                  rs.getString("connectivity"),
                  rs.getObject("vesa_mount", Boolean.class),
                  rs.getString("vesa_pattern"),
                  rs.getObject("width", Double.class),
                  rs.getObject("height", Double.class),
                  rs.getObject("depth", Double.class),
                  rs.getObject("weight", Double.class),
                  rs.getObject("model_year", Integer.class),
                  rs.getString("features"));
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
                     rs.getObject("screen_size", Double.class),
                     rs.getObject("resolution_width", Integer.class),
                     rs.getObject("resolution_height", Integer.class),
                     rs.getObject("refresh_rate", Integer.class),
                     rs.getString("panel_type"),
                     rs.getString("aspect_ratio"),
                     rs.getObject("brightness", Double.class),
                     rs.getObject("response_time", Double.class),
                     rs.getObject("contrast_ratio", Integer.class),
                     rs.getString("hdr_support"),
                     rs.getString("connectivity"),
                     rs.getObject("vesa_mount", Boolean.class),
                     rs.getString("vesa_pattern"),
                     rs.getObject("width", Double.class),
                     rs.getObject("height", Double.class),
                     rs.getObject("depth", Double.class),
                     rs.getObject("weight", Double.class),
                     rs.getObject("model_year", Integer.class),
                     rs.getString("features"));
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
