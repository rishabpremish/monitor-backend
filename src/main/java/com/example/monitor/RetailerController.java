package com.example.monitor;

import java.sql.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController
public class RetailerController {
   @PostMapping("/api/retailer")
   public ResponseEntity<String> createRetailer(@RequestBody Retailer retailer) throws SQLException {
      RetailerRepository repository = new RetailerRepository();
      repository.createRetailer(retailer);

      return ResponseEntity.status(201).body("Successfully created retailer");
   }

   @GetMapping("/api/retailer")
   public ResponseEntity<ArrayList<Retailer>> getAllRetailers() throws SQLException {
      RetailerRepository repository = new RetailerRepository();
      return ResponseEntity.ok(repository.getAllRetailers());
   }

   @GetMapping("/api/retailer/{id}")
   public ResponseEntity<ArrayList<Retailer>> getRetailerById(@PathVariable int id) throws SQLException {
      RetailerRepository repository = new RetailerRepository();
      return ResponseEntity.ok(repository.getRetailerById(id));
   }

   @DeleteMapping("/api/retailer/{id}")
   public ResponseEntity<String> deleteRetailerById(@PathVariable int id) throws SQLException {
      RetailerRepository repository = new RetailerRepository();
      repository.deleteRetailerById(id);
      return ResponseEntity.ok("Successfully deleted retailer");
   }
}
