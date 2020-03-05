package projecttraining;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StringUtilSpec {

	@Test
	public void stringMethod1() {

		String s1 = "Core Java";
		String s2 = "Core Java";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

	@Test
	public void stringMethod2() {

		String s1 = new String("Core Java");
		String s2 = new String("Core Java");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

	@Test
	public void stringMethod3() {

		String s1 = new String("Core Java");
		String s2 = new String("Core Java");
		String s3 = "Core Java";
		System.out.println(s1 == s2); //False
		System.out.println(s2 == s3); // False
		System.out.println(s1.equals(s2)); // True
		System.out.println(s2.equals(s3)); // True
	}

	@Test
	public void stringMethod4() {
		System.out.println(".........Method4.....................");
		String s1 = new String("Core Java");
		String s2 = "Core";
		s2 = s2.concat(" Java");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
	@Test
	public void stringMethod5() {
		System.out.println("..............Method5.....................");
		String data = "123,456 , 789, 123";
		String arr[]=data.split(",");
		int idArr[] = new int[arr.length];
		int c = 0;
		for(String ele:arr) {
			idArr[c++] = Integer.parseInt(ele.trim());
		}
		System.out.println(Arrays.toString(idArr));
	}
	
	@Test
	public void stringMethod6() {
		System.out.println("..............Method6.....................");
		String data = "123-Rajesh,456-Mahesh,789Charan,123Ram";
		String arr[] = data.split(",");
		for(String ele:arr) {
			System.out.println(ele.substring(0, 3));
		}
		
	}
	@Test
	public void stringMethod7() {
		System.out.println("..............Method7.....................");
		String data = "Welcome   Java    world";
		System.out.println(data.substring(7, 12).trim().substring(0,1).toLowerCase());
	}
	
	@Test
	public void stringMethod8() {
		System.out.println("..............Method8.....................");
		String name1 = "Java";
		String name2 = new String("Java");
		name2 = name2.intern();
		System.out.println(name1==name2);
	}
	@Test
	public void stringMethod9() {
		int age = 23;
		String name = "Rajesh";
		float salary = 35435;
		StringBuffer sb = new StringBuffer();
		String s  = sb.append("Name ").append(name).append("Salalry:").append(salary).append("Age:").append(age).toString();
		System.out.println(s);
		
	}
	@Test
	public void stringMethod10() {
		StringBuffer sb1= new StringBuffer("Java");
		StringBuffer sb2= new StringBuffer("Java");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
	@Test
	public void stringMethod11() {
		String name = "LIRIL";
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse().toString().equals(name));
	}
	
}
