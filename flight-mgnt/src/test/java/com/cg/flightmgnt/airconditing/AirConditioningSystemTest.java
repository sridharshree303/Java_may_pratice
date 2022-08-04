package com.cg.flightmgnt.airconditing;


import com.cg.flightmgnt.airconditioning.AirConditioningSystem;
import com.cg.flightmgnt.airconditioning.Thermometer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AirConditioningSystemTest {

	@InjectMocks
    AirConditioningSystem airConditioningSystem;

    @Mock
    Thermometer thermometer;

    @Test
    void testAirConditionedSystemStarted() {
        when(thermometer.getTemperature()).thenReturn(25.0);
        airConditioningSystem.setTemperatureThreshold(24.0);
        airConditioningSystem.checkAirConditioningSystem();
        assertTrue(airConditioningSystem.isOpen());
        verify(thermometer, times(1)).getTemperature();
    }

    @Test
    void testAirConditionedSystemStopped() {
        when(thermometer.getTemperature()).thenReturn(23.0);
        airConditioningSystem.setTemperatureThreshold(24.0);
        airConditioningSystem.checkAirConditioningSystem();
        assertFalse(airConditioningSystem.isOpen());
        verify(thermometer, times(1)).getTemperature();
    }
}
