package org.cts.test;

public class StringTypes {
	
	public static void main(String[] args) {
		
		//Literal String
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println("Memory address for s1:"+System.identityHashCode(s1));
		System.out.println("Memory address for s2:"+System.identityHashCode(s2));
		
		//Non literal string
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println("Memory address for s3:"+System.identityHashCode(s3));
		System.out.println("Memory address for s4:"+System.identityHashCode(s4));
		
		//immutable string
		
		String s5 = "Java";
		String s6 = "Selenium";
		String s7 = s5.concat(s6);
		System.out.println("Memory address for s5:"+System.identityHashCode(s5));
		System.out.println("Memory address for s6:"+System.identityHashCode(s6));
		System.out.println("Memory address for s7:"+System.identityHashCode(s7));
		
		// mutable string
		StringBuffer s8 = new StringBuffer("Java");
		StringBuffer s9 = new StringBuffer("Selenium");
		StringBuffer s10 = s8.append(s9);
		System.out.println("Memory address for s8:"+System.identityHashCode(s8));
		System.out.println("Memory address for s9:"+System.identityHashCode(s9));
		System.out.println("Memory address for s10:"+System.identityHashCode(s10));
		
		String s11="";
		String s12=null;
		System.out.println("Memory address for s11:"+System.identityHashCode(s11));
		System.out.println("Memory address for s12:"+System.identityHashCode(s12));
	}

}
