package com.nubes.cj.basics;

public class WhileUtil {

	public int sumOfNNumbers(int N) {
		int sum = 0;
		int i = 1;
		while (i <= N) {
			sum += i;
			i++;
		}
		return sum;
	}

	public int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	public boolean palindrome(int num) {
		return reverse(num) == num;
	}

	public int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	public boolean checkAmstrong(int num) {
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int r = temp % 10;
			sum += r * r * r;
			temp = temp / 10;
		}
		return num == sum;
	}

	public void print3AmstrongNumbers() {
		int count = 0;
		for (int i = 1;; i++) {
			if (checkAmstrong(i)) {
				count++;
				System.out.println(i);
			}
			if (count == 3)
				break;
		}
	}

	public int sumOfDigitsUntilSingleDigit(int num) {
//		int sum = 0;
//		while(num > 9) {
//			sum = 0;
//			while (num != 0) {
//				int r = num % 10;
//				sum = sum + r;
//				num = num / 10;
//			} 
//			num = sum;
//		}
//		return sum;
		
		int sum = 0;
		while(num > 9) {
			sum = num / 10 + num % 10;
			num = sum;
		}
		return num;
	}
	
	

}
