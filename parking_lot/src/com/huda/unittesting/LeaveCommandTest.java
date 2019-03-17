package com.huda.unittesting;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import com.huda.command.LeaveCommand;
import com.huda.repository.Memory;

class LeaveCommandTest extends BaseTestUnit {

	@Test
	void testExecuteOk() {
		this.parkParkingLot();
		
		String [] parameters = new String[] { "4" };
		LeaveCommand leaveCommand = new LeaveCommand();
		leaveCommand.Execute(parameters);
		
		assertEquals(null, Memory.ParkingLots.get(3).Car);
	}
	
	@Test
	void testExecuteFail() {
		this.parkParkingLot();
		
		String [] parameters = new String[] { "8" };
		LeaveCommand leaveCommand = new LeaveCommand();
		String result = leaveCommand.Execute(parameters);
		
		assertThat(result, CoreMatchers.containsString("does not exist"));
	}

}
