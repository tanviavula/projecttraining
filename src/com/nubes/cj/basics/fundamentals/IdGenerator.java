package com.nubes.cj.basics.fundamentals;

public final class IdGenerator {
		private static int id=1001;
		private IdGenerator() {
		}
		public static int getNewId() {
			return id++;
		}
}
