package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>, JpaSpecificationExecutor<ParkingSpotModel> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
    boolean existsByParkingSpotNumberAndIdNot(String parkingSpotNumber, UUID id);
    boolean existsByApartmentAndBlockAndIdNot(String apartment, String block, UUID id);
    boolean existsByLicensePlateCarAndIdNot(String licensePlateCar, UUID id);

}
