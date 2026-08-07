package com.example.monitor;

import java.sql.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController
public class MonitorOfferController {
   @PostMapping("/api/monitor-offers")
   public ResponseEntity<String> createMonitorOffer(@RequestBody MonitorOffer offer) throws SQLException {
      MonitorOfferRepository repository = new MonitorOfferRepository();
      repository.createMonitorOffer(offer);
      return ResponseEntity.status(201).body("Successfully created monitor offer");
   }

   @GetMapping("/api/monitor-offers")
   public ResponseEntity<ArrayList<MonitorOffer>> getAllMonitorOffers() throws SQLException {
      MonitorOfferRepository repository = new MonitorOfferRepository();
      return ResponseEntity.ok(repository.getAllMonitorOffers());
   }

   @GetMapping("/api/monitor-offers/{id}")
   public ResponseEntity<ArrayList<MonitorOffer>> getMonitorOfferById(@PathVariable int id) throws SQLException {
      MonitorOfferRepository repository = new MonitorOfferRepository();
      return ResponseEntity.ok(repository.getMonitorOfferById(id));

   }

   @GetMapping("/api/monitor/{monitor_id}/offers")
   public ResponseEntity<ArrayList<MonitorOffer>> getMonitorOffersByMonitorId(@PathVariable("monitor_id") int monitorId)
         throws SQLException {
      MonitorOfferRepository repository = new MonitorOfferRepository();
      return ResponseEntity.ok(repository.getMonitorOffersByMonitorId(monitorId));
   }

   @DeleteMapping("/api/monitor-offers/{id}")
   public ResponseEntity<String> deleteMonitorOfferById(@PathVariable int id) throws SQLException {
      MonitorOfferRepository repository = new MonitorOfferRepository();
      repository.deleteMonitorOfferById(id);

      return ResponseEntity.ok("Successfully deleted monitor offer");
   }
}
