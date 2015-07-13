
public class App {

	public static void main(String[] args) {
		byte byteVal = 20; // 8 bit (1 byte)
		short shortVal = 55; //16 bit (2 bytes)
		int intVal = 600; //32 bit (4 bytes)
		long longVal = 25456432; //64 bit (8 bytes)
		

		float floatVal = 5814.2f;
		double doubleVal = 83834.34;
		
		System.out.println(Double.MAX_VALUE);
		
		intVal = (int)longVal;
		
		doubleVal = intVal;
		System.out.println(doubleVal);
	}

}
