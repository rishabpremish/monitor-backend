package com.example.monitor;

import java.sql.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController
public class MonitorController {
   @PostMapping("/api/monitors")
   public ResponseEntity<String> createMonitor(@RequestBody Monitor monitor) throws SQLException {
      MonitorRepository repository = new MonitorRepository();
      repository.createMonitor(monitor);

      return ResponseEntity.status(201).body("Monitor created successfully");
   }

   @GetMapping("/api/monitors")
   public ResponseEntity<ArrayList<Monitor>> getAllMonitors() throws SQLException {
      MonitorRepository repository = new MonitorRepository();
      return ResponseEntity.status(201).body(repository.getAllMonitors());
   }

   @GetMapping("/api/monitors/{id}")
   public ResponseEntity<ArrayList<Monitor>> getMonitorById(@PathVariable int id) throws SQLException {
      MonitorRepository repository = new MonitorRepository();
      return ResponseEntity.status(201).body(repository.getMonitorById(id));
   }

   @DeleteMapping("/api/monitors/{id}")
   public ResponseEntity<String> deleteMonitorById(@PathVariable int id) throws SQLException {
      MonitorRepository repository = new MonitorRepository();
      repository.deleteMonitorById(id);
      return ResponseEntity.status(201).body("Monitor successfully deleted");
   }

}
