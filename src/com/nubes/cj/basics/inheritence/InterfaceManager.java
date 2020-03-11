package com.nubes.cj.basics.inheritence;


public class InterfaceManager {

		public static void main(String[] args) {
			Shape shape = getShape(2);
			shape.draw();
		}

		private static Shape getShape(int ch) {
			if(ch == 1)
				return new Circle();
			else if(ch==2)
				return new Rectangle();
			throw new IllegalArgumentException("Provide valid input 1 and 2 only");
		}
		
		
		
}
		
