import java.util.*;
public class Adjoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Initialize Variables		
		int[][] Matrix = new int[3][3];
		int Add = 0, Sub = 0, Determinant = 0;
		int Diag1 = 1, Diag2 = 1, Diag3 = 1;
		
		Scanner in = new Scanner(System.in);

// Asking user for array		
		System.out.println("Input your array, row by row");
		for (int i = 0; i < 3; i++){
		   for (int j = 0; j < 3; j++){
			   Matrix[i][j] = in.nextInt();
		   }
			
		}
		
		in.close();
// Outputting the array	
		System.out.println("Your Array");
		for (int i = 0; i < 3; i++){
				   System.out.println(Matrix[i][0] + "  " + Matrix[i][1] + "  " + Matrix[i][2] + "  ");
				
		}
		
		
// Begin Calculating the Determinant Addition Side
		for (int k = 0; k < 3; k++){
			int i = k, j = i;	
				
				
				Diag1 *= Matrix[i][j];		 
		}
		
		for (int k = 0; k < 3; k++){
			int i = k, j = i+1;
			
			if (j >= 3){
				j -= 3;
			}
			Diag2 *= Matrix[i][j];
	}
		
		for (int k = 0; k < 3; k++){
			int i = k, j = i+2;
			
			if (j >= 3){
				j -= 3;
			}
			Diag3 *= Matrix[i][j];		 
	}
		Add = Diag1 + Diag2 + Diag3;
	
//		Begin Calculation the Determinant Subtraction Side		
	Diag1 = 1; Diag2 = 1 ; Diag3 = 1;
	int t = 2;
	
	for (int k = 0; k < 3; k++){
		int i = k, j = i+t;
		
		if (j <= -1){
			j += 3;
		}
		Diag1 *= Matrix[i][j];
		t-=2;
}
	t = 1;
	for (int k = 0; k < 3; k++){
		int i = k,j = i + t;
		
		if (j <= -1){
			j += 3;
		}
		Diag2 *= Matrix[i][j];
		t-=2;
}
	t = 0;
	for (int k = 0; k < 3; k++){
		int i = k, j = i + t;
		
		if (j <= -1){
			j += 3;
		}
		Diag3 *= Matrix[i][j];
		t-=2;
}
	
	Sub = Diag1 + Diag2 + Diag3;
	Determinant = Add - Sub;
	
	System.out.println("\nThe determinant = " + Add + " - " + Sub);
	System.out.println("\nWhich equals :" + Determinant);		
	}

}
