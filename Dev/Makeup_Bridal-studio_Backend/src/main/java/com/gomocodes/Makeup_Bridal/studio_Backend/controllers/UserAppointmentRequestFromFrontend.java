package com.gomocodes.Makeup_Bridal.studio_Backend.controllers;

import com.gomocodes.Makeup_Bridal.studio_Backend.models.ApplicationUsersData;
import com.gomocodes.Makeup_Bridal.studio_Backend.service.ApplicationUsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow requests from your frontend
@RestController
@RequestMapping("/api")
public class UserAppointmentRequestFromFrontend {

    private static final Logger logger = LoggerFactory.getLogger(UserAppointmentRequestFromFrontend.class);

    @Autowired
    private ApplicationUsersService applicationUsersService;

    @PostMapping("/createappointment")
    public ResponseEntity<String> createAppointment(@RequestBody ApplicationUsersData applicationUsersData) {
        logger.info("Received appointment request: {}", applicationUsersData);
        try {
            applicationUsersService.addUsersToDB(applicationUsersData);
            logger.info("Appointment created successfully for: {}", applicationUsersData.getEmail());
            return ResponseEntity.ok("Appointment created successfully!");
        } catch (Exception e) {
            logger.error("Error creating appointment: {}", e.getMessage());
            return ResponseEntity.status(500).body("Failed to create appointment");
        }
    }
}
