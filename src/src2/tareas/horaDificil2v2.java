/*
 * 1. Hacer una función que use el split con ":", que las separaciones se agreguen a un arreglo de
 *    strings y que verifique que dicho arreglo esta separado en 3 partes y si lo hace que
 *    mande llamar la función que transforme los strings en enteros.
 * 2. Hacer una función que cambie los valores strings a valores enteros en otro arreglo y que
 *    después mande llamar la función que verifica los valores que se transformaron.
 * 3. Hacer una función que verifique que las 3 partes del arreglo de enteros estén dentro de los
 * 	  límites de las horas (23 para horas y 59 para minutos y segundos).
 * 4. Imprimir    
 * 
 */


package src2.tareas;

import libs.Input;

public class horaDificil2v2 {
	
	public static int MIN_HMS = 0;
	public static int MAX_HR = 23;
	public static int MAX_MS = 59;
	public static int SEGMENT = 3;

	public static void main(String[] args) {
		Input.print("Por favor la hora: \n");
				
		String[] separacion = verifyLenght();
		int[] transTipos = transformTypes(separacion);
		verifyDigits(transTipos);
		printHour(transTipos);
		
	}

	private static void printHour(int[] transTipos) {
		int hr = transTipos[0];
		int mn = transTipos[1];
		int sg = transTipos[2];
		
		verifyPrintHour(hr);
		
		Input.print(mn + " minutos y " + sg + " segundos.");
	}

	private static void verifyPrintHour(int hr) {
		
		if (hr == 0 || hr >= 13 || hr <=23) {
			hr = hr - 12;
			Math.abs(hr);
			if (hr == 1) 
				Input.print("Es la " + hr + " PM con ");
			else 
				Input.print("Son las " + hr + " PM con ");				
		}
		else {
			if (hr == 1)
				Input.print("Es la " + hr + " AM con ");
			else 
				Input.print("Son las " + hr + " PM con ");
		}
	}

	private static String[] verifyLenght() {
		String hor = Input.get_string().trim();
		String[] dig = hor.split(":");
		
		if(dig.length == SEGMENT) {
			return dig;
		}
		else {
			Input.print("El formato de la hora es incorrecto.");
			System.exit(0);
		}
		return null;
	}

	private static int[] transformTypes(String[] digits) {
		int strngToInt[] = new int[digits.length];
		
		for(int i=0; i < digits.length; i++) {
			int n = Integer.parseInt(digits[i]);
			
			strngToInt[i] = n;			
		}		
		return strngToInt;
	}

	private static void verifyDigits(int[] strngToInt) {
		for(int i = 1; i < strngToInt.length; i++) {
			if (strngToInt[i] < MIN_HMS || strngToInt[i] > MAX_MS) {
				Input.print("El formato de la hora es incorrecto.");
				System.exit(0);
			}
		}
		if (strngToInt[0] > MAX_HR || strngToInt[0] < MIN_HMS) {
			Input.print("El formato de la hora es incorrecto.");
			System.exit(0);
		}	
	}
}