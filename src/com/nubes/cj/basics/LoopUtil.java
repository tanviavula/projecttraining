package com.nubes.cj.basics;

public class LoopUtil {
	public int[] getEvenNumbers(int N) {
		int arr[] = new int[N];
		for (int i = 2, j = 0;; i = i + 2, j++) {
			if (j == N) {
				break;
			}
			arr[j] = i;
		}
		return arr;
	}
	public int[] getPrimeNumbers(int N) {
		int arr[] = new int[N];
		int count = 0;
		for(int i=2; ;i++) {
			if(isPrime(i)) {
				arr[count++] = i;
			}
			if(count == N) {
				break;
			}
		}
		return arr;
		
	}

	private boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int getMaxElement(int arr[]) {
		int big = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(big < arr[i]) {
				big = arr[i];
			}
		}
		return big;
	}
	
	public int[] getPrimeInRange(int lb,int ub) {
			int arr[] = new int[primeCount(lb, ub)];
			int c = 0;
			for(int i=lb;i<=ub;i++) {
				if(isPrime(i)) {
					arr[c++] = i;
				}
			}
			return arr;
	}
	
	private int primeCount(int lb,int ub) {
		int count = 0;
		for(int i=lb;i<=ub;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	public void printTables(int N) {
		for(int i=1;i<=N;i++) {
		
			for(int j=1;j<=10;j++) {
				System.out.println(i + " * "+j+" = "+(i*j));
			}
			System.out.println("--------------------");
		}
	}
	
}
