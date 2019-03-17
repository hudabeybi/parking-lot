package com.huda.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.huda.command.RegistrationNumberByColorCommand;
import com.huda.command.SlotNumberByRegistrationNumberCommand;

class SlotNumberByColorRegistrationNumberTest extends BaseTestUnit {

	@Test
	void testExecute() {
		this.parkParkingLot();
		this.Leave(4);
		this.anotherPark();
		
		SlotNumberByRegistrationNumberCommand parkCommand = new SlotNumberByRegistrationNumberCommand();
		String [] parameters = new String[] { "KA-01-HH-3141" };
		String result = parkCommand.Execute(parameters);
		
		assertEquals(result, "6");
	}

}
