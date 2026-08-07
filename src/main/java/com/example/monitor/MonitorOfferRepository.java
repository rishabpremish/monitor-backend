package com.example.monitor;

import java.sql.*;
import java.util.*;

public class MonitorOfferRepository {
   private String url = System.getenv("MYSQL_URL");
   private String username = System.getenv("MYSQL_USER");
   private String password = System.getenv("MYSQL_PASSWORD");

   public void createMonitorOffer(MonitorOffer offer) throws SQLException {
      String sql = """
            INSERT INTO monitor_offers (
            monitor_id, retailer_id, price, product_url, is_stock)
            VALUES(?, ?, ?, ?, ?)
            """;
      try (Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);) {
         ps.setInt(1, offer.getMonitorId());
         ps.setInt(2, offer.getRetailerId());
         ps.setDouble(3, offer.getPrice());
         ps.setString(4, offer.getProductUrl());
         ps.setBoolean(5, offer.getInStock());
         ps.executeUpdate();
         System.out.println("Monitor offer successfully added!");
      }
   }

   public ArrayList<MonitorOffer> getAllMonitorOffers() throws SQLException {
      String sql = """
            SELECT *
            FROM monitor_offers
            """;
      ArrayList<MonitorOffer> monitorOffers = new ArrayList<>();
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();) {
         while (rs.next()) {
            MonitorOffer monitorOffer = new MonitorOffer(
                  rs.getInt("offer_id"),
                  rs.getInt("monitor_id"),
                  rs.getInt("retailer_id"),
                  rs.getDouble("price"),
                  rs.getString("product_url"),
                  rs.getBoolean("is_stock"));
            monitorOffers.add(monitorOffer);
         }
      }
      return monitorOffers;
   }

   public ArrayList<MonitorOffer> getMonitorOfferById(int id) throws SQLException {
      String sql = """
            SELECT *
            FROM monitor_offers mo
            WHERE mo.offer_id = ?
                  """;
      ArrayList<MonitorOffer> monitorOffers = new ArrayList<>();
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, id);
         try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
               MonitorOffer monitorOffer = new MonitorOffer(
                     rs.getInt("offer_id"),
                     rs.getInt("monitor_id"),
                     rs.getInt("retailer_id"),
                     rs.getDouble("price"),
                     rs.getString("product_url"),
                     rs.getBoolean("is_stock"));
               monitorOffers.add(monitorOffer);
            }
         }
         return monitorOffers;
      }
   }

   public ArrayList<MonitorOffer> getMonitorOffersByMonitorId(int monitorId) throws SQLException {
      String sql = """
            SELECT *
            FROM monitor_offers
            WHERE monitor_id = ?
                  """;
      ArrayList<MonitorOffer> monitorOffers = new ArrayList<>();
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, monitorId);
         try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
               MonitorOffer monitorOffer = new MonitorOffer(
                     rs.getInt("offer_id"),
                     rs.getInt("monitor_id"),
                     rs.getInt("retailer_id"),
                     rs.getDouble("price"),
                     rs.getString("product_url"),
                     rs.getBoolean("is_stock"));
               monitorOffers.add(monitorOffer);
            }
         }
         return monitorOffers;
      }
   }

   public void deleteMonitorOfferById(int offerId) throws SQLException {
      String sql = """
            DELETE FROM monitor_offers
            WHERE offer_id = ?
            """;
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);) {
         ps.setInt(1, offerId);
         ps.executeUpdate();
         System.out.println("Monitor offer successfully deleted!");

      }
   }
}
