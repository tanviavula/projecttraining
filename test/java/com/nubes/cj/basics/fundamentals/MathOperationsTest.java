package com.nubes.cj.basics.fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {

	@Test
	public void sumOfThreeNumbersTest() {
		MathOperation obj = new MathOperation();
		int res = obj.sum(10, 20, 30);
		assertEquals(60, res);
	}
}
