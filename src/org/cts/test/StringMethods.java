package org.cts.test;

public class StringMethods {
	
	public static void main(String[] args) {
		
		//literalstring
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println("memory address s1:"+System.identityHashCode(s1));
		System.out.println("memory address s2:"+System.identityHashCode(s2));

		//non literal string
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		System.out.println("memory address s3:"+System.identityHashCode(s3));
		System.out.println("memory address s4:"+System.identityHashCode(s4));
		
		//immutable string
		String s5= "java";
		String s6 = "selenium";
		System.out.println("memory address s5:"+System.identityHashCode(s5));

		//join
		String s7=s1.concat(s2);
		System.out.println("memory address s7:"+System.identityHashCode(s7));

		//mutable
		StringBuffer s8 = new StringBuffer("java");
		StringBuffer s9 = new StringBuffer("selenium");
		
		//mutablejoin
		StringBuffer s10 = s8.append(s9);
		System.out.println("memory addess s8:"+System.identityHashCode(s8));
		System.out.println("memory addess s10:"+System.identityHashCode(s10));

		String s11 ="";
		System.out.println("memory addess s11:"+System.identityHashCode(s11));
		
		String s12 = null;
		System.out.println("memory addess s12:"+System.identityHashCode(s12));

		

	}

}
