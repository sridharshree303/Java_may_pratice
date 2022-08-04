package com.cg.flightmgnt;

import static org.junit.jupiter.api.Assertions.assertAll;
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
import com.cg.flightmgnt.modal.PremiumFlight;

@DisplayName("Airport Tests")
public class AirportTestsPhase1 {

	@DisplayName("Given there is an economy flight")
	@Nested
	class EconomyFlightTest {

		private Flight economyFlight;
		private Passenger mike;
		private Passenger john;

		@BeforeEach
		void setUp() {
			economyFlight = new EconomyFlight("1");
			mike = new Passenger("Mike", false);
			john = new Passenger("John", true);
		}

		@Nested
		@DisplayName("When we have a usual passenger")
		class UsualPassenger {

			@Test
			@DisplayName("Then you can add and remove him from an economy flight")
			public void testEconomyFlightUsualPassenger() {
				assertAll("Verify all conditions for a usual passenger and an economy flight",
						() -> assertEquals("1", economyFlight.getId()),
						() -> assertEquals(true, economyFlight.addPassenger(mike)),
						() -> assertEquals(1, economyFlight.getPassengersSet().size()),
						() -> assertTrue(economyFlight.getPassengersSet().contains(mike)),
						() -> assertEquals(true, economyFlight.removePassenger(mike)),
						() -> assertEquals(0, economyFlight.getPassengersSet().size()));
			}
		}
 
		@Nested
		@DisplayName("When we have a VIP passenger")
		class VipPassenger {
			@Test
			@DisplayName("Then you can add him but cannot remove him from an economy flight")
			public void testEconomyFlightVipPassenger() {
				assertAll("Verify all conditions for a VIP passenger and an economy flight",
						() -> assertEquals("1", economyFlight.getId()),
						() -> assertEquals(true, economyFlight.addPassenger(john)),
						() -> assertEquals(1, economyFlight.getPassengersSet().size()),
						() -> assertTrue(economyFlight.getPassengersSet().contains(john)),
						() -> assertEquals(false, economyFlight.removePassenger(john)),
						() -> assertEquals(1, economyFlight.getPassengersSet().size()));

			}
		}
	}

	@DisplayName("Given there is a business flight")
	@Nested
	class BusinessFlightTest {
		private Flight businessFlight;
		private Passenger mike;
		private Passenger john;

		@BeforeEach
		void setUp() {
			businessFlight = new BusinessFlight("2");
			mike = new Passenger("Mike", false);
			john = new Passenger("John", true);
		}

		@Nested
		@DisplayName("When we have a usual passenger")
		class UsualPassenger {

			@Test
			@DisplayName("Then you cannot add or remove him from a business flight")
			public void testBusinessFlightUsualPassenger() {
				assertAll("Verify all conditions for a usual passenger and a business flight",
						() -> assertEquals("2", businessFlight.getId()),
						() -> assertEquals(false, businessFlight.addPassenger(mike)),
						() -> assertEquals(0, businessFlight.getPassengersSet().size()),
						() -> assertEquals(false, businessFlight.removePassenger(mike)),
						() -> assertEquals(0, businessFlight.getPassengersSet().size()));
			}
		}

		@Nested
		@DisplayName("When we have a VIP passenger")
		class VipPassenger {

			@Test
			@DisplayName("Then you can add him but cannot remove him from a business flight")
			public void testBusinessFlightVipPassenger() {
				assertAll("Verify all conditions for a VIP passenger and a business flight",
						() -> assertEquals(true, businessFlight.addPassenger(john)),
						() -> assertEquals(1, businessFlight.getPassengersSet().size()),
						() -> assertEquals(false, businessFlight.removePassenger(john)),
						() -> assertEquals(1, businessFlight.getPassengersSet().size()));
			}
		}
	}

	@DisplayName("Given there is a premium flight")
	@Nested
	class PremiumFlightTest {
		private Flight premiumFlight;
		private Passenger mike;
		private Passenger john;

		@BeforeEach
		void setUp() {
			premiumFlight = new PremiumFlight("3");
			mike = new Passenger("Mike", false);
			john = new Passenger("John", true);
		}

		@Nested
		@DisplayName("When we have a usual passenger")
		class UsualPassenger {

			@Test
			@DisplayName("Then you cannot add or remove him from a premium flight")
			public void testPremiumFlightUsualPassenger() {
				assertAll("Verify all conditions for a usual passenger and a premium flight",
						() -> assertEquals(false, premiumFlight.addPassenger(mike)),
						() -> assertEquals(0, premiumFlight.getPassengersSet().size()),
						() -> assertEquals(false, premiumFlight.removePassenger(mike)),
						() -> assertEquals(0, premiumFlight.getPassengersSet().size()));
			}
		}

		@Nested
		@DisplayName("When we have a VIP passenger")
		class VipPassenger {
			@Test
			@DisplayName("Then you can add and remove him from a premium flight")
			public void testPremiumFlightVipPassenger() {
				assertAll("Verify all conditions for a VIP passenger and a premium flight",
						() -> assertEquals(true, premiumFlight.addPassenger(john)),
						() -> assertEquals(1, premiumFlight.getPassengersSet().size()),
						() -> assertEquals(true, premiumFlight.removePassenger(john)),
						() -> assertEquals(0, premiumFlight.getPassengersSet().size()));
			}
		}
	}
}
