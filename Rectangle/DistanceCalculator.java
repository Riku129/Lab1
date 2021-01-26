
public class DistanceCalculator {

	private DistanceCalculator() {
		
	}//end empty argument constructor
	
	public static double calculateDistance(int x, int y, int a, int b) {
		return Math.sqrt(Math.pow((a-x),2)+(Math.pow((b-y),2)));
		
		
	}//end calculateDistance
	
}//end class