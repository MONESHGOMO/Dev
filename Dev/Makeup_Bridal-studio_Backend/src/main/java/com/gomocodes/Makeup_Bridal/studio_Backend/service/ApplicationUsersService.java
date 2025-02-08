package com.gomocodes.Makeup_Bridal.studio_Backend.service;

import com.gomocodes.Makeup_Bridal.studio_Backend.models.ApplicationUsersData;
import com.gomocodes.Makeup_Bridal.studio_Backend.repository.ApplicationUsersDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUsersService {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationUsersService.class);

    @Autowired
    private ApplicationUsersDataRepository applicationUsersDataRepository;

    public void addUsersToDB(ApplicationUsersData applicationUsersData) {
        logger.info("Adding new user appointment: {}", applicationUsersData);
        applicationUsersDataRepository.save(applicationUsersData);
        logger.info("User appointment saved successfully.");
    }
}
