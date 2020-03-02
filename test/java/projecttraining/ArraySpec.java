package projecttraining;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArraySpec {

	@Test
	public void arrayForEach() {
		int[] arr = { 5, 6, 7, 8, 9, 0, 10, 12 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int ele : arr) {
			System.out.println(ele);
		}
	}

	@Test
	public void arrStat() {
		int n = 10;
		int[] arr = getRandomArray(n);
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		float avg = 0.0f;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		avg = sum / (float) arr.length;
		System.out.println("Sum :" + sum);
		System.out.println("Average:" + avg);
		System.out.println("Max :" + max);
		System.out.println("Min :" + min);

	}

	@Test
	public void search() {
		int arr[] = getRandomArray(10);
		int ele = 5;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				flag = true;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		if (flag) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}

	@Test
	public void occuranceOfElement() {
		int arr[] = getRandomArray(30);
		int ele = 5;

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The number :" + ele + " is occured :" + count + " times");

	}

	private int[] getRandomArray(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.ceil(Math.random() * 20);
		}
		return arr;
	}

	@Test
	public void reverseArray() {
		int arr[] = getRandomArray(10);
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	@Test
	public void checkArrayIsPalindrome() {
		int arr[] = {4, 1, 2, 3, 2, 1 ,4};
		boolean flag = true;
		for (int i = 0, j = arr.length - 1; i <= arr.length / 2; i++, j--) {
			if(arr[i] != arr[j]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
