package com.huda.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.huda.command.ParkingLotCreateCommand;
import com.huda.repository.Memory;

class CreateParkLotTest {

	@Test
	void TestCreateParkLotCommand() {
		ParkingLotCreateCommand unit = new ParkingLotCreateCommand();
		String [] parameters = new String[] { "6" };
		unit.Execute(parameters);
		assertEquals(6, Memory.ParkingLots.size() );
	}

	@Test
	void TestCreateParkLotCommandFail() {
		ParkingLotCreateCommand unit = new ParkingLotCreateCommand();
		String [] parameters = new String[] { "6" };
		unit.Execute(parameters);
		assertEquals(8, Memory.ParkingLots.size() );
	}
}
