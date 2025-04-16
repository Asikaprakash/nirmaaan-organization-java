package day7;

public class casting {
	public static void main(String[] args) {
		System.out.println("Implicit value");
		byte b=127;
		short s=(short)b;
		System.out.println(b);
		int num=10;
		long lnum=num;
		System.out.println(lnum);
		//implicit
		System.out.println("Explicit value");
		short S=128;
		byte B=(byte)S;
		
		
		System.out.println(B);
		long a=230;
		int i=(int)a;
		System.out.println(i);
	}

}
