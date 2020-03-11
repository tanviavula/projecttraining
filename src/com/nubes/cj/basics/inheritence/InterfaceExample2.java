package com.nubes.cj.basics.inheritence;
interface One{
	void m1();
}
interface Two{
	void m2();
}

interface Three extends One, Two {
	
	void m3();
}

abstract class C2 implements One,Two{
		@Override
		public void m1() {
			
		}
}
class C3 extends C2 implements Three{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceExample2 {

}
