package projecttraining;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nubes.cj.basics.LoopUtil;

class LoopUtilSpec {

	@Test
	void getEventNumbers() {
		int N = 5;
		LoopUtil obj = new LoopUtil();
		assertArrayEquals(new int[] { 2, 4, 6, 8, 10 }, obj.getEvenNumbers(N));
	}

	@Test
	void getPrimeNumbers() {
		int N = 6;
		int arr[] = new int[] { 2, 3, 5, 7, 11, 13 };
		LoopUtil obj = new LoopUtil();
		assertArrayEquals(arr, obj.getPrimeNumbers(N));
	}
	
	@Test
	void getMaxValue() {
		int arr[] =  {0, -1, 2, 3, 5, 7, 11, 13, -100, 50 };
		LoopUtil obj = new LoopUtil();
		assertEquals(50, obj.getMaxElement(arr));
	}
	
	@Test
	void getMaxValueWithNegativeNumber() {
		int arr[] =  {-2, -3, -5, -7, -1000, -13, -100, -50 };
		LoopUtil obj = new LoopUtil();
		assertEquals(-2, obj.getMaxElement(arr));
	}
	@Test
	void getMaxValueWithZero() {
		int arr[] =  {0,0,0,0,0,0};
		LoopUtil obj = new LoopUtil();
		assertEquals(0, obj.getMaxElement(arr));
	}
	
	@Test
	void printTables() {
		LoopUtil obj = new LoopUtil();
		obj.printTables(20);
	}
}
