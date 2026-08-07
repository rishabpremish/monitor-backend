package com.example.monitor;

import java.sql.*;
import java.util.*;

public class RetailerRepository {
   private String url = System.getenv("MYSQL_URL");
   private String username = System.getenv("MYSQL_USER");
   private String password = System.getenv("MYSQL_PASSWORD");

   public void createRetailer(Retailer retailer) throws SQLException {
      String sql = """
            INSERT INTO retailers (
            name, website)
            VALUES(?, ?, ?)
            """;
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setString(1, retailer.getName());
         ps.setString(2, retailer.getWebsite());
         ps.executeUpdate();
         System.out.println("Retailer successfully created!");
      }
   }

   public ArrayList<Retailer> getAllRetailers() throws SQLException {
      String sql = """
            SELECT *
            FROM retailers
            """;
      ArrayList<Retailer> retailers = new ArrayList<>();
      try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();) {

         while (rs.next()) {
            Retailer retailer = new Retailer(
                  rs.getInt("retailer_id"),
                  rs.getString("name"),
                  rs.getString("website"));
            retailers.add(retailer);
         }
      }
      return retailers;
   }

   public ArrayList<Retailer> getRetailerById(int id) throws SQLException {
      String sql = """
            SELECT *
            FROM retailers r
            WHERE r.retailer_id = ?
            """;
      ArrayList<Retailer> retailers = new ArrayList<>();
      try (Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, id);
         try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
               Retailer retailer = new Retailer(
                     rs.getInt("retailer_id"),
                     rs.getString("name"),
                     rs.getString("website"));
               retailers.add(retailer);
            }
         }
      }
      return retailers;
   }
}
