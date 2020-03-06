package com.nubes.cj.basics.one;

class Three extends AccessSpecifiers{
	void showValues() {
	//  System.out.println(pri_a);
		System.out.println(pro_a);
		System.out.println(pub_a);
		System.out.println(def_a);
	}
}

class Two{
	AccessSpecifiers obj = new AccessSpecifiers();
	void showValues() {
	//	System.out.println(obj.pri_a);
		System.out.println(obj.pro_a);
		System.out.println(obj.pub_a);
		System.out.println(obj.def_a);
	}
}

public class AccessSpecifiers {

	private int pri_a = 100;
	public int pub_a = 300;
	int def_a = 200;
	protected int pro_a = 400;
	
	void showValues() {
		System.out.println(pri_a);
		System.out.println(pro_a);
		System.out.println(pub_a);
		System.out.println(def_a);
	}
	
}
