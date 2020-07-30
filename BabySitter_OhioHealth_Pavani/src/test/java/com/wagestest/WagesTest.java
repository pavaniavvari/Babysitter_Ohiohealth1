package com.wagestest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.wages.BabySitterWageCal;

public class WagesTest {

	@Test
	public void calculateWage() {
		BabySitterWageCal baysittWageCal=new BabySitterWageCal();
		int amounttobepaid=baysittWageCal.calculateWage();
		assertNotNull(amounttobepaid);
	}
}
