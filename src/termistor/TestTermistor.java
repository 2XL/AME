package termistor;

import sun.util.logging.resources.logging;

public class TestTermistor {

	
	
	public static final int ThermistorPIN = 0;
	public static final int Count = 700;
	public static final double G = 120.88319842586803; 
	
	
	public static void main(String[] args){
		 
		 
		double Temp;
		double Rtherm;
		double Resistor = 10000;
		
		Rtherm = Resistor*(Count / (1024-Count));
		System.out.println("Resistence: " + Rtherm);
		
		Temp = Math.log(Rtherm);
		
		
		
		System.out.println("Temp: " + Temp);
		
		Temp =  1 / (0.00102119 + (0.000222468 * Temp) + (0.000000133342 * Temp * Temp * Temp));
		
		
		
		System.out.println("Temp: " + Temp);
		Temp = Temp - 273.15;
		System.out.println("Temp: " + Temp);
	}

	


}
