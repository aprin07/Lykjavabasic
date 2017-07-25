package tr.org.linux.kamp.garbage;

import sun.misc.GC;

public class Gc {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		String str = new String("Linux Yaz Kampı");
		String str1 = new String("Java ile Programlama");
		System.out.println(str);
		str=str1;
		str=null;
		//System.gc();
		
		GcTest gcTest = new GcTest();
		gcTest.value = 1;
		gcTest = null;
		
		
		System.out.println("boş bellek : " + rt.freeMemory());
		//System.out.println(gcTest.value);
			System.gc();
			
			
			System.out.println("boş bellek garbage collector çalıştıktan sonra : " + rt.freeMemory());

			//System.out.println(gcTest.value);

	}
}
