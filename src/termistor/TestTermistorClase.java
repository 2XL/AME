package termistor; 
public class TestTermistorClase {

	
	
	public static final int ThermistorPIN = 0;
	public static final int Counts = 700;
	public static final double G = 120.88319842586803; 
	
	
	public static void main(String[] args){
		 
		 
		double Temp;
		double TempK;
		double Rtherm;
		double Resistor = 10000;
		double ADCres = 1023;
		double beta = 3950;
		double Rb = 10000;
		double R0 = 4700;
		double T0 = 298.15;
		double K = 273.15;
		
		
		
		Rtherm = Rb*(ADCres / (Counts-1));
		System.out.println("Resistence: " + Rtherm);
		
		TempK = ADCres/Math.log(Rtherm*G); 
		System.out.println("TempK: " + TempK);
		 
		
		Temp = TempK - K;  
		System.out.println("Temp: " + Temp);
	}

	


}