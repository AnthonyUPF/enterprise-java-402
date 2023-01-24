package com.example.Intro.repositories;

import com.example.Intro.models.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AircraftRepositoryTest {

    @Autowired
    AircraftRepository aircraftRepository;
    Aircraft aircraft;
    Aircraft aircraft2;
    Aircraft aircraft3;
    Aircraft aircraft4;

    @BeforeEach
    void setUp() {
        aircraft = new Aircraft("Boeing 747", 400);
        aircraft2 = new Aircraft("Airbus A330", 236);
        aircraft3 = new Aircraft("Boeing 777", 264);

        aircraftRepository.saveAll(List.of(aircraft, aircraft2, aircraft3));
    }

    @AfterEach
    void deleteAircraftRepository() {
        aircraftRepository.deleteAll();
    }


    @Test
    void shouldReturnAircraft_UsingValidId() {
        Optional<Aircraft> newAircraftOptional = aircraftRepository.findById(aircraft3.getModel());
        if(newAircraftOptional.isPresent()){
            assertEquals(aircraft3.getModel(),newAircraftOptional.get().getModel());
            assertTrue(aircraft3.getSeats()==newAircraftOptional.get().getSeats());
        }
    }

    @Test
    void shouldReturnListAircraftContainingSomeWord() {
        List<Aircraft> newAircraftRepository = aircraftRepository.findByModelLike("%Boeing%");
        if(!newAircraftRepository.isEmpty()){
            assertTrue(newAircraftRepository.size()>1);
        }
    }




}
