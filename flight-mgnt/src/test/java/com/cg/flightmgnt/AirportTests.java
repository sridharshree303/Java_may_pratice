package com.cg.flightmgnt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.cg.flightmgnt.modal.BusinessFlight;
import com.cg.flightmgnt.modal.EconomyFlight;
import com.cg.flightmgnt.modal.Flight;
import com.cg.flightmgnt.modal.Passenger;

public class AirportTests {

	@DisplayName("Given there is an economy flight")
	@Nested
	class EconomyFlightTest {
		private Flight economyFlight;

		@BeforeEach
		void setUp() {
			economyFlight = new EconomyFlight("1");
		}

		@Test
		public void testEconomyFlightUsualPassenger() {
			Passenger mike = new Passenger("Mike", false);

			assertEquals("1", economyFlight.getId());
			assertEquals(true, economyFlight.addPassenger(mike));
			assertEquals(1, economyFlight.getPassengersSet().size());
			assertTrue(economyFlight.getPassengersSet().contains(mike));

			assertEquals(true, economyFlight.removePassenger(mike));
			assertEquals(0, economyFlight.getPassengersSet().size());
		}

		@Test
		public void testEconomyFlightVipPassenger() {
			Passenger john = new Passenger("John", true);

			assertEquals("1", economyFlight.getId());
			assertEquals(true, economyFlight.addPassenger(john));
			assertEquals(1, economyFlight.getPassengersSet().size());
			assertTrue(economyFlight.getPassengersSet().contains(john));

			assertEquals(false, economyFlight.removePassenger(john));
			assertEquals(1, economyFlight.getPassengersSet().size());
		}

	}

	@DisplayName("Given there is a business flight")
	@Nested
	class BusinessFlightTest {
		private Flight businessFlight;

		@BeforeEach
		void setUp() {
			businessFlight = new BusinessFlight("2");
		}

		@Test
		public void testBusinessFlightUsualPassenger() {
			Passenger mike = new Passenger("Mike", false);

			assertEquals("2", businessFlight.getId());

			assertEquals(false, businessFlight.addPassenger(mike));
			assertEquals(0, businessFlight.getPassengersSet().size());
			assertEquals(false, businessFlight.removePassenger(mike));
			assertEquals(0, businessFlight.getPassengersSet().size());

		}  

		@Test
		public void testBusinessFlightVipPassenger() {
			Passenger john = new Passenger("John", true);

			assertEquals("2", businessFlight.getId());
			
			assertEquals(true, businessFlight.addPassenger(john));
			assertEquals(1, businessFlight.getPassengersSet().size());
			assertEquals(false, businessFlight.removePassenger(john));
			assertEquals(1, businessFlight.getPassengersSet().size());
			assertTrue(businessFlight.getPassengersSet().contains(john));
		}

	}

}
