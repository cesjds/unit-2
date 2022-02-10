public class mathClassPractice 
{
	public static void main(String[] args) 
	{
		int numMax = Math.max(10,-10);
		System.out.println("numMax = "+numMax);
		
		int numMin = Math.min(10, -10);
		System.out.println("numMin = "+numMin);
		
		int numAbs = Math.abs(-67);
		System.out.println("numAbs = "+numAbs);
		
		double numSqrt = Math.sqrt(9);
		System.out.println("numSqrt = "+numSqrt);
		
		double numPow = Math.pow(3, 2);
		System.out.println("numPow = "+numPow);
			
		double numRound = Math.round(6.45);
		System.out.println("numRound = "+numRound);
		
		double numFloor = Math.floor(8.9);
		System.out.println("numFloor = "+numFloor);
		
		double numCeil = Math.ceil(1.1);
		System.out.println("numCeil = "+numCeil);
		
		int numRandom = (int)(Math.random() * 15 + 18);	
		System.out.println("numRandom = "+numRandom);
		
	}
}	
