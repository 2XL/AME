
public class Test {

	public static void main(String[] args){
		
		
		
		
		
		double g = 4700 * Math.pow(Math.E, (-3950 / 298.11));  
		System.out.println(1/g);
		
		int gg = 120;
		
		int count = 740;
		int rr = toResistence(count);
		
		System.out.println(toKelvin(rr,gg));
		
		
	}
	
	public static int toResistence(int count){
		 return 10000 * ( 1023 / (count-1));
		}

	public static double toKelvin(double resistence, double conductance){
		  return 3950 / ( Math.log(resistence*conductance)) ;
		}

	public static double conductance(){
		  return 120.88319842586803;
		}
	

	
}
