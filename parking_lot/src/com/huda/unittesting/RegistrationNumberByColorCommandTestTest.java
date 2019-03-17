package com.huda.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.huda.command.ParkCommand;
import com.huda.command.RegistrationNumberByColorCommand;

class RegistrationNumberByColorCommandTestTest extends BaseTestUnit {

	@Test
	void testExecute() {
		this.parkParkingLot();
		this.Leave(4);
		this.anotherPark();
		
		RegistrationNumberByColorCommand parkCommand = new RegistrationNumberByColorCommand();
		String [] parameters = new String[] { "White" };
		String result = parkCommand.Execute(parameters);
		
		assertEquals(result, "KA-01-HH-1234,KA-01-HH-9999,KA-01-P-333");
	}

}
