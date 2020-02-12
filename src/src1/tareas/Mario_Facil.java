package src1.tareas;

import libs.Input;

public class Mario_Facil {

	public static void main(String[] args) {
		
		int n = get_positive_int();
				
		for(int i = 1; i <= n; i++) {
			dibujarRenglon(i, n);
		}

	}

	private static void dibujarRenglon(int renglon, int n) {
//		Input.print("Renglon " + i + "\n");
		int numEspacios = n -renglon;
		int numHashes = renglon + 1;
		dibujarEspacios(numEspacios);
		dibujarHashtags(numHashes);
	}

	private static void dibujarHashtags(int numHashes) {
		for(int i = 1; i <= numHashes; i++) {
			Input.print("#");
		}
		Input.print("\n");		
	}

	private static void dibujarEspacios(int numEspacios) {
		for(int i = 1; i <= numEspacios; i++) {
			Input.print(" ");
		}
		
	}
	
	public static int get_positive_int()
	{
	    int n;
	    do
	    {
	        Input.print("Input ladder steps: \n");
	        n = Input.get_int();
	        if(n < 0)
	        	Input.print("Please enter a positive number \n");
	        else if (n==0)
	        	Input.print("No ladder can be done with 0 steps\n");
	    }
	    while (n <= 0);
	    return n;
	}

}
