
public class Ejemplo2Bidimensional {
	
	public static void main (String[] args) {
		
		int [][] arrayBidimensional = {
										{23, 44, 67, 22},
										{55, 43, 33, 11},
										{42, 66, 31, 11}
										};
		int miVariable = arrayBidimensional [1][2];
		
		System.out.println(miVariable);
		
		arrayBidimensional [2][1] = 22;
		
		for (int i = 0; i< arrayBidimensional.length; i++) {
			for (int j=0; j<arrayBidimensional[i].length; j++) {
				
				System.out.println(arrayBidimensional[i][j]);
			}
			System.out.println("\n");
		}
	}
}


