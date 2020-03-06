package com.nubes.cj.basics.fundamentals;

public class MathOperation {

		public int sum(int a,int b) {
			return a + b;
		}
		public int sum(int a,int b,int c) {
			return a + b + c;
			
		}
		public int sum(int... arr) {
			int res = 0;
			if(arr.length > 0) {
				for(int ele:arr) {
					res += ele;
				}
			}
			return res;
		}
		public float sum(float a, float b) {
			
			return 0.0f;
		}
		public String sum(String a,String b) {
			return a + b;
		}
}
