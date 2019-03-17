package com.huda.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.huda.command.ParkCommand;
import com.huda.command.ParkingLotCreateCommand;
import com.huda.model.Car;
import com.huda.repository.Memory;

class ParkCommandTest extends BaseTestUnit {

	@Test
	void testExecuteParkOne() {
		ParkingLotCreateCommand unit = new ParkingLotCreateCommand();
		String [] parameters = new String[] { "6" };
		unit.Execute(parameters);
		
		ParkCommand parkCommand = new ParkCommand();
		parameters = new String[] { "KA-01-HH-1234", "White" };
		parkCommand.Execute(parameters);
		
		Car car = Memory.ParkingLots.get(0).Car;
		assertNotNull(car);
	}
	
	@Test
	void testExecuteParkTwo() {
		
		this.parkParkingLot();
		Car car = Memory.ParkingLots.get(2).Car;
		assertSame("Black", car.CarColor);
	}

}
