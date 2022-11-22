package sample;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class InvalidRideEntry extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRideEntry(String msg) {
		super(msg);
	}
}

interface UserService {
	abstract void requestRide(Ride r) throws InvalidRideEntry;

	abstract void searchRide(Ride r) throws InvalidRideEntry;

	abstract Ride displayRide(Ride r);
}

class RideService implements UserService {
	public RideService() {
	}

	public void requestRide(Ride r) throws InvalidRideEntry
    {
        if(r.rideId.equals("") || r.fromLocation.equals("") || r.toLocation.equals("") 
        		|| r.seatsLeft.equals("") || r.totalSeats.equals("") || r.startTime.equals("") 
        		|| r.endTime.equals("") || r.isStarted.equals("") || r.finished.equals("")
        )
        throw new InvalidRideEntry("Ride cannot be processed-Empty value.");
    }

	public void searchRide(Ride r) throws InvalidRideEntry {
		if (r.fromLocation.equals(r.toLocation))
			throw new InvalidRideEntry("Invalid location/seats to process the ride.");

		if (Integer.parseInt(r.seatsLeft) > Integer.parseInt(r.totalSeats))
			throw new InvalidRideEntry("Invalid location/seats to process the ride.");

		if (Integer.parseInt(r.seatsLeft) < 0)
			throw new InvalidRideEntry("Invalid location/seats to process the ride.");

		if (Integer.parseInt(r.seatsLeft) < 0)
			throw new InvalidRideEntry("Invalid location/seats to process the ride.");
	}

	public Ride displayRide(Ride r) {
		System.out.println(r);

		return r;
	}

}

class Ride {
	String rideId;
	String fromLocation;
	String toLocation;
	String seatsLeft;
	String totalSeats;
	String startTime;
	String endTime;
	String isStarted;
	String finished;

	public Ride() {
	}

	public Ride(String a, String b, String c, String d, String e, String f, String g, String h, String i)
			throws InvalidRideEntry {
		rideId = a;
		fromLocation = b;
		toLocation = c;
		seatsLeft = d;
		totalSeats = e;
		startTime = f;
		endTime = g;
		isStarted = h;
		finished = i;
	}

	public String toString() {
		return "Ride[rideId=" + rideId + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation
				+ ", seatsLeft=" + seatsLeft + ", totalSeats=" + totalSeats + ", startTime=" + startTime + ", endTime="
				+ endTime + ", isStarted=" + isStarted + ", finished=" + finished + "]";
	}

}
//public class Source{
//    public static void main(String args[]) throws Exception{}
//}