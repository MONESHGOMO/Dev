package com.gomocodes.Makeup_Bridal.studio_Backend.repository;

import com.gomocodes.Makeup_Bridal.studio_Backend.models.ApplicationUsersData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUsersDataRepository extends JpaRepository<ApplicationUsersData,Long> {

}
