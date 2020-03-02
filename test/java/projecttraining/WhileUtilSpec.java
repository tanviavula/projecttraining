package projecttraining;

import org.junit.jupiter.api.Test;

import com.nubes.cj.basics.WhileUtil;

public class WhileUtilSpec {

	@Test
	public void reverseOfNumber() {
		WhileUtil obj = new WhileUtil();
		obj.reverse(1234);
	}

	@Test
	public void printNumbers() {
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= i; j++) {
				if (i % 3 == 0 && j % 3 == 0) {
					continue;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
