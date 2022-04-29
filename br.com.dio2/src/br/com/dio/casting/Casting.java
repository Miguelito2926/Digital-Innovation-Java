package br.com.dio.casting;

public class Casting {

	public static void main(String[] args) {

		byte b1;
		short s1 =1000;
		b1 = (byte) s1; // conversão com perda de informação Downcast
		
		long l1;
		int i1 = 10; //Upcast conversão inteiro para long sem perda de dados.
		l1 = i1;
		
		int i2;
		long l2 = 1000000000000000000L;
		i2 = (int) l2;
		
		int i3;
		long l3 = 10000L;
		i3 = (int) l3;
		
		double d1;
		float f1 = 10.5f;
		d1 = f1;
				
		
	}

}
