package com.nubes.cj.basics.two;

import com.nubes.cj.basics.one.AccessSpecifiers;

public class Four extends AccessSpecifiers {
	void showValues() {
		//    System.out.println(pri_a);
			System.out.println(pro_a);
			System.out.println(pub_a);
		//	System.out.println(def_a);
		}
}

class Five{
	AccessSpecifiers obj = new AccessSpecifiers();
	void showValues() {
	//	System.out.println(obj.pri_a);
	//	System.out.println(obj.pro_a);
		System.out.println(obj.pub_a);
    //   System.out.println(obj.def_a);
	}
}
